package test;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		java.util.List<Integer> list = new ArrayList<>();
		
		list.add(56);
		list.add(78);
		list.add(0215);
		list.add(54);
		list.add(45);
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}
	}
}
