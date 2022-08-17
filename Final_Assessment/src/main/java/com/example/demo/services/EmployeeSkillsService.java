package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeSkills;
import com.example.demo.repo.EmployeeSkillsRepository;


@Service

public class EmployeeSkillsService {
	
	@Autowired
	private EmployeeSkillsRepository repo;

	public List<EmployeeSkills> findAll(){
		return this.repo.findAll();
	}
	
	public Optional<EmployeeSkills> findById(int id){
		return this.repo.findById(id);
		
	}
	
	public EmployeeSkills save(EmployeeSkills entity) {
		return this.repo.save(entity);

}
	public List<EmployeeSkills> findBySkillNameAndSkillExperience(String skillName,String Experience){
		return this.repo.findBySkillNameAndSkillExperience(skillName, Experience);
	}
	
	public List<EmployeeSkills>findByApprovedByOrStatus(String approved,String status){
		return this.repo.findByApprovedByOrStatus( approved, status);
	}
	
	public List<EmployeeSkills>updateByStatus(int id,String status){
		
		return this.repo.updateStatus(id, status);
		
	}
	
	public List<EmployeeSkills>findBySkillName(String name){
		return this.repo.findBySkillName(name);
	}
	
	public List<EmployeeSkills>findBySkillExperience(String experience){
		return this.repo.findBySkillExperience(experience);
	}
}
