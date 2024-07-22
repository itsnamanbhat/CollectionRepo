package com.grayMatter;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnItems {

	public static void main(String[] args) {
		LinkedList<Item> li=new LinkedList();
		Item l1= new Item("Laptop",7,1000,"asus");
		Item l2= new Item("Mouse",3,100,"FinalMouse");
		Item l3= new Item("Gpu",1,1000,"asus");
		li.add(l1);
		li.add(l2);
		li.add(l3);
		
		li.sort(new ItemNameComparator().thenComparing(new BrandComparator()));
		
		Iterator i= li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
;
		
	}

}
