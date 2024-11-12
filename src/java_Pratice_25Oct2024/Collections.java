package java_Pratice_25Oct2024;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		
		//declare arrayList
		ArrayList list = new ArrayList();
		
		//add new elements to the arraylist
		list.add (100);
		list.add("Welcome");
		list.add(15.5);
		list.add('A');
		list.add(true);
		
		System.out.println(list);
		
		//size ()
		System.out.println("Number of elements in arrayList: " + list.size());
		
		//remov()
		list.remove(1);
		System.out.println("after removing elements from array list:"+ list);
		
		list.add(2,"python");
		System.out.println("after insertion"+ list);
		
		list.set(2,"c#");
		
		System.out.println("after placing element:" + list);
		

	}
	
	

}
