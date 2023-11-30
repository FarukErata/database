package deneme.database.business.abstracts;

import deneme.database.entities.concretes.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAll();

    void insert(String name,String surname);

    void delete(int id);

    Optional<Product> getUser(int id);

    void update(int id,String name,String surname);

}
