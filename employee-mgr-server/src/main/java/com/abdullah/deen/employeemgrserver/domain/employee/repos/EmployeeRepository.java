package com.abdullah.deen.employeemgrserver.domain.employee.repos;

import com.abdullah.deen.employeemgrserver.domain.employee.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {

    Optional<Employee> findByEmail(String email); //a safe way for the possibility of a value being present or not
}
