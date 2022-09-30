package backends.testdiplom.mappers;

import backends.testdiplom.dto.CreateUserDto;
import backends.testdiplom.entities.CreateUser;
import org.mapstruct.factory.Mappers;

public interface CreateUserMapper {

    CreateUserMapper INSTANCE = Mappers.getMapper(CreateUserMapper.class);

    CreateUserDto createUserToCreateUserDto(CreateUser user);

    CreateUser createUserDtoToCreateUser(CreateUserDto userDto);
}
