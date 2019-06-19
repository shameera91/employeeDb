package com.employee.modal;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Shameera on Jun, 2019
 */
@Entity
@Table(name = "employee")
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String employeeId;
	private String firstName;
	private String lastName;

	@ManyToOne
	private Department department;

	public Employee(){}

	public Employee(String employeeId,String firstName,String lastName,Department department){
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

}
