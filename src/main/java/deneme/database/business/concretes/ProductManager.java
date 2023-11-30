package deneme.database.business.concretes;

import deneme.database.business.abstracts.ProductService;
import deneme.database.dataAccess.abstracts.ProductDao;
import deneme.database.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductManager implements ProductService {




    @Autowired
    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll(){
        return this.productDao.findAll();

}

    @Override
    public void insert(String name,String surname){
        Product me = new Product();
        me.setSurname(surname);
        me.setName(name);
        productDao.save(me);


    }

    @Override
    public void delete(int id){
        productDao.deleteById(id);
    }

    @Override
    public Optional<Product> getUser(int id){
        return this.productDao.findById(id);
    }

    @Override
    public void update(int id,String name,String surname){
        Product me= productDao.findById(id).get();
        me.setName(name);
        me.setSurname(surname);
        productDao.save(me);
    }




}
