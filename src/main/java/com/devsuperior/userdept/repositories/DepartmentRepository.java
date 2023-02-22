package com.devsuperior.userdept.repositories;

import com.devsuperior.userdept.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository <Department , Long> {

}
