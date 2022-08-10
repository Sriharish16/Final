package com.example.demo.controllers;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.direct.config.TopicExchangeConfig;
import com.example.demo.model.Student;

@RestController
public class TopicController {
	
	@Autowired
	@Qualifier("second")
	private AmqpTemplate template;

	@PostMapping(path="/topic/students")
	public String addStudent(@RequestBody Student entity) {
		
		String routekey="award.ece.2022";
		if(entity.getId()>200) {
			routekey="award.csc.2022"; 
		}
		template.convertAndSend(TopicExchangeConfig.EXCHANGE_NAME,routekey,entity);
		return "One Student Details Sent";
		
	}
	
}
