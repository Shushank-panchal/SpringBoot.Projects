package com.student.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.model.StudentDTO;
import com.student.service.StudentService;

import com.student.util.Converter;

@RestController
public class StudentController {
  @Autowired(required=true)
	private StudentService studentservice;
  @Autowired
   private Converter converter;
  @PostMapping("/createStudent")
   public String createStudent(@RequestBody StudentDTO studentdto)
   {
	 final Student student= converter.convertToEntity(studentdto);
	 return studentservice.createStudent(student);
   }
  
  @PutMapping("/updateStudent/{identity}")
  public StudentDTO updateStudent(@PathVariable("identity") int id, @RequestBody StudentDTO studentdto)
  {
	  Student student1= converter.convertToEntity(studentdto);
	  return studentservice.updateStudent(id, student1);
  }
  @GetMapping("/getStudentByID/{identity}")
  public StudentDTO getStudentById(@PathVariable("identity") int id)
  {
  	//Student student2=converter.convertToStudentDTO(studentdto);
  return studentservice.getStudentById(id);
  	
  }
  @GetMapping("/getAllStudents")
  public List<StudentDTO> getAllStudents()
  {
  	return studentservice.getAllStudents();
  }
  @DeleteMapping("/deleteStudentById/{id}")
  public String deleteStudentById(@PathVariable("id") int id)
  {
  	return studentservice.deleteStudentById(id);
  	
  }
  @DeleteMapping("/deleteAllStudents")
  public void deleteAllStudents()
  {
  	studentservice.deleteAllStudents();
  	//return new ResponseEntity<String>("All Details of"+" students has been deleted",
			//HttpStatus.OK);
  }

  
}

 
