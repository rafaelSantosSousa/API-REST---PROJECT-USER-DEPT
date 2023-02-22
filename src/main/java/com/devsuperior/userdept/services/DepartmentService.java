package com.devsuperior.userdept.services;

import com.devsuperior.userdept.domain.Department;
import com.devsuperior.userdept.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public List<Department> buscartdsdepartamentos() {
        return repository.findAll();
    }

    public Department inserirdepartment(Department department) {
        return repository.save(department);
    }

    public void deletarporid (Long id) {
        repository.deleteById(id);

    }
}