package com.devsuperior.userdept.services;

import com.devsuperior.userdept.domain.User;
import com.devsuperior.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> buscartdsusuarios(){
        return repository.findAll();
    }

    public User procurarpeloid(Long id){
        return repository.findById(id).get();

    }

    public User inserirusuario (User user) {
        return repository.save(user);
    }

    public void deletarporid (Long id) {
        repository.deleteById(id);

    }
}
