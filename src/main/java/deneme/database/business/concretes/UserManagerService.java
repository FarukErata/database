package deneme.database.business.concretes;

import deneme.database.business.abstracts.IUser;
import deneme.database.dataAccess.abstracts.UserDao;
import deneme.database.mapper.UsersEntityDtoMapper;
import deneme.database.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserManagerService implements IUser {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UsersEntityDtoMapper usersEntityDtoMapper;

    @Autowired
    public UserManagerService(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public List<EntityDto> getUsers() {
        return this.userDao.findAll()
                .stream()
                .map(usersEntityDtoMapper)
                .collect(Collectors.toList());
    }




    @Override
    public void create(EntityDto entityDto/*,List<AddressEntity> adresList*/){

        /*AddressEntity adres= adresList.get(0);
        adres.setUsers(entityDto);
        adresList.add(adres);

        entityDto.setAddress(entityDto.getAddress());
        userDao.save(entityDto);*/
    }



    @Override
    public void delete(int id){
        userDao.deleteById(id);
    }

}
