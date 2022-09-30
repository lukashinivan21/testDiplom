package backends.testdiplom.dto;

import lombok.Setter;

@Setter
public class UserDto {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Integer id;


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public Integer getId() {
        return this.id;
    }
}
