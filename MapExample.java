package com.hi1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// Arraylist Element print
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Mango");
		al.add("apple");
		al.add("orange");
		al.add("banana");
		System.out.println(al);
		
		//Iterating ArrayList using Iterator
		
		ArrayList<String>al1=new ArrayList<String>();
		al1.add("Mango");
		al1.add("apple");
		al1.add("orange");
		al1.add("banana");
		Iterator<String>itr=al1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//Iterating ArrayList using For-each loop

		System.out.println("------------------");
		ArrayList<String>al2=new ArrayList<String>();
		al2.add("Mango");
		al2.add("apple");
		al2.add("orange");
		al2.add("banana");
		for(String friut:al2)
			
		{
			System.out.println(friut);
		}
		
		System.out.println(" -------------------");
		
	//	---------------Sort ArrayList--------------------//
		
		ArrayList<Integer>al3=new ArrayList<Integer>();
		al3.add(12);
		al3.add(34);
		al3.add(6);
		al3.add(1);
		Collections.sort(al3);
		for(Integer it:al3)
		{
			System.out.println(it);
		}
		

		Map<Integer, String> map=new HashMap();
		map.put(1, "ama");
		map.put(2, "mango");
		map.put(4, "yui");
		System.out.println(map);
		
		
		
		for(Map.Entry<Integer, String>ll:map.entrySet())
		{
			System.out.println(ll.getKey()+"="+ll.getValue());
			
		}
	}

}
