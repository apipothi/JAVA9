package com.apipothi.java9.factoryMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA 9
 * JAVA      : 11
 * Program   : 4. List Factory Method Enhancement Example.
*/
public class ListFactoryMethodEnhancement {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<String>();
		myList.add("HELLO");
		myList.add("API");
		myList.add("POTHI");
		myList.add(null);
		/*Before JAVA-9*/
		myList=Collections.unmodifiableList(myList);
		System.out.println("List before JAVA-9-" + myList);
		
		
		/*After JAVA-9*/
		List<String> myNewList=List.of("Hello","API","POTHI",null);
		
		//myNewList.add("Test");
		System.out.println("List After JAVA-9-" + myNewList);
		
	}
}
