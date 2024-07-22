package com.grayMatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Employee implements Comparable,Cloneable {
	private String empName;
	private int empId;
	private double salary;
	private String city;
	
	@Override
	public int compareTo(Object o) {
		Employee e= new Employee();
		e=(Employee)o;
		//return this.getEmpId()-e.getEmpId(); --id
//		return this.getEmpName().compareTo(e.getEmpName());
		return (int)(this.getSalary()-e.getSalary());
	}
	
}
