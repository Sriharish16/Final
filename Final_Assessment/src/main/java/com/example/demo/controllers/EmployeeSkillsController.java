package com.example.demo.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeSkills;
import com.example.demo.services.EmployeeSkillsService;

@RestController
@RequestMapping(path="api/v1/empskills")
public class EmployeeSkillsController {

	
	@Autowired
	private EmployeeSkillsService service;
	
	@PostMapping
	public EmployeeSkills add(@RequestBody EmployeeSkills entity) {
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<EmployeeSkills>findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path="/{id}")
	public EmployeeSkills findById(@PathVariable("id")int id) {
		return this.service.findById(id).orElseThrow(()->new RuntimeException("Element Not Found"));
	}
	
	 
	 @GetMapping(path="/nameandexp/{name}/{experience}")
		public List<EmployeeSkills> findBySkillNameAndExperience(@PathVariable("name")String name, @PathVariable("experience") String experience) {
			return this.service.findBySkillNameAndSkillExperience(name, experience);
		}
	 
	 @GetMapping(path="/approveandstatus/{approve}/{status}")
	 public List<EmployeeSkills>findByApprovedByOrStatus(@PathVariable("approve")String approve,String status){
		 return this.service.findByApprovedByOrStatus(approve, status);
	 }
	 @PutMapping(path ="/status/{id}/{status}")
	    public ResponseEntity<String> updateDesignationDateOfBirth(@PathVariable("id")int id,@PathVariable("status")String status){
	   	List<EmployeeSkills> rowsUpdated=this.service.updateByStatus(id, status);
	   	return ResponseEntity.status(HttpStatus.OK).body("Draft");
	   	 
	    }
	 @GetMapping(path="/experience/{experience}")
	 public List<EmployeeSkills>findBySkillExperience(@PathVariable("experience")String experience){
		 return this.service.findBySkillExperience(experience);
	 }
	@GetMapping(path="/skillname/{skillname}")
	public List<EmployeeSkills>findBySkillName(@PathVariable("skillname")String name){
		return this.service.findBySkillName(name);
	}
}
