package com.grayMatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoOnArrayList {

	public static void main(String[] args) {
		ArrayList <Employee> empList = new ArrayList <Employee>();
		Employee e1= new Employee("naman",1431,500000, "Banglore");
		Employee e2= new Employee("madan",1215,50050, "Banglore");
		Employee e3= new Employee("suresh",1796,508000, "Banglore");
		Employee e4= new Employee("chatesh",1217,580000, "pune");
		Employee e5= new Employee("sudha",1278,500800, "pune");
		Employee e6= new Employee("sudha",1278,800800, "pune");
		Employee e7= new Employee("sudha",1278,900800, "pune");
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		// to string	
		System.out.println(empList);
		//with enhanced for loop
		for(Employee emp:empList) {
			System.out.println(emp);
		}
		
		//with the help of iterator	
		
		Iterator itr= empList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Sort operation");
		Collections.sort(empList);
		
		empList.sort(new CityComparator().thenComparing(new NameComparator()).thenComparing(new SalaryComparator()));
		for(Employee emp:empList) {
			System.out.println(emp);
		}
	}

}
