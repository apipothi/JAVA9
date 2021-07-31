package com.apipothi.java9.factoryMethod;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA 9
 * JAVA      : 11
 * Program   : 6.JAVA9 Features " Map Factory Method Enhancement".
 *           *OR How to Create the Immutable Map in JAVA
*/

public class MapFactoryMethodEnhancement {

	public static void main(String[] args) {

		/* Before JAVA 9 */
		Map<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(1, "Hello");
		myMap.put(2, "API");
		myMap.put(3, "POTHI");
		myMap.put(4, null);

		myMap = Collections.unmodifiableMap(myMap);

		//myMap.put(4,"Test");
		System.out.println("Map Value before JAVA-9" + myMap);

		/* After JAVA 9 */
		Map<Integer, String> myNewMap = Map.of(1, "Hello", 2, "API", 3, "POTHI");
		System.out.println("Map Value After JAVA-9" + myNewMap);
	}
}
