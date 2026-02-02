package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortingUsingTreeSet0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1st way to sort object using treeSet 
		
	//	  TreeSet<Integer> ts= new TreeSet<>();
		
		//2nd way to sort simple object using Collection.sort(object)
		
		ArrayList<Integer> ts =  new ArrayList();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		
		System.out.println(ts);
		Collections.sort(ts);
		System.out.println(ts);
		
	
		
	}

}
