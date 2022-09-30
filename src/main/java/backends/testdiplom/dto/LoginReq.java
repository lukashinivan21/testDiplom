package backends.testdiplom.dto;

public class LoginReq {

    private String password;
    private String username;

    public LoginReq() {
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LoginReq;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LoginReq)) return false;
        final LoginReq other = (LoginReq) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        return result;
    }

    public String toString() {
        return "LoginReq(password=" + this.getPassword() + ", username=" + this.getUsername() + ")";
    }
}
