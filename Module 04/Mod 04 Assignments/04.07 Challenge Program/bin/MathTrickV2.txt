/*
 * 
 * The MathTrick class generates a random 3 digit number and then does various operations on 
 * it to conver it to a string a print out the output.
 * 
 * Tristan Darnell
 * 07/26/23
 */

 public class MathTrickV2 {
	
	/**
	 * 
	 ******  DO NOT USE ARRAYS OR CONVERT NUMBERS TO STRING UNTIL STEP 7 ******
	 *
	 */
	
	// Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
	// Hint: Use Math.random() to create number in the correct range
	// 		 use modulus to find the last digit and divide by 100 for the first digit.
	//		 calculate the difference, which method can you use so it doesn't matter how the numbers are subtract?
	// 		 while the difference of the digits is less than 2, create a new random number and try again

	public static int getRandomNum() 
	{	int num = 0;
		int firstDigit = 0;
		int lastDigit = 0;

		// complete the method
		num = (int) (Math.random() * 900) + 100;
		firstDigit = num / 100;
		lastDigit = num % 10;
		while (Math.abs(firstDigit - lastDigit) <= 1)
		{
			num = (int) (Math.random() * 900) + 100;
			firstDigit = num / 100;
			lastDigit = num % 10;
		}		

		return num;
	}

	// Step 2 & 4) reverse the digits of a number
	// Hint: to reverse a number without converting it to a String:
	//		create a new variable to store the reversed number
	//		while the original number > 0
	//		for each digit, multiply the new variable by 10 (to make room for the new digit) 
	//		then add the last digit (remember modulus?) to the new variable
	//		divide the original number by 10 to get rid of the last digit
	//	Ex: 584--> (0 x 10) + 4 = 4 ; 58--> (4 x 10) + 8 = 48; 5-->(48 x 10) + 5 = 485

	public static int reverseDigits (int num) {
		// complete the method
		int ans = 0;

		while (num > 0)
		{
			ans *= 10;
			int newNum = num % 10;
			ans += newNum;
			num /= 10;
		}
		return ans;
	}
	
	// Step 7) replace characters in a String according to the chart
	// Hint: Loop through the String and "replace" the numbers with the corresponding letter
	public static String replaceLtr(String str)
	{	
		str = str.replace("0" , "Y");
		str = str.replace("1" , "M");
		str = str.replace("2" , "P");
		str = str.replace("3" , "L");
		str = str.replace("4" , "R");
		str = str.replace("5" , "O");
		str = str.replace("6" , "F");
		str = str.replace("7" , "A");
		str = str.replace("8" , "I");
		str = str.replace("9" , "B");
		return str;
	}
	
	// Step 8) reverse the letters in a String
	// Hint: start with an empty String variable 
	//		 loop through the original word   
	//		 add one letter at time to the new variable using concatenation and .substring()
	public static String reverseString(String str) {
		String ans = "";
		// complete the method
		for (int i = str.length()- 1; i >= 0; i--) ans += str.substring(i, i + 1);

		return ans;
	}
		
	public static void main(String[] args) 
	{
//		1.	Generate a random 3-digit number so that the first and third digits differ by more than one.
		int rand = getRandomNum();
		System.out.println("The starting number: " + rand);

//		2.	Now reverse the digits to form a second number.
		int reverseNum = reverseDigits(rand);
		System.out.println("The reversed number: " + reverseNum);

//		3.	Subtract the smaller number from the larger one.
		int subtract = Math.abs(rand - reverseNum);
		System.out.println("The difference is: " + subtract);

//		4.	Now reverse the digits in the answer you got in step 3 and add it to that number.
		subtract += reverseDigits(subtract);
		System.out.println("The reversed number added to the difference: " + subtract);

//		5.	Multiply by one million.
		subtract *= 1000000;
		System.out.println("Number x one million: " + subtract);

//		6.	Subtract 733,361,573.
		subtract -= 733361573;

//		7.	Convert the number to a string in order to replace the numbers with letters.
// 				Ex: String str = String.valueOf(myNumber);
//			Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.
		String n = String.valueOf(subtract);
		System.out.println("Number subtracted and converted to string: " + n);
		n = replaceLtr(n);
		System.out.println("Replaced string: " + n);

//		8.	Now reverse the letters in the string to read your message backward.
		n = reverseString(n);
		System.out.println(n);
		System.out.println("Reversed string: " + n);

	} // end main
} // end class