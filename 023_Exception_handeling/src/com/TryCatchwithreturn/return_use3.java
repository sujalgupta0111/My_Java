package com.TryCatchwithreturn;
class a{
	
	
}
//try me return hoga tho bhi exit nahi karega function se jaab taak finaaly run na ho
//try ke koi explicitly koi error thow karoge throw ka us ekarke then  neeche ka code unreachable ho jyega 
//koi exception throw karne se neeche retun bhi nahi likh sakte hai 
//finally tho run hie hoga  kisi bhi condition me agagr t me return t karaya hai tho vo override ho jayega  finaaly  me jo return karaya hai  
public class return_use3 {
	static StringBuilder str = new StringBuilder("Start");
	int a = 10;

	public static String testMethod(int b) {
		try {
			str.append("-T");

			throw new IllegalAccessException("hello");

		} catch (Exception e) {

			str.append("-C");
			throw new IllegalAccessException("hello");

		} finally {
			str.append("-F");
			return "F";
		}

	}

	public static void main(String[] args) {

		System.out.println(str);
		testMethod(10);
		System.out.println(str);

	}
}
