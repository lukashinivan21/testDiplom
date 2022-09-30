package backends.testdiplom.repositories;

import backends.testdiplom.entities.CreateUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CreateUserRepository extends JpaRepository<CreateUser, String> {

    Optional<CreateUser> findCreateUserByPassword(String password);

}
