package com.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.obj.Student;


public class StudentDAOTest {
	StudentDAO studentDao = new StudentDAO();
	Student student = new Student("Tom", "Hanks", "Tom.hanks@gmail.com");

	@Test
	public void saveStudentTest() {
		Assertions.assertTrue(studentDao.saveStudent(student));
	}
	
	@Test
	public void getStudentsTest() {
		Assertions.assertFalse(studentDao.getStudents().isEmpty());
	}
}
