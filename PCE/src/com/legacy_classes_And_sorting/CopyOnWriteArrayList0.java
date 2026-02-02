package com.legacy_classes_And_sorting;


import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class CopyOnWriteArrayList0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyOnWriteArrayList v2 = new CopyOnWriteArrayList();
		v2.add(100);
		v2.add(50);
		v2.add(150);
		v2.add(25);
		v2.add(75);
		v2.add(125);
		v2.add(175);
		
		Iterator<Integer> itr1 =v2.iterator();
		  while(itr1.hasNext()) {
			  System.out.print(itr1.next()+" ");
			  v2.add(20);
	}
		  
		  System.out.println(" ");
		  Iterator<Integer> itr2 =v2.iterator();
		  while(itr2.hasNext()) {
			  System.out.print(itr2.next()+" ");
			// v2.add(20);
	}

}
}
