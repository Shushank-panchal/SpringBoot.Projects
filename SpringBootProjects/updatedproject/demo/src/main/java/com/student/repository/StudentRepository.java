package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.student.entity.Student;
import com.student.model.StudentDTO;
//public interface StudentRepository extends CrudRepository<Student, Integer>  {
public interface StudentRepository extends JpaRepository<Student, Integer> {

	void save(StudentDTO studentById);
	
	@Query(" from Student where studentname =:s")
	List<Student> getStudentByName(@Param("s") String studentname);
	//@Query(" from Student where email =:s")
	//List<Student> getStudentByEmail(@Param("s") String email);
	@Query("from Student where lower(email) like :s%")
	List<Student> getStudentByEmail(@Param("s") String email);

}
