package com.deeptech.hibernate.work;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Employee;
import com.deeptech.hibernate.work.utility.HibernateUtil;

public class ReadEmployee {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.connection();
		Session ses = sf.openSession();
		ses.beginTransaction();
		Query q = ses.createQuery("from Employee");
		List<Employee> emp = q.list();
		for(Employee s:emp)
		{
			System.out.println(s.getEmpName()+"\t"+s.getEmail()+"\t"+s.getMobile()+"\t"+s.getAge()+"\t"+s.getSalary()+"\t"+s.getState());
		}
		ses.getTransaction().commit();
	}

}

