package com.example.demo.crudrepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeSkills;

@Repository
public class EmployeeSkillsCrud implements CrudRepository<EmployeeSkills> {


		private JdbcTemplate jdbcTemplate;
		
		
	 @Autowired
		public EmployeeSkillsCrud(JdbcTemplate jdbcTemplate) {
			super();
			this.jdbcTemplate = jdbcTemplate;
		}

		@Override
		public int add(EmployeeSkills skills) {
			String sql="insert into sri_Employee_Skills values(?,?,?,?,?,?,?,?,?,?)";
			return this.jdbcTemplate.update(sql,skills.getEmpSkillsId(),skills.getSkillId(),skills.getSkillName(),skills.getSkillExperience(),skills.getStatus(),skills.getApprovedBy(),skills.getApprovedDate(),skills.getModifiedDate());
		}

		@Override
		public List<EmployeeSkills> findAll() {
		
			String sql="select * from sri_Employee_Skills";
			return this.jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(EmployeeSkills.class));
		}

		@Override
		public int update(EmployeeSkills skills) {
			
			String sql="update sri_Employee_Skills set skillName=? where employeeId=?";
			
			return this.jdbcTemplate.update(sql,skills.getSkillName(),skills.getEmpId());
		}

	}

	

