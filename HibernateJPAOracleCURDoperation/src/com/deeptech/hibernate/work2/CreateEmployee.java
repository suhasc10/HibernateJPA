package com.deeptech.hibernate.work2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work2.dto.Employee;
import com.deeptech.hibernate.work2.utility.HibernateUtil;

public class CreateEmployee {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpname("suhas");
		e.setDesignation("HR");
		e.setSalary(28000);
		SessionFactory sf = HibernateUtil.connection();
		Session ses = sf.openSession();
		ses.beginTransaction();
		ses.save(e);
		System.out.println("Insert Record Success");
		ses.getTransaction();
		ses.close();
		sf.close();
	}

}
