package com.cg.collections;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Contact {
	long PhoneNumber;
	String Name;
	String Email;

	enum Gender {
		Male, Female
	};

	
	public static void main(String[] args) {
		
		Contact c = new Contact();
		c.PhoneNumber = 897655873;
		c.Name = "Deepa";
		c.Email = "deepa@gmail.com";

		Contact c1 = new Contact();
		c1.PhoneNumber = 917655653;
		c1.Name = "deep";
		c1.Email = "deep13@gmail.com";
		TreeMap<Long, Contact> tm = new TreeMap<Long, Contact>();
		tm.put(c.PhoneNumber, c);
		tm.put(c1.PhoneNumber, c1);
		for (Entry<Long, Contact> ct : tm.entrySet())
			System.out.println(ct);

	}
	
	@Override
	public String toString() {
		return "Contact [PhoneNumber=" + PhoneNumber + ",Name=" + Name + ", Email=" + Email + "]";
	}
	

}