package backends.testdiplom.service.impl;

import backends.testdiplom.dto.CreateUserDto;
import backends.testdiplom.dto.NewPasswordDto;
import backends.testdiplom.dto.ResponseWrapperDto;
import backends.testdiplom.dto.UserDto;
import backends.testdiplom.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public CreateUserDto addUser(CreateUserDto user) {
        CreateUserDto createUser = new CreateUserDto();
        createUser.setFirstName(user.getFirstName());
        createUser.setLastName(user.getLastName());
        createUser.setEmail(user.getEmail());
        createUser.setPhone(user.getPhone());
        createUser.setPassword(user.getPassword());
        return createUser;
    }

    @Override
    public ResponseWrapperDto<UserDto> getUsers() {
        List<UserDto> list = new ArrayList<>();
        list.add(new UserDto());
        Integer count = list.size();
        ResponseWrapperDto<UserDto> response = new ResponseWrapperDto<>();
        response.setCount(count);
        response.setList(list);
        return response;
    }

    @Override
    public UserDto updateUser(UserDto userDTO) {
        return userDTO;
    }

    @Override
    public NewPasswordDto setPassword(NewPasswordDto password) {
        return password;
    }

    @Override
    public UserDto getUser(Integer id) {
        UserDto userDTO = new UserDto();
        userDTO.setFirstName("John");
        userDTO.setLastName("Cage");
        userDTO.setPhone("145");
        userDTO.setEmail("johnyCage@gmail.com");
        userDTO.setId(id);
        return userDTO;
    }
}
