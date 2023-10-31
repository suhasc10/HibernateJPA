package com.deeptech.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Employee;
import com.deeptech.hibernate.work.utility.HibernateUtil;

public class UpdateEmployee {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.connection();
		Session ses = sf.openSession();
		ses.beginTransaction();
		Employee s = ses.get(Employee.class,1);
		s.setEmpName("Gowda");
		ses.getTransaction().commit();
		ses.close();
		sf.close();
		System.out.println("Update success");
	
	}

}

