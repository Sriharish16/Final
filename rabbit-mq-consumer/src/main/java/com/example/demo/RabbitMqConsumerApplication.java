package com.example.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitMqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqConsumerApplication.class, args);
	}
	@Bean
	public AmqpTemplate template() {
		
		CachingConnectionFactory factory = new CachingConnectionFactory();
		factory.setAddresses("http://");
		factory.setUsername("");
		factory.setPassword(null);
		
		return new RabbitTemplate(factory);
	}

}
