package com.example.one.to.many.service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.transaction.Transaction;

import org.hibernate.Session;

import com.example.one.to.many.bean.Department;
import com.example.one.to.many.bean.Employee;
import com.example.one.to.many.util.SessionUtil;

public class RetriveDAO {

	public static void main(String[] args) {

		try {
			Session session = SessionUtil.getSession();
			session.getTransaction().begin();

			Employee employee = new Employee();

			Department department = (Department) session.get(Department.class, 4);
			department.getEmployeeList();

			System.out.println("Department Details .. : ");
			System.out.println("Department No .. : " + department.getDepartmentId());
			System.out.println("Department Name .. : " + department.getDepartment_name());
			System.out.println("Department Location .. : " + department.getLocation());
			// System.out.println("Department Employee First Name .. : "+departmentNew);
			// System.out.println("Department Employee Last Name .. :
			// "+employee.getLastName());
			// System.out.println("Department Employee Name Employee Id.. :
			// "+employee.getEmployeeId());

			List<Employee> employees = department.getEmployeeList();
			List<String> names = employees
								.stream()
								.map(Employee::getFirstName)
								.collect(Collectors.toList());
			
			System.out.println(names);
			
			session.getTransaction().commit();
			SessionUtil.closeSession(session);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
