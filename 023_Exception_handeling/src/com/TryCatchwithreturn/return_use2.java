package com.TryCatchwithreturn;
//try me return hoga tho bhi exit nahi karega function se jaab taak finaaly run na ho
//try ke koi explicitly koi error thow karoge throw ka us ekarke then  neeche ka code unreachable ho jyega 
//
public class return_use2 {
	static StringBuilder str = new StringBuilder("Start");
	int a = 10;

	public static String testMethod(int b) {
		try {
			str.append("-T");

			if (b < 2)
				throw new IllegalAccessException("hello");
			return "T";
		} catch (Exception e) {
			str.append("-C");
			return "C";
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
