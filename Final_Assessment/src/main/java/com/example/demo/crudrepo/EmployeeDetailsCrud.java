package com.example.demo.crudrepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeDetails;
@Repository
public class EmployeeDetailsCrud implements CrudRepository<EmployeeDetails> {


		private JdbcTemplate jdbcTemplate;

		@Autowired
		public EmployeeDetailsCrud(JdbcTemplate jdbcTemplate) {
			super();
			this.jdbcTemplate = jdbcTemplate;
		}

		@Override
		public int add(EmployeeDetails t) {
			
			String sql="insert into sri_employee_details values(?,?,?,?)";
		return	this.jdbcTemplate.update(sql,t.getEmpId(),t.getEmpName(),t.getEmployeeDesignation(),t.getEmpDoj());
			
		}

		@Override
		public List<EmployeeDetails> findAll() {
			
		  String sql="select * from sri_employee_details";
		return jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(EmployeeDetails.class));		  
		}

		@Override
		public int update(EmployeeDetails t) {
			// TODO Auto-generated method stub
String sql="update sri_employee_details set skillName=? where employeeId=?";
			
			return this.jdbcTemplate.update(sql,t.getEmpName(),t.getEmpId());
		}
		

	}

