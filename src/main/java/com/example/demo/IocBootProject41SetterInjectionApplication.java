package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.AppConfig;

//@SpringBootApplication
@Import(value = AppConfig.class)
public class IocBootProject41SetterInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGenerator generator=null;	
		//get IOC Container
		
		ctx=SpringApplication.run(IocBootProject41SetterInjectionApplication.class, args);
	
	
	System.out.println(ctx.getClass());
		
		//get Target Bean class obj
		generator=ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke method
		System.out.println("Wish Message ::"+generator.genrateWishMessage("Rajat"));
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}

	


