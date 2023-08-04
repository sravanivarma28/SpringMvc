package com.springframework.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.entity.Address;
import com.springframework.entity.Batch;
import com.springframework.entity.StudentsEntity;
	@RestController
	@RequestMapping("/studentarray/")
	
//	@PostMapping("/studentarray/")
//	public Students StudentDetails (@RequestBody StudentsEntity student ) {
//		return student;
//		
//	}
	
	public class StudentJson {
		@GetMapping("one")
		public StudentsEntity getStudent() {
			
			Address al=new Address("hyd",4-47/2,"telengana","india",506391);
			ArrayList<Batch> b =new ArrayList<Batch>();
			b.add(new Batch("java",1));
			b.add(new Batch("python",2));
	//SINGLE OBJECT
			 StudentsEntity s=new  StudentsEntity("sravani",78768488,"sravs@gmail.com",al,b);
			
			return s;
		}
		
		@GetMapping("two")
		public ArrayList getStudents() {
	// NESTED JSON
		ArrayList<StudentsEntity>a =new ArrayList();
		Address al=new Address("hyd",4-47/2,"telengana","india",506391);
		
		ArrayList<Batch> b =new ArrayList<Batch>();
		b.add(new Batch("java",1));
		b.add(new Batch("python",2));
		
// JSON ARRAY 
		a.add(new StudentsEntity("sravani",77687677,"sravs@gmail.com",al,b));
		a.add(new StudentsEntity("manasa",87766787,"manasa@gmail.com",al,b));
		a.add(new StudentsEntity("srivani",78748277,"srivani@gmail.com",al,b));
		a.add(new StudentsEntity("yaksha",98665643,"yaksha@gmail.com",al,b));
					 
			return a;
		}}

