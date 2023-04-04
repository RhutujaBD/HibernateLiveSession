package com.example.one.to.one.bi.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.one.to.one.bi.bean.Instructor;
import com.example.one.to.one.bi.bean.InstructorDetail;
import com.example.one.to.one.bi.util.SessionUtil;

public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		InstructorDetail aa = (InstructorDetail) session.get(InstructorDetail.class, 1);
		session.delete(aa);		
		tx.commit();
		SessionUtil.closeSession(session);
	}

}
