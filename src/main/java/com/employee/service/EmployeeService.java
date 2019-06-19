package com.employee.service;

import com.employee.dto.AddEmployeeRequest;
import com.employee.modal.Employee;
import org.springframework.aop.target.LazyInitTargetSource;

import java.util.List;

/**
 * Created by Shameera on Jun, 2019
 */
public interface EmployeeService {

	Employee addEmployee(AddEmployeeRequest request);

	List<Employee> getAllEmployees();

	boolean updateEmployee(Integer id,AddEmployeeRequest request);

	void deleteById(Integer id);
}
