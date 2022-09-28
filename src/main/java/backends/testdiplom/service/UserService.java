package backends.testdiplom.service;

import backends.testdiplom.dto.CreateUserDto;
import backends.testdiplom.dto.NewPasswordDto;
import backends.testdiplom.dto.ResponseWrapperDto;
import backends.testdiplom.dto.UserDto;

public interface UserService {
    
    CreateUserDto addUser(CreateUserDto user);

    ResponseWrapperDto<UserDto> getUsers();

    UserDto updateUser(UserDto userDTO);

    NewPasswordDto setPassword(NewPasswordDto password);

    UserDto getUser(Integer id);

}
