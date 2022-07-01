package com.zensar.springbootDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
	 public ErrorResponse( String message) {
		super();
	}
	 
}
