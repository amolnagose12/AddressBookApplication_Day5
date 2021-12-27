package com.bridgelabz.addressbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressBookAppDevelopmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressBookAppDevelopmentApplication.class, args);
		log.info("AddressBookApp  started");
	}

}