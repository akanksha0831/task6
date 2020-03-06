package com.task6.collection.collection;

public class Main {

	public static void main(String[] args) {
		CustomList<Integer> custom_list = new CustomList<>();
		 
        custom_list.add(1);
        custom_list.add(2);
        custom_list.add(3);
        System.out.println("Elements in the integer list are "+custom_list);
        
        custom_list.remove(2);
        System.out.println("Elements in the list after removing an element are "+custom_list);
        
        System.out.println("1st element:"+custom_list.fetch(0) );
        System.out.println("2nd element:"+custom_list.fetch(1) );
 
        System.out.println("size of the list:"+custom_list.getSize());
        
        CustomList<String> custom_list1 = new CustomList<>();
		 
        custom_list1.add("Hi");
        custom_list1.add("Hello");
        custom_list1.add("Hey");
        System.out.println("Elements in the string list are "+custom_list1);
        
        custom_list1.remove(1);
        System.out.println("Elements in the list after removing an element are "+custom_list1);
        
        System.out.println("1st element:"+custom_list1.fetch(0) );
        System.out.println("2nd element:"+custom_list1.fetch(1) );
 
        System.out.println("size of the list:"+custom_list1.getSize());
	}
}
