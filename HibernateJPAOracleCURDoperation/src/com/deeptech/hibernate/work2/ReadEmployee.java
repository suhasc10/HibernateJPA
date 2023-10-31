package com.deeptech.hibernate.work2;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work2.dto.Employee;
import com.deeptech.hibernate.work2.utility.HibernateUtil;

public class ReadEmployee {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.connection();
		Session ses = sf.openSession();
		ses.beginTransaction();
		Query q = ses.createQuery("from Employee");
		List<Employee> emp = q.list();
		for(Employee e:emp)
		{
			System.out.println(e.getEmpname()+"\t"+e.getDesignation()+"\t"+e.getSalary());
		}
		ses.getTransaction().commit();
	}

}