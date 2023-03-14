package com.org.future;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.org.future.DesignPatteran.FactoryNotification;
import com.org.future.DesignPatteran.Notification;

@SpringBootApplication
public class FamilyFutureApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) 
	{
	return application.sources(FamilyFutureApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(FamilyFutureApplication.class, args);
		FactoryNotification fn=new FactoryNotification();
		Notification note=fn.getNotification("whatsups");
		note.notification();
		System.out.println("hello");
	}

}
