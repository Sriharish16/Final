package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@Entity
@Table(name="sri_Employee_Designation")
public class EmployeeDesignation {
	
	@Id
	@Column(name="emp_designation_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	int empDesignationId;

	@Column(name="emp_designation")
	String empDesignation;
	
}
