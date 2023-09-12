package com.simplilearn.addmiportal;

import java.util.*;

import org.hibernate.*;

public class client1 {

	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = AHibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			//1.add teacher 
			teacherdetail tcr1=new teacherdetail("sita kumari","maths");
			session.save(tcr1);
			teacherdetail tcr2=new teacherdetail("ram prasad","physics");
			session.save(tcr2);
			List<String> students_of_class  = new ArrayList<String>();
			students_of_class.add("ratan"); 
			students_of_class.add("glamer"); 
			
			
			
			classlist cls1=new classlist("classA",students_of_class);
			session.save(cls1);
			List<String> students_of_class2  = new ArrayList<String>();
			students_of_class2.add("ratan--1"); 
			students_of_class2.add("glamer--1");
			classlist cls2=new classlist("classB",students_of_class2);
			session.save(cls2);
			
			List<String> students_of_class3  = new ArrayList<String>();
			students_of_class3.add("ratan--2"); 
			students_of_class3.add("glamer--2");
			
			classlist cls3=new classlist("classC",students_of_class3);
			session.save(cls3);
			Set<classlist> accs1=new HashSet<classlist>();
			accs1.add(cls1);
			accs1.add(cls2);
			accs1.add(cls3);
			//save in teacher class
			tcr1.setclasslists(accs1);
			
			Set<classlist> accs2=new HashSet<classlist>();
			accs2.add(cls1);
			accs2.add(cls2);
			
			tcr2.setclasslists(accs2);
			
			tx.commit();
			session.close();
			
			
			
	}
		catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}

}
	}
}
