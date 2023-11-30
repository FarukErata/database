package deneme.database.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@Table(name="tablo2")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="ad")
    private String name;
    @Column(name="soyad")
    private String lastName;
    @Column(name="yaş")
    private String age;
    @Column(name="meslek")
    private String job;
    @Column(name="no")
    private String no;
    @Column(name="mail")
    private String mail;


    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private List<AddressEntity> address;

    public UsersEntity(int id, String name, String lastName, String age, String job, String no,
                       String mail, List<AddressEntity> address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
        this.no = no;
        this.mail = mail;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", job='" + job + '\'' +
                ", address='" + address + '\'' +
                ", no='" + no + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
