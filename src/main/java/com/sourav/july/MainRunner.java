package com.sourav.july;

public class MainRunner {

	public static void main(String[] args) {

		Employee emp = Employee.builder()
								.empId(101)
								.empName("Saket")
								.empSal(20000.0)
								.build();

		System.out.println(emp);
	}

}
