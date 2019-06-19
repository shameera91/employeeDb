package com.employee.modal;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Shameera on Jun, 2019
 */
@Entity
@Table(name = "department")
@Data
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String departmentId;
	private String departmentName;

	public Department(){}

	public Department(String departmentId,String departmentName){
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		}
}
