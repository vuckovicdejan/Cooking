package demo.cooking.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class cooking {

    public cooking() {

    }

    public cooking(String username, String password) {
        super();
        this.username = username;
        this.password = password;

    }


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Override
    public String toString() {
        return "cooking{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", recepti=" + recepti +
                '}';
    }

    public cooking(String username, String password, List<Recepti> recepti) {
        this.username = username;
        this.password = password;
        this.recepti = recepti;
    }

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "users", fetch = FetchType.EAGER, cascade = CascadeType.ALL)

    private List<Recepti> recepti;



    public void setId(Integer id) {
        this.id = id;
    }

    public List<Recepti> getRecepti() {
        return recepti;
    }

    public void setRecepti(List<Recepti> recepti) {
        this.recepti = recepti;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}