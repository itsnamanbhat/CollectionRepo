package com.grayMatter;

import java.util.Stack;

public class DemoOnStack {

	public static void main(String[] args) {
		Stack<Integer>st= new Stack<Integer>();
		st.push(14);
		st.push(12);
		System.out.println(st);
		st.trimToSize();
		System.out.println(st.capacity());
		// here there is difference between size and capacity
		st.add(79);
		System.out.println(st.capacity());
		System.out.println(st);
	}

}
