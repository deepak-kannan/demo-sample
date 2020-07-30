package com;

import java.util.List;
import com.dao.StudentDAO;
import com.obj.Student;

public class Main {

	public static void main(String[] args) {
		StudentDAO studentDao = new StudentDAO();
		Student student = new Student("Tom", "Hanks", "tom.hanks@gmail.com");
		studentDao.saveStudent(student);
		List<Student> students = studentDao.getStudents();
		students.forEach(s -> System.out.println(s.getFirstName()));
	}
}
