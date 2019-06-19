package com.employee.controller;

import com.employee.constants.Constants;
import com.employee.dto.AddEmployeeRequest;
import com.employee.dto.ApiResponse;
import com.employee.modal.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Shameera on Jun, 2019
 */

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public ResponseEntity<?> addEmployee(@RequestBody AddEmployeeRequest request){
		employeeService.addEmployee(request);
		return new ResponseEntity<>(new ApiResponse(false,Constants.SUCCESS),HttpStatus.OK);
	}

	@GetMapping("/getAllEmployees")
	public ResponseEntity<?> getAllEmployees(){
		List<Employee> allEmployees = employeeService.getAllEmployees();
		return new ResponseEntity<>(new ApiResponse(allEmployees,false,Constants.SUCCESS),HttpStatus.OK);
	}

	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<?> updateEmployeeById(@PathVariable Integer id,@RequestBody AddEmployeeRequest request){
		boolean result = employeeService.updateEmployee(id, request);
		if(result){
			return new ResponseEntity<>(new ApiResponse(false,Constants.SUCCESS),HttpStatus.OK);
		}else{
			return new ResponseEntity<>(new ApiResponse(true,Constants.FAILED),HttpStatus.OK); /* not updated*/
		}
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable Integer id){
		employeeService.deleteById(id);
		return new ResponseEntity<>(new ApiResponse(false,Constants.SUCCESS),HttpStatus.OK);
	}
}
