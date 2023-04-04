package com.example.one.to.one.bi.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.one.to.one.bi.bean.Instructor;
import com.example.one.to.one.bi.bean.InstructorDetail;
import com.example.one.to.one.bi.util.SessionUtil;


public class UpdateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
			
		InstructorDetail instructorDetail = (InstructorDetail) session.get(InstructorDetail.class,1);
		
		instructorDetail.setHobby("a");
		instructorDetail.getInstructor().setFirstName("Janu");
		
		tx.commit();
		SessionUtil.closeSession(session);
		
	}

}

