package com.springframework.controllers;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.entity.Courses;


	@RequestMapping("/courses/")
	@RestController
	public class StudentsController{

		@PostMapping("insert")
		public Courses insertCourses(@RequestBody Courses  course) {
			
			System.out.println(course.getId());
			System.out.println(course.getName());
			System.out.println(course.getCode());
			
			StandardServiceRegistry s=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			Metadata meta =new MetadataSources(s).getMetadataBuilder().build();
			
			org.hibernate.SessionFactory sf = meta.getSessionFactoryBuilder().build();
			
		Session session= sf.openSession();
			Transaction t=session.beginTransaction();
			Courses c= new Courses(1,"java fullstack",12);
			
			session.save(c);
			t.commit();
			sf.close();
			session.close();
	return course;
		}}

