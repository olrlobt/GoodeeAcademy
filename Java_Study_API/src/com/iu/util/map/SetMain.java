package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		hashSet.add(10);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(1);
		
		
		System.out.println(hashSet.size());
		
		Iterator<Integer> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			
			int i = iterator.next();
			System.out.println(i);
			
			
			
		}
		
		
		
		
	}

}
