package com.employee.repository;

import com.employee.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.expression.spel.ast.OpAnd;

import java.util.Optional;

/**
 * Created by Shameera on Jun, 2019
 */
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	Optional<Employee>findById(Integer id);
}
