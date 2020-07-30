package com.util;

import java.util.LinkedList;
import java.util.List;

import com.obj.Student;

public class SessionFactoryLocal {

	public void save(Student student) {
		System.out.println(student.toString() + "\n Student Added");
	}

	public List<Student> get() {
		List<Student> list = new LinkedList<Student>();
		Student std1 = new Student("Tom", "Hanks", "Tom.hanks@gmail.com");
		Student std2 = new Student("Samuel", "Jackson", "samuel.jackson@gmail.com");
		Student std3 = new Student("Scarlett", "Johansson", "scarlett.johanson@gmail.com");
		list.add(std1);
		list.add(std2);
		list.add(std3);
		return list;
	}

}
