package backends.testdiplom.dto;

import lombok.Setter;

@Setter
public class NewPasswordDto {

    private String currentPassword;
    private String newPassword;

    public String getCurrentPassword() {
        return this.currentPassword;
    }

    public String getNewPassword() {
        return this.newPassword;
    }
}
