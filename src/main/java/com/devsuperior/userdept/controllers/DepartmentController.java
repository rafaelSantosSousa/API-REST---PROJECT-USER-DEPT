package com.devsuperior.userdept.controllers;

import com.devsuperior.userdept.domain.Department;
import com.devsuperior.userdept.domain.User;
import com.devsuperior.userdept.repositories.DepartmentRepository;
import com.devsuperior.userdept.services.DepartmentService;
import com.devsuperior.userdept.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    @Autowired
    private DepartmentService service;

    @GetMapping
    public List<Department> findAll() {
        List<Department> result = service.buscartdsdepartamentos();
        return result;
    }
    @PostMapping
    public Department insert(@RequestBody Department department) {
        Department result = service.inserirdepartment(department);
        return result;
    }
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        service.deletarporid(id);
    }
}
