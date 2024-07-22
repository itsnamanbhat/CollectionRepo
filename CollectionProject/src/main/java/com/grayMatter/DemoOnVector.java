package com.grayMatter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoOnVector {

	public static void main(String[] args) {
		Vector <Integer> vector= new Vector<Integer>();
		//it is a resizable array
		//it is a legacy class;
		// initial capacity is 10 and if the capacity gets exhausted then capacity will be doubled 
		
		System.out.println(vector.capacity());
		for(int i=0;i<11;i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity());
		Enumeration<Integer>myEnum=  vector.elements();
//		while(myEnum.hasMoreElements()) {
//			int i=myEnum.nextElement();
//			System.out.println(myEnum.nextElement());
//		}
		Iterator <Integer> itr= vector.iterator();
		while(itr.hasNext()) {
			int i= itr.next();
			if(i==6)
				itr.remove();
			System.out.println(i);
		}
		System.out.println(vector);
		
		//contains
		
		System.out.println(vector.contains(3));
		//last index of the duplicate elements
		System.out.println(vector.lastIndexOf(vector, 8));
		
		System.out.println(vector.reversed());
	}

}
