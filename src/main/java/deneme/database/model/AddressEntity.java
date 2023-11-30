package deneme.database.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="adres")
public class AddressEntity {

    public AddressEntity(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="il")
    private String il;
    @Column(name="ilçe")
    private String ilce;
    @Column(name="mahalle")
    private String mahalle;
    @Column(name="sokak")
    private String sokak;
    @Column(name="cadde")
    private String cadde;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = UsersEntity.class)
    @JoinColumn(name = "users_id",referencedColumnName = "id")
    private UsersEntity users;


}
