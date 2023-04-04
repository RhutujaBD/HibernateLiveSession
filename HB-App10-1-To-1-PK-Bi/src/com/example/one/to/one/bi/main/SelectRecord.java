package com.example.one.to.one.bi.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.one.to.one.bi.bean.Instructor;
import com.example.one.to.one.bi.bean.InstructorDetail;
import com.example.one.to.one.bi.util.SessionUtil;

public class SelectRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		

//		InstructorDetail instructorDetail = (InstructorDetail) session.get(InstructorDetail.class, 1);
//		
//		System.out.println("Instructor Details .. : ");
//	
//		System.out.println("InstructorDetail ID .. : "+instructorDetail.getId());
//		System.out.println("InstructorDetail Youtube channel Name .. : "+instructorDetail.getYoutubeChannel());
//		System.out.println("InstructorDetail Hobby .. : "+instructorDetail.getHobby());
//		
//		System.out.println("Instructor .. : "+instructorDetail.getInstructor().getId());
//		System.out.println("Instructor First Name .. : "+instructorDetail.getInstructor().getFirstName());
//		System.out.println("Instructor Last Name .. : "+instructorDetail.getInstructor().getLastName());
//		System.out.println("Instructor Email .. : "+instructorDetail.getInstructor().getEmail());
		
		
		
		Instructor instructor = (Instructor) session.get(Instructor.class, 1);
		System.out.println("Instructor Details .. : ");
		
		System.out.println("InstructorDetail ID .. : "+instructor.getInstructorDetail().getId());
		
		
		
		
		tx.commit();
		
		
	}

}
