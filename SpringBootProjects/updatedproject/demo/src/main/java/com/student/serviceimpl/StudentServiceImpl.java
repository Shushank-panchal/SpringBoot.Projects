package com.student.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Address;
import com.student.entity.Student;
import com.student.model.StudentDTO;
import com.student.repository.AddressRepository;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;
import com.student.util.Converter;


@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
public StudentRepository studentrepository;
	
	@Autowired
	public Converter converter;
	
	@Autowired
	 private AddressRepository addressrepository;
	
	@Override
	public String createStudent(Student student) {
		String message = null;
		studentrepository.save(student);
		if(student!=null)
		{
			message = "Student details saved successfully";
		}
		return message;
	}

	@Override
	public StudentDTO updateStudent(int id, Student student) {
		Student existingStudent = studentrepository.findById(id).get();
		existingStudent.setStudentname(student.getStudentname());
		existingStudent.setPhno(student.getPhno());
		existingStudent.setEmail(student.getEmail());
		
		studentrepository.save(existingStudent);
		return Converter.convertToStudentDTO(existingStudent);
		
	}
    
	public List<StudentDTO>  getAllStudents()
	{
		List <Student> students= studentrepository.findAll();
		List<StudentDTO> sdto = new ArrayList<>();
		for(Student s:students)
		{
			sdto.add(Converter.convertToStudentDTO(s));
		}
		return sdto;
		
		}

	@Override
	public StudentDTO getStudentById(int id)
	{
	Student getStudentById= studentrepository.findById(id).get();
   //studentrepository.save(getStudentById(1));
	return Converter.convertToStudentDTO(getStudentById);
	}


	  @Override
	     public  String deleteStudentById(int id)
	     {
	    	 String message= null;
	    	 Optional<Student> student=studentrepository.findById(id);
	    	 if(student.isPresent())
	    	 {
	    		 studentrepository.deleteById(id);
	    		 message="student details delete successfully";
	    	 }
	    	 else
	    	 {
	    		 message="Student details not found";
	    	 }
	    	 return message;
	     }
	  
	      @Override
	     public void deleteAllStudents()
	     {
	    	 studentrepository.deleteAll();
	     }
	      
	      @Override
	      public List<StudentDTO> getStudentByName(String studentname) {
	      	List<Student> students = studentrepository.getStudentByName(studentname);
	      	List<StudentDTO> studentdto = new ArrayList<>();
	      	for(Student s: students)
	      	{
	      		studentdto.add(Converter.convertToStudentDTO(s));
	      	}
	      		return studentdto;

  }

	
		@Override
		public List<StudentDTO> getStudentByEmail(String email) {
			List<Student> students = studentrepository.getStudentByEmail(email);
			List<StudentDTO> studentdto = new ArrayList<>();
			for(Student s:students)
			{
				studentdto.add(Converter.convertToStudentDTO(s));
			}
			return studentdto;
		}

		@Override
		public StudentDTO assignAddressToStudent(int id, int AddressId) {
			Student student = studentrepository.findById(id).get();
			Address address = addressrepository.findById(id).get();
			student.setAddress(address);
			studentrepository.save(student);
			return Converter.convertToStudentDTO(student);
		}
		
}