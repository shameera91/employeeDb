package com.employee.repository;

import com.employee.modal.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Shameera on Jun, 2019
 */
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

	Optional<Department>findById(Integer id);
}
