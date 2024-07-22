package com.grayMatter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {

	public static void main(String[] args) {
//		LinkedList <String> fruitList= new LinkedList <String>();
//		fruitList.add("mango");
//		fruitList.add("banana");
//		fruitList.add("apple");
//		fruitList.add("orange");
//		System.out.println(fruitList);
//		fruitList.addFirst("waterMellon");
//		fruitList.addLast("kiwi");
////		fruitList.add(null);
//		System.out.println(fruitList);
//		
//		//iterator
//		Collections.sort(fruitList);
//		Iterator<String> itr=fruitList.listIterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		
//		fruitList.contains("mango"	);
//		
//		LinkedList <String > cloneList= (LinkedList<String>) fruitList.clone();
		
		LinkedList <Employee> empList = new LinkedList <Employee>();
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
		
		LinkedList<Employee> myEmps= (LinkedList<Employee>)empList.clone();
		System.out.println(empList.hashCode());
		System.out.println(myEmps.hashCode());
		Employee e9= new Employee("adi",2321,325235,"Banglore");
		myEmps.add(e9);
		System.out.println(myEmps);
	}
	
		
	

}
