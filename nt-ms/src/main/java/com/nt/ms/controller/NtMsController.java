package com.nt.ms.controller;

import com.nt.ms.entity.Contact;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/nt-ms")
public class NtMsController {

	List<Contact> list = List.of(
			new Contact(1L, "amit@gmail.com", "Amit", 1311L),
			new Contact(2L, "anil@gmail.com", "Anil", 1311L),
			new Contact(3L, "rohan@gmail.com", "Rohan", 1312L),
			new Contact(4L, "sameer@gmail.com", "Sameer", 1314L)
	);



////////////// This Method returns response as Hello to the Requester ///////////////////////////
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String getData() {
		System.out.println("Returning data from nt-ms data method");
//		return  list.stream().collect(Collectors.toList());
		return "Hello from nt-ms microservice";
		                  ////// The response can also be a list or Json data or any other object
	}


}