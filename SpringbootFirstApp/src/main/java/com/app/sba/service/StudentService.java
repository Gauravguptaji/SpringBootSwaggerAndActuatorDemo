package com.app.sba.service;

import java.util.Optional;

import com.app.sba.pojos.Student;

public interface StudentService {

	public Optional<Student> getStudentById(Integer id);

	public Student registerStudent(Student student);

	public void deleteStudent(Student student);

	public void updateStudent(Student s);

}
