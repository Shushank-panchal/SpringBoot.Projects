package com.student.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.student.entity.Student;
import com.student.model.StudentDTO;

@Component
public class Converter
{
//convert StudentDTO to Student
	public Student convertToEntity(StudentDTO studentdto)
	{
		Student student = new Student();
		if(studentdto!=null)
		{
		BeanUtils.copyProperties(studentdto, student);	
		}
		return student;
	}
	//convert StudentDTO To Entity(Student)
	public static StudentDTO convertToStudentDTO(Student student)
	{
		StudentDTO studentdto = new StudentDTO();
		if(student!=null)
		{
			BeanUtils.copyProperties(student, studentdto);
		}
		return studentdto;
	}
	
	}
	
