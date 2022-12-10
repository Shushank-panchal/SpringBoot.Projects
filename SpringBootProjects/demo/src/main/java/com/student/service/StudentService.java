package com.student.service;

import java.util.List;

import com.student.entity.Student;
import com.student.model.StudentDTO;

public interface StudentService
{
public String createStudent(Student student);
public StudentDTO updateStudent(int id,Student student);
public StudentDTO getStudentById(int id);
List<StudentDTO> getAllStudents();
String deleteStudentById(int id);
void deleteAllStudents();

}
