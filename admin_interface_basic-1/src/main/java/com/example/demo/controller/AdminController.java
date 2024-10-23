package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AdminService;
@RestController
@RequestMapping("/admin")
@CrossOrigin(origins="http://localhost:4200")
public class AdminController {
	@Autowired
	AdminService ser;
	
	//log in page 
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestParam("admin_name") String admin_name,@RequestParam("admin_password") String admin_password)
	{
		if(ser.login(admin_name, admin_password)==true) {
			return new ResponseEntity<String>("Welcome to Profile "+admin_name,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Sorry, Invalid ",HttpStatus.BAD_REQUEST);
		}
	}
}
