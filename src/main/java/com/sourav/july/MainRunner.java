package com.sourav.july;

public class MainRunner {

	public static void main(String[] args) {

		Employee e1 = Employee.builder()
								.empId(101)
								.empName("Saket")
								.empSal(20000.0)
								.build();

		System.out.println(e1);
	}

}
