package com.cg.collections;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LeapYear {
	private static void Leapyear(String s) {
		try {
			DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyy");
			LocalDate d = LocalDate.parse(s, f);
			int year = d.getYear();
			if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
				System.out.println(year + "is leap year");
			} else {
				System.out.println(year + "not a leap year");
			}

		} catch (DateTimeException e) {
			System.out.println("Enter valid date format");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in dd/MM/yyyy format");
		String s = sc.next();
		Leapyear(s);
		sc.close();

	}

}
