package com.deeptech.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Employee;
import com.deeptech.hibernate.work.utility.HibernateUtil;
public class CreateEmployee {

	public static void main(String[] args) {
		Employee s = new Employee();
		s.setEmpId(1);
		s.setEmpName("Suhas");
		s.setEmail("suhas@gmail.com");
		s.setMobile("9090101010");
		s.setAge(23);
		s.setSalary(23560);
		s.setState("Karnataka");
		SessionFactory sf = HibernateUtil.connection();
		Session ses = sf.openSession();
		ses.beginTransaction();
		ses.save(s);
		System.out.println("Insert Record Success");
		ses.close();
		sf.close();
	}
}

