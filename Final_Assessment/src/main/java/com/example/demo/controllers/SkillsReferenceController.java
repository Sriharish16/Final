package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SkillsReference;
import com.example.demo.services.SkillsReferenceService;

@RestController
@RequestMapping(path="api/v1/skills")
public class SkillsReferenceController {

	@Autowired
	private SkillsReferenceService service;
	
	@PostMapping
	public SkillsReference add(@RequestBody SkillsReference entity) {
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<SkillsReference>findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path="/{id}")
	public SkillsReference findById(@PathVariable("id")int id) {
		return this.service.findById(id).orElseThrow(()->new RuntimeException("Element Not Found"));
	
	}
	@GetMapping(path="/findBySkillName/{name}")
	public List<SkillsReference>findBySkillName(String name){
		return this.service.findByskillName(name);
	}

	
}
