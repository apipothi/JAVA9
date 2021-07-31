package com.apipothi.java9.factoryMethod;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA 9
 * JAVA      : 11
 * Program   : 5.JAVA9 Features " Set Factory Method Enhancement".
*/

public class SetFactoryMethodEnhancement {

	public static void main(String[] args) {

		Set<String> mySet = new HashSet<String>();
		mySet.add("Hello");
		mySet.add("API");
		mySet.add("Pothi");
		//mySet.add(null);

		/* Before JAVA9 */

		mySet = Collections.unmodifiableSet(mySet);
		System.out.println("Before JAVA-9" + mySet);
		

		/* After JAVA-9 */
		Set<String> myNewSet = Set.of("Hello", "API", "POTHI");
		System.out.println("After JAVA-9" + myNewSet);

		
	}
}
