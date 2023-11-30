package deneme.database.model;

import lombok.Data;

import java.util.List;

@Data
public class EntityDto {
    private String name;
    private String lastName;
    private String age;
    private String job;
    private String no;
    private String mail;
    private List<AddressEntity> address;
}
