package backends.testdiplom.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "web_site_user")
public class WebSiteUser {

    @Id
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "user_first_name")
    private String firstName;

    @Column(name = "user_last_name")
    private String lastName;

    @Column(name = "user_phone")
    private String phone;

    @Column(name = "user_email")
    private String email;

    public WebSiteUser() {

    }

}
