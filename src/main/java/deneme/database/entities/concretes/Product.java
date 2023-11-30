package deneme.database.entities.concretes;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="Users")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="Name")
    private String name;

    @Column(name="Surname")
    private String surname;


    @Override
    public String toString() {
        return "User{" +
                ", name='" + name + '\'' +
                ", Surname=" + surname +
                '}';
    }

}
