package backends.testdiplom.mappers;

import backends.testdiplom.dto.UserDto;
import backends.testdiplom.entities.WebSiteUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto userToUserDto(WebSiteUser siteUser);

    WebSiteUser userDtoToSiteUser(UserDto userDto);


}
