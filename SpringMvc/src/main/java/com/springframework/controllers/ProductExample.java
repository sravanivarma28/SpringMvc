package com.springframework.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.entity.Products;

@RestController
@RequestMapping("/product/")

public class ProductExample {
	@PostMapping("insert")
	public int productInsert(@RequestBody Products p) throws Exception {
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","");
		Statement s=c.createStatement();
		
		String query ="INSERT INTO products VALUES(1,'laptop',70000)";
		int result=s.executeUpdate(query);
	System.out.println(result);
	
		return result;
	}}
