package com.apipothi.java9.privateMethod;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA9
 * JAVA      : 11
 * Program   : 1. Private Method’s in Interface Example.
*/
public interface SMSService {

	public void getmySMS();
	
	default void friendSMS() {

		String greetings = "Hello Friends";
		//System.out.println(greetings + " Welcome to API POTHI " + "  https://www.youtube.com/apipothi ");
		sms(greetings);
	}

	default void companySMS() {

		String greetings = "Hello Team";
		//System.out.println(greetings + " Welcome to API POTHI " + "  https://www.youtube.com/apipothi ");
		sms(greetings);
	}

	static void familySMS() {
		String greetings = "Dear Family";
		//System.out.println(greetings + " Welcome to API POTHI " + "  https://www.youtube.com/apipothi ");
		sms(greetings);
	}
	
	
	private static void sms(String greetings) {
		System.out.println(greetings + " Welcome to API POTHI " + "  https://www.youtube.com/apipothi ");
	}
}
