package backends.testdiplom.mappers.impl;

import backends.testdiplom.dto.CreateUserDto;
import backends.testdiplom.entities.CreateUser;
import backends.testdiplom.mappers.CreateUserMapper;
import org.springframework.stereotype.Service;

@Service
public class CreateUserMapperImpl implements CreateUserMapper {

    @Override
    public CreateUserDto createUserToCreateUserDto(CreateUser user) {
        CreateUserDto result = new CreateUserDto();
        result.setFirstName(user.getFirstName());
        result.setLastName(user.getLastName());
        result.setEmail(user.getEmail());
        result.setPhone(user.getPhone());
        result.setPassword(user.getPassword());
        return result;
    }

    @Override
    public CreateUser createUserDtoToCreateUser(CreateUserDto userDto) {
        CreateUser result = new CreateUser();
        result.setFirstName(userDto.getFirstName());
        result.setLastName(userDto.getLastName());
        result.setEmail(userDto.getEmail());
        result.setPhone(userDto.getPhone());
        result.setPassword(userDto.getPassword());
        return result;
    }
}
