package com.example.order.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.entity.Order;

@RestController
public class OrderController {

	@GetMapping("/order")
	public String hello() {
	return "hello chetan";	
	}
	
	@PostMapping("/order")
	public String ordrer(@RequestBody Order order) {
		System.out.println(order.getName());
	return "Put Responce";	
	}
	
	
	@PutMapping("/order/{id}")
	public String updateOrder(@PathVariable("id") int id) {
		System.out.println("ID ="+id);
		
	return "hello chetan";	
	}
	
	
}
