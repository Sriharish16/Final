package com.example.demo.crudrepo;

import java.util.List;

public interface CrudRepository<T> {

		public int add(T t);
		public List<T> findAll();
		public int update(T t);
		
	}

