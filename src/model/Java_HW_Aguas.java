package model;

public class Java_HW_Aguas {
	
	static String sentence = "This is a static variable";
	static int favNumber = 14;
	
	int secondFavNumber = 23;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Can't convert from String to int
		int error1 = "Nan";
		String error2;
		
		// Local variable error2 may not have been initialized
		System.out.print(error2);
		
		//Prints without error (14)
		System.out.print(favNumber);
		
		// Can't make static reference to non-static field secondFavNumber
		System.out.print(secondFavNumber);
		
	}