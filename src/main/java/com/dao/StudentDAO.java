package com.dao;

import java.util.List;
import com.obj.Student;
import com.util.HibernateUtil;
import com.util.SessionFactoryLocal;

public class StudentDAO {
	
	public boolean saveStudent(Student student) {
		SessionFactoryLocal session = HibernateUtil.getSessionFactory();
		// save the student object
		session.save(student);
		return true;
	}

	public List<Student> getStudents() {
		SessionFactoryLocal session = HibernateUtil.getSessionFactory();
		return session.get();
	}
}
