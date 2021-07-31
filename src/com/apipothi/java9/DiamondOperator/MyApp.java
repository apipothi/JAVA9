package com.apipothi.java9.DiamondOperator;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA 9
 * JAVA      : 11
 * Program   : 3. Diamond Operator Enhancement Example.
*/
public class MyApp {

	public static void main(String[] args) {

		/*Before JAVA 9*/
		DiamondOperatorExample<String> boj1=new DiamondOperatorExample<String>("API POTHI") {
			
			public void display() {
				System.out.println("Object for ...."+getInstance());
			}
		};
		boj1.display();
		
		/*In JAVA 9*/
		DiamondOperatorExample<String> boj2=new DiamondOperatorExample<>("Learn Code Deploy") {
			
			public void display() {
				System.out.println("Object for ...."+getInstance());
			}
		};
		boj2.display();
		
	}
}
