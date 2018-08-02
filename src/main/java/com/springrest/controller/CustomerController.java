package com.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entity.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@GetMapping("/all")
	public List<Customer> getCustomers(){
		
		ArrayList al= new ArrayList<>();
		al.add(new Customer());
		return new ArrayList<Customer>().addAll(c)
	}
	
}
