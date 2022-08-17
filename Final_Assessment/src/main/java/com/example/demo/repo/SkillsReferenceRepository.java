package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SkillsReference;

@Repository
public interface SkillsReferenceRepository extends JpaRepository<SkillsReference, Integer> {

	
	public List<SkillsReference>findBySkillName(String skillname);
}
