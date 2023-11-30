package deneme.database.business.abstracts;

import deneme.database.model.AddressEntity;
import deneme.database.model.EntityDto;
import deneme.database.model.UsersRequest;
import org.apache.tomcat.jni.Address;

import java.util.List;


public interface IUser {
    List<EntityDto> getUsers();
    //void create(UsersEntity user, List<AddressEntity> adres);

    void create(EntityDto entityDto/*, List<AddressEntity> addressList*/);

    void delete(int id);

}
