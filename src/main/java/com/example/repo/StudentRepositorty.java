package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Student;

public interface StudentRepositorty extends JpaRepository<Student,Integer>{

}
