package backends.testdiplom.service;

import backends.testdiplom.dto.RegisterReq;
import backends.testdiplom.dto.Role;

public interface AuthService {

    boolean login(String username, String password);

    boolean register(RegisterReq registerReq, Role role);

}
