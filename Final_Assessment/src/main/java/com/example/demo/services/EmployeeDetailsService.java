package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.repo.EmployeeDetailsRepository;


@Service
public class EmployeeDetailsService {

	@Autowired
	private EmployeeDetailsRepository repo;
	
	public List<EmployeeDetails>findAll(){
		return this.repo.findAll();
	}
	
	public Optional<EmployeeDetails>findById(int id){
		return this.repo.findById(id);
		
	}
	
	public EmployeeDetails save(EmployeeDetails entity) {
		return this.repo.save(entity);
	
	}

	public int updateName(int id,String updatedName)
	{
		return this.repo.modifyName(id, updatedName);
	}
	
	public int updateDesignationId(int id, int id1) {
		
		return this.repo.modifyDesignationId(id, id1);
	}

public int updateDesignationDatOfBirth(int id, LocalDate date) {
		
		return this.repo.modifyDateOfBirth(id, date);
	}
	}

