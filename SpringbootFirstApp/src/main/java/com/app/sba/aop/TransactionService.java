package com.app.sba.aop;

import java.util.Optional;

import javax.validation.ValidationException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.app.sba.pojos.Student;
import com.app.sba.service.StudentService;

@Configuration
@Aspect
public class TransactionService {

	@Autowired
	private StudentService service;

	@Pointcut(value = "execution(* com.app.sba.controller.StudentController.del*(..))")
	public void methodForDelete() {

	}

	@Pointcut(value = "execution(* com.app.sba.controller.StudentController.get*(..))")
	public void methodForgetting() {

	}

	@Before(value = "methodForDelete()")
	public void transactionBegin(JoinPoint jp) {
		Integer studentId = null;
		Student s = new Student();
		Object obj[] = jp.getArgs();
		studentId = (Integer) obj[0];
		Optional<Student> st = service.getStudentById(studentId);
		if (!st.isPresent())
			throw new ValidationException(" Id " + obj[0] + " is not present in database throws from @Before");

	}

}
