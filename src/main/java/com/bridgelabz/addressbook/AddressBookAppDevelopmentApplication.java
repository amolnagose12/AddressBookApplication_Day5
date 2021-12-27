package com.bridgelabz.addressbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressBookAppDevelopmentApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AddressBookAppDevelopmentApplication.class, args);
		log.info("Address Book App Started in {} Environment", context.getEnvironment().getProperty("environment"));
		log.info("Address Book DB User is {} Environment",
				context.getEnvironment().getProperty("spring.datasource.username"));
	}
}