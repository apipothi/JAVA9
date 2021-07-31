package com.apipothi.java9.DiamondOperator;

import java.util.ArrayList;
import java.util.List;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA 9
 * JAVA      : 11
 * Program   : 3. Diamond Operator Enhancement Example.
*/
public class DiamondOperatorExample<T> {

	T obj;

	public DiamondOperatorExample(T obj) {
		super();
		this.obj = obj;
	}

	public T getInstance() {

		return obj;
	}

	public void display() {
		System.out.println("***-Display From DiamondOperatorExample-***");
	}

}
