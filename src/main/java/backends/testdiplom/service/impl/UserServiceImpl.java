package backends.testdiplom.service.impl;

import backends.testdiplom.dto.CreateUserDto;
import backends.testdiplom.dto.NewPasswordDto;
import backends.testdiplom.dto.ResponseWrapperDto;
import backends.testdiplom.dto.UserDto;
import backends.testdiplom.entities.CreateUser;
import backends.testdiplom.entities.WebSiteUser;
import backends.testdiplom.mappers.CreateUserMapper;
import backends.testdiplom.mappers.UserMapper;
import backends.testdiplom.repositories.CreateUserRepository;
import backends.testdiplom.repositories.WebSiteUserRepository;
import backends.testdiplom.service.UserService;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(UserServiceImpl.class);
    private final WebSiteUserRepository userRepository;
    private final CreateUserRepository createUserRepository;
    private final CreateUserMapper userMapper;

    public UserServiceImpl(WebSiteUserRepository userRepository, CreateUserRepository createUserRepository,
                           CreateUserMapper userMapper) {
        this.userRepository = userRepository;
        this.createUserRepository = createUserRepository;
        this.userMapper = userMapper;
    }

    @Override
    public CreateUserDto addUser(CreateUserDto user) {
        log.info("Addition createUser with firstname {}; with lastname {}; with phone {}; with email {}", user.getFirstName(), user.getLastName(),
                user.getPhone(), user.getEmail());
        CreateUser createUser = userMapper.createUserDtoToCreateUser(user);
        CreateUser result = createUserRepository.save(createUser);
        return userMapper.createUserToCreateUserDto(result);
    }

    @Override
    public ResponseWrapperDto<UserDto> getUsers() {
        log.info("Request for getting list of all users");
        List<WebSiteUser> siteUsers = userRepository.findAll();
        List<UserDto> result = new ArrayList<>();
        for (WebSiteUser siteUser : siteUsers) {
            result.add(UserMapper.INSTANCE.userToUserDto(siteUser));
        }
        ResponseWrapperDto<UserDto> responseWrapperDto = new ResponseWrapperDto<>();
        responseWrapperDto.setCount(result.size());
        responseWrapperDto.setList(result);
        return responseWrapperDto;
    }

    @Override
    public UserDto updateUser(UserDto userDTO) {
        log.info("Request for updating user");
        Optional<WebSiteUser> optionalWebSiteUser = userRepository.findWebSiteUserById(userDTO.getId());
        if (optionalWebSiteUser.isEmpty()) {
            return  null;
        } else {
            WebSiteUser siteUser = UserMapper.INSTANCE.userDtoToSiteUser(userDTO);
            WebSiteUser result = userRepository.save(siteUser);
            return UserMapper.INSTANCE.userToUserDto(result);
        }
    }

    @Override
    public NewPasswordDto setPassword(NewPasswordDto password) {
        log.info("Request for change password");
        Optional<CreateUser> userOptional = createUserRepository.findCreateUserByPassword(password.getCurrentPassword());
        if (userOptional.isEmpty()) {
            return null;
        } else {
            CreateUser result = userOptional.get();
            result.setPassword(password.getNewPassword());
            createUserRepository.save(result);
            return password;
        }
    }

    @Override
    public UserDto getUser(Integer id) {
        log.info("Request for getting info about user with id {}", id);
        Optional<WebSiteUser> siteUser = userRepository.findWebSiteUserById(id);
        return siteUser.map(UserMapper.INSTANCE::userToUserDto).orElse(null);
    }
}
