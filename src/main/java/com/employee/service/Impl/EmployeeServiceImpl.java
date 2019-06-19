package com.employee.service.Impl;

import com.employee.dto.AddEmployeeRequest;
import com.employee.modal.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Shameera on Jun, 2019
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(AddEmployeeRequest request) {
		Employee employee = new Employee(request.getEmployeeId(),request.getFirstName(),request.getLastName(),request.getDepartment());
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public boolean updateEmployee(Integer id, AddEmployeeRequest request) {
		Optional<Employee> empById = employeeRepository.findById(id);
		if(empById.isPresent()){
			Employee employee = empById.get();
			employee.setEmployeeId(request.getEmployeeId());
			employee.setFirstName(request.getFirstName());
			employee.setLastName(request.getLastName());
			employee.setDepartment(request.getDepartment());
			employeeRepository.save(employee);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void deleteById(Integer id) {
		employeeRepository.delete(id);
	}
}
