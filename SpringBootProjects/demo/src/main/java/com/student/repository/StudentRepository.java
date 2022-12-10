package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Student;
import com.student.model.StudentDTO;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	void save(StudentDTO studentById);


}
