package com.example.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.repo.StudentRepositorty;

@RestController
public class StudentRestContoller {
	
	@Autowired
	private StudentRepositorty studentRepository;
	
	@DeleteMapping(value="/student/{sid}", produces="text/plain")
	public String deleteStudent(@PathVariable Integer sid) 
	{
		studentRepository.deleteById(sid);
		return "One Record Deleted...";
	}
	
	@PutMapping(value="/student", produces="text/plain", consumes="application/json")
	public String updateStudent(@RequestBody Student s) 
	{
		studentRepository.save(s);
		return "Record Updated...";
	}
	
	@PostMapping(value="/student",produces="text/plain", consumes="application/json")
	public String createStudent(@RequestBody Student s) 
	{
		studentRepository.save(s);
		return "Record Created...";
	}
	@GetMapping(value="/{sid}", produces="application/json")
	public Student getStudent(@PathVariable Integer sid) {
		Optional<Student> findById = studentRepository.findById(sid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null ;
	}
	@GetMapping(value="/student", produces="application/json")
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
}