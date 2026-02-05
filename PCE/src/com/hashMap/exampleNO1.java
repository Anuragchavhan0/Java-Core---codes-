package com.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class exampleNO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
		hm.put(100, 99);
		hm.put(50, 999);
		hm.put(150, 9999);
		hm.put(25, 99999);
		hm.put(75, 999999);
		hm.put(125, 9999999);
		System.out.println(hm);
		System.out.println();
		
		Set s = hm.keySet();
		Iterator itr =s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		Collection c =hm.values();
		Iterator itr1 =c.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println();
		Set s1 = hm.entrySet();
		Iterator itr2 =s1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
