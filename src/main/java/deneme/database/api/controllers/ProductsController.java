package deneme.database.api.controllers;

import deneme.database.business.abstracts.ProductService;
import deneme.database.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductsController {

    @Autowired
    private ProductService productService;


    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAll")
    public List<Product> getAll(){
        return this.productService.getAll();
    }



    @PostMapping("/insert")
    public void Add(@RequestParam String name, @RequestParam String surname){
        productService.insert(name,surname);
    }

    @PostMapping("/delete")
    public void delete(@RequestParam int id){
        productService.delete(id);
    }

    @GetMapping("/find")
    public Optional<Product> getUser(@RequestParam int id){
       return this.productService.getUser(id);
    }

    @PostMapping("update")
    public void update(@RequestParam int id,@RequestParam String name, @RequestParam String surname){
        productService.update(id,name,surname);
    }



}
