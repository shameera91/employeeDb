package com.employee;

import com.employee.modal.Department;
import com.employee.modal.Employee;
import com.employee.repository.DepartmentRepository;
import com.employee.repository.EmployeeRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Shameera on Jun, 2019
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepositoryTest {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void whenFindingAllCustomers_thenCorrect() {
		departmentRepository.save(new Department("DEP001","Science"));
		Department department = departmentRepository.findById(1).get();
		employeeRepository.save(new Employee("EMP001","Frank","Silva",department));
		Employee employee = employeeRepository.findById(1).get();
		Assert.assertEquals(employee.getFirstName(),"Frank");
	}
}
