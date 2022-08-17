package com.example.demo.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.services.EmployeeDetailsService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/v1/employeedetails")
public class EmployeeDetailsController {
	
	@Autowired
	private EmployeeDetailsService service;
	
	@PostMapping
	public EmployeeDetails add(@RequestBody EmployeeDetails entity) {
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<EmployeeDetails>findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path="/{id}")
	public EmployeeDetails findById(@PathVariable("id")int id) {
		return this.service.findById(id).orElseThrow(()->new RuntimeException("Element Not Found"));
	}
	
	 @PutMapping(path ="/update/{id}/{name}")
	    public ResponseEntity<String> updateName(@PathVariable("id")int id,@PathVariable("name")String updatedName){
	   	int rowsUpdated=this.service.updateName(id, updatedName);
	   	return ResponseEntity.status(HttpStatus.OK).body(rowsUpdated+"updated");
	   	 
	    }
	 
	 @PutMapping(path ="/updatedesig/{id}/{updateDesignationId}")
	    public ResponseEntity<String> updateDesignationId(@PathVariable("id")int id,@PathVariable("updateDesignationId")int updatedId){
	   	int rowsUpdated=this.service.updateDesignationId(id ,updatedId);
	   	return ResponseEntity.status(HttpStatus.OK).body(rowsUpdated+"updated");
	   	 
	    }
	 @PutMapping(path ="/updatedob/{id}/{updateDesignationDateOfBirth}")
	    public ResponseEntity<String> updateDesignationDateOfBirth(@PathVariable("id")int id,@PathVariable("updateDesignationDateOfBirth")LocalDate dateOfBirth){
	   	int rowsUpdated=this.service.updateDesignationDatOfBirth(id, dateOfBirth);
	   	return ResponseEntity.status(HttpStatus.OK).body(rowsUpdated+"Successfully updated");
	   	 
	    }
	 
	 


}
