package com.example.demo.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.EmployeeSkills;

@Repository
public interface EmployeeSkillsRepository extends JpaRepository<EmployeeSkills, Integer>  {
	
	public List<EmployeeSkills>findBySkillName(String skill);
	public List<EmployeeSkills>findBySkillExperience(String experience);
	
	 @Query(value="from EmployeeSkills where skillName=:name and skillExperience=:experience", nativeQuery = true)
	 public List<EmployeeSkills> findBySkillNameAndSkillExperience(@Param("name")String skillName,@Param("experience") String skillExperience);



	 @Query(value="from EmployeeSkills where approvedBy=:approve and status=:status", nativeQuery = true)
	 public List<EmployeeSkills>findByApprovedByOrStatus(@Param("approve")String approvedBy,@Param("status")String status );

	 
	 @Query(value="update EmployeeSkills set status=:status where skillId=:srchId")
		@Modifying
		@Transactional
		List<EmployeeSkills> updateStatus(@Param("srchId") int skillId,@Param("status") String status);
		
}

