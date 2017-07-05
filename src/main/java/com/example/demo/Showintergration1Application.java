package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.core.MessagingTemplate;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.SubscribableChannel;

@SpringBootApplication
@ImportResource("ex1.xml")
public class Showintergration1Application {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext factory = SpringApplication.run(Showintergration1Application.class, args);
		
		
//		SubscribableChannel qc = factory.getBean("c2", SubscribableChannel.class);
//		SubscribableChannel qc1 = factory.getBean("c1", SubscribableChannel.class);
	//	qc1.subscribe(System.out::println);
		/**
		
		
//		Message<String> msg = MessageBuilder.withPayload("hello integration").build();
//		Message<String> msg2 = MessageBuilder.withPayload("HELLO WORLD").build();
		
		MessagingTemplate mt = new MessagingTemplate();
		mt.setBeanFactory(factory);
		mt.convertAndSend("c2", -50);
		mt.convertAndSend("c2", "90");
		
//		qc.send(msg);
//		qc.send(msg2);
		System.out.println("sent msg!!!");
		
		*/
		
		
		
		
		
	}
}
