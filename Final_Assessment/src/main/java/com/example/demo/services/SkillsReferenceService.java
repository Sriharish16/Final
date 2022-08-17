package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SkillsReference;
import com.example.demo.repo.SkillsReferenceRepository;

@Service
public class SkillsReferenceService {
	
	@Autowired
	private SkillsReferenceRepository repo;
	
	public List<SkillsReference> findAll(){
		return this.repo.findAll();
	}
	
	public Optional<SkillsReference> findById(int id){
		return this.repo.findById(id);
		
	}
	
	public SkillsReference save(SkillsReference entity) {
		return this.repo.save(entity);

}
	public List<SkillsReference>findByskillName(String skillname){
		return this.repo.findBySkillName(skillname);
	}
	
}
