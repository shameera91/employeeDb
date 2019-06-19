package com.employee.dto;

import com.employee.modal.Department;
import lombok.Data;

/**
 * Created by Shameera on Jun, 2019
 */
@Data
public class AddEmployeeRequest {

	private String employeeId;
	private String firstName;
	private String lastName;
	private Department department;
}
