package com.uni.java.homework2;

/**
 * @author Велизар Великов 116011
 *
 */
public class homework2 {

	public static void main(String[] args){
		System.out.println(add("580257933478790","234232342349999974"));
	}
	/**
	 * 
	 * @param a First string
	 * @param b Second string
	 * @return the addition of the strings
	 */
	public static String add(String a, String b) {
		
		//declaration of variables
		String firstString = a;
		int firstStringLenght;
		String secondString = b;
		int secondStringLenght;
		int razlika = 0;
		String sumOfStrings = "";
		String sumOfStringsBuffer = "";
		
		//get the lenght of the strings
		firstStringLenght = firstString.length();
		secondStringLenght = secondString.length();
		int biggestStrLenght = 0;
		
		//finding the sizes of the strings
		if (firstStringLenght == secondStringLenght)
			biggestStrLenght = firstString.length();
		else {
		if (firstStringLenght > secondStringLenght) {
			razlika = firstStringLenght - secondStringLenght;
			for (int index = 0; index < razlika; index++) {
				secondString = 0 + secondString;
				biggestStrLenght = firstStringLenght;
			}
		}
		else {
			razlika = secondStringLenght - firstStringLenght;
			for (int index = 0; index < razlika; index++){
				firstString = 0 + firstString;
				biggestStrLenght = secondStringLenght;
			}
		}
		}
		
		//modify strings into arrays
		char[] charOfFirstString = firstString.toCharArray();
		char[] charOfSecondString = secondString.toCharArray();
		
		//buffers for addition
		String strBufferForFirst = "";
		String strBufferForSecond = "";
		
		//some shitty variables for calculations
		int chekOstatak = 0;
		int test1 = 0;
		int test2 = 0;
		int sumOfTwo = 0;
		
		//function to divide different numbers from strings
		for (int index = biggestStrLenght-1; index >= 0; index--) {
			
			strBufferForFirst = Character.toString(charOfFirstString[index]);
			strBufferForSecond = Character.toString(charOfSecondString[index]);
			
			//exception if there are letters
			try {
			test1 = Integer.parseInt(strBufferForFirst);
			test2 = Integer.parseInt(strBufferForSecond);
			} catch (NumberFormatException num) {
				System.out.println("Only numbers allowed!");
				return null;
			}
			
			//check for 1 on mind :D
			if (chekOstatak == 0)
			sumOfTwo = test1 + test2;
			else {
				sumOfTwo = test1 + test2 +1;
				chekOstatak = 0;
			}
			
			int c1=0;
			
			//another 1 on mind thing 
			if (sumOfTwo < 10)
				c1 = sumOfTwo;
			else {
				c1 = sumOfTwo - 10;
				chekOstatak++;
			}
			
			//added numbers into string to display the result
			sumOfStringsBuffer = Integer.toString(c1);
			sumOfStrings = sumOfStringsBuffer + sumOfStrings;
		}
		
		//a fixed issue with the length of the final string
		if (chekOstatak==1)
		return "1" + sumOfStrings;
		else return sumOfStrings;

	}
}
