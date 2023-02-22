package com.devsuperior.userdept.controllers;

import com.devsuperior.userdept.domain.User;
import com.devsuperior.userdept.repositories.UserRepository;
import com.devsuperior.userdept.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @Autowired
    private UserService service;
    @GetMapping
    public List<User> findAll() {
        List<User> result = service.buscartdsusuarios();
        return result;
    }

    /*A anotação get é utilizada para procurar ID,name e etc
    Já o post serve para salvar*/
    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        User result = service.procurarpeloid(id);
        return result;
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        User result = service.inserirusuario(user);
        return result;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        service.deletarporid(id);
    }
}
