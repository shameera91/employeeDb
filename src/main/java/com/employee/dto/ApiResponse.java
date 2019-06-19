package com.employee.dto;

import lombok.Data;

/**
 * Created by Shameera on Jun, 2019
 */
@Data
public class ApiResponse {

	private Object data;
	private Boolean error;
	private String message;

	public ApiResponse() {

	}

	public ApiResponse(Boolean error, String message) {
		this.error = error;
		this.message = message;
	}

	public ApiResponse(Object data, Boolean error, String message) {
		this.data = data;
		this.error = error;
		this.message = message;
	}
}
