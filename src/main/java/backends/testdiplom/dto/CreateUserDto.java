package backends.testdiplom.dto;

import lombok.Data;

@Data
public class CreateUserDto {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String password;
}
