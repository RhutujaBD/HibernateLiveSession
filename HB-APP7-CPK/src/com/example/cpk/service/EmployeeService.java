package com.example.cpk.service;


import com.example.cpk.dao.EmployeeDAO;
import com.example.model.Employee;
import com.example.model.EmployeeId;

public class EmployeeService {
	
	

	public static void main(String[] args) {

			EmployeeId employeeId = new EmployeeId(10, 10);
			EmployeeDAO employeeDAO = new EmployeeDAO();
			
			
			//Employee employee  = new Employee();
			
			
			
			employeeDAO.getEmployeeDetails(employeeId);
			/* Display account details after Retrieving from DAO layer
			System.out.println("Account Details .. : ");
			System.out.println("Account No .. : "+employee.getEid());
//			System.out.println("Account Holder Name .. : "+accountBean.getName());
//			System.out.println("Account Balnce .. : "+accountBean.getBalance());
//			System.out.println("Account Creation Date .. : "+accountBean.getAccCreationDate()); */
		
	}

}
