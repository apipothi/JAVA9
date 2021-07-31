package com.apipothi.java9.privateMethod;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA9
 * JAVA      : 11
 * Program   : 1. Private Method’s in Interface Example.
*/
public class SmsServiceImpl implements SMSService {

	public static void main(String[] args) {

		SmsServiceImpl impl = new SmsServiceImpl();
		impl.friendSMS();
		SMSService.familySMS();
		impl.companySMS();
		//impl.sms();
		impl.getmySMS();

	}

	@Override
	public void getmySMS() {
		System.out.println("***-I am from getmySMS-***");
		
	}
}
