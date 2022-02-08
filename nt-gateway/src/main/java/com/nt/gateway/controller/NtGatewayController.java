package com.nt.gateway.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/requester")
public class NtGatewayController {
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	Environment env;
	
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String getData() {
		System.out.println("Returning data from nt-gateway own data method");
		return "Hello from NT-GATEWAY-data method";
	}
	
	@RequestMapping(value = "/nt-msservice", method = RequestMethod.GET)
	public String getMsData() {
		System.out.println("inside ms-data method");
		try {
			String msEndpoint = env.getProperty("endpoint.ms-service"); // getting endpoint of another service from yml file
			System.out.println(" Endpoint name : [" + msEndpoint + "]");
			
			return restTemplate.getForObject(new URI(msEndpoint), String.class);  //// returning response to the browser
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "Exception occurred.. so, returning default data";
	}
}
