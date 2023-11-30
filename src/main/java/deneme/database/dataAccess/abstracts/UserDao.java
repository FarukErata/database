package deneme.database.dataAccess.abstracts;

import deneme.database.model.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UsersEntity,Integer> {


}
