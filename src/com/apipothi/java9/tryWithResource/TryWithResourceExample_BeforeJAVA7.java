package com.apipothi.java9.tryWithResource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA9
 * JAVA      : 11
 * Program   : 2. "Try with Resources Enhancement " Example in JAVA 9.
 * Example   : Write a program to mearge data from two files in to 3rd file 
 *             i.e File3.txt = File1.txt + File2.txt;
 * REMARK    :  Below Code if perfectely correct before JAVA-7 Enhancement     
*/
public class TryWithResourceExample_BeforeJAVA7 {

	public static void main(String[] args) throws IOException {

		TryWithResourceExample_BeforeJAVA7.getMeargeFile();
	}

	public static void getMeargeFile() throws IOException {

		PrintWriter printwriter = new PrintWriter("D:/JAVA-CODE/YOUTUBE/FILE/output.txt");

		FileReader fileReader_1 = new FileReader("D:/JAVA-CODE/YOUTUBE/FILE/file1.txt");
		BufferedReader bufferedReader_1 = new BufferedReader(fileReader_1);

		FileReader fileReader_2 = new FileReader("D:/JAVA-CODE/YOUTUBE/FILE/file2.txt");
		BufferedReader bufferedReader_2 = new BufferedReader(fileReader_2);

		try {
			System.out.println("-In Try-");
			String firstLine = bufferedReader_1.readLine();

			while (firstLine != null) {
				printwriter.println(firstLine);
				firstLine = bufferedReader_1.readLine();

			}

			String secondtLine = bufferedReader_2.readLine();

			while (secondtLine != null) {
				printwriter.println(secondtLine);
				secondtLine = bufferedReader_2.readLine();

			}
		} catch (FileNotFoundException e) {
			System.out.println("Exception occured during file mearge-In Catch");

		} finally {

			System.out.println("-In Try-");
			printwriter.flush();
			fileReader_1.close();
			bufferedReader_1.close();
			fileReader_2.close();
			bufferedReader_2.close();
			
		}

	}
}
