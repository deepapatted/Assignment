package com.cg.collections;

import java.util.ArrayList;

public class Product {
	int id;
	String Name;

	public Product(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	public static void main(String[] args) {
		Product p1 = new Product(1, "deepa");
		Product p2 = new Product(2, "deepa");
		Product p3 = new Product(3, "deepa");
		Product p4 = new Product(4, "deepa");
		Product p5 = new Product(5, "deepa");
		Product p6 = new Product(6, "deepa");
		Product p7 = new Product(7, "deepa");
		Product p8 = new Product(8, "deepa");
		Product p9 = new Product(9, "deepa");
		Product p10 = new Product(10, "deepa");
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		al.add(p7);
		al.add(p8);
		al.add(p9);
		al.add(p10);
		for (int i = 0; i < al.size(); i++)
			System.out.println(al.get(i));

	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + "]";
	}

}
