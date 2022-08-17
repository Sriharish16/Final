package com.example.demo.entity;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

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
@Table(name="sri_employee_details")
public class EmployeeDetails {
	
	@Id
	@Column(name="emp_id")
	int empId;
	
	@Column(name="emp_name")
	String empName;
	
	@Column(name="emp_designation_id")
	int empDesignationId;   
	///need to update
	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "emp_id", referencedColumnName = "emp_designation_id")
	  EmployeeDesignation employeeDesignation;
	
	
	@Column(name="emp_doj")
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate empDoj;
	

}
