package com.TryCatchwithreturn;
//try me return hoga tho bhi exit nahi karega function se jaab taak finaaly run na ho
public class return_use {
  static StringBuilder str = new StringBuilder("Start");
    int a = 10;

    public static String testMethod(int b) {
        try {
        	str.append("-T");
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
