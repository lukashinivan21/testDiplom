package backends.testdiplom.repositories;

import backends.testdiplom.entities.WebSiteUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WebSiteUserRepository extends JpaRepository<WebSiteUser, Integer> {

    Optional<WebSiteUser> findWebSiteUserById(Integer id);

}
