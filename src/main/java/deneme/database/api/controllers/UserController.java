package deneme.database.api.controllers;

import deneme.database.business.abstracts.IUser;
import deneme.database.business.concretes.UserManagerService;
import deneme.database.model.EntityDto;
import deneme.database.model.UsersEntity;
import deneme.database.model.UsersRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private IUser IUser;
    @Autowired
    private UserManagerService service;

    @Autowired
    public UserController(IUser IUser) {
        this.IUser = IUser;
    }

    @GetMapping("/getall")
    public List<EntityDto> getUsers() {
        return this.IUser.getUsers();
    }

    @PostMapping("/create")
    public void create(@RequestBody EntityDto entityDto) {
        service.create(entityDto);

    }

    @PostMapping("/delete")
    public void delete(@RequestParam int id){
        IUser.delete(id);
    }


}