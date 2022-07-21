package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
		Random random = new Random();
		
		
		
		
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		while(hashSet.size() < 6) {
			
			hashSet.add(1+random.nextInt(45));
		}
		
		
		Iterator<Integer> it = hashSet.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
		
		
		

	}

}
