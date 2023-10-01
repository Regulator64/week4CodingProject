package codingproject;

public class Week4CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // This declares and initializes the array
		
//		a. Programmatically subtract the value of the first element in the array from the value 
//         in the last element of the array (i.e. do not use ages[7] in your code). Print the result 
//         to the console.	
		
		System.out.println("Step 1.a. = " + (ages[ages.length - 1] - ages[0])); 
		System.out.println("----------------------");
		
//		b. Create a new array with 9 elements (one more than the ages array)  
//		   Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 100}; // This declares and initializes the new array
		System.out.println("Step 1.b. = " + (ages2[ages2.length - 1] - ages2[0]));
		System.out.println("----------------------");
		
//		c. Use a loop to iterate through the array and calculate the average age. Print the result 
//		   to the console.
		 
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
			System.out.println(sum);
		}	System.out.println("Step 1.c. = " + (sum / ages.length));
			System.out.println("----------------------");
		
		
//    2. Create an array of String called names that contains the following values:
//    “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
//    a. Use a loop to iterate through the array and calculate the average number of letters per name. 
//    Print the result to the console.
		
		double count = 0;
		for (int i = 0; i < names.length; i++) { // Used to get number of letters in index 0.
			   count += names[i].length();       // Iterating over all Strings to add the letters together.
			   
		}
		System.out.println("Step 2.a" + " " + "Average Letters: "+ count / names.length); // Took the total of all of the letters and divided by number of Strings.
				
		System.out.println("----------------------");
		
//    b. Use a loop to iterate through the array again and concatenate all the names together, 
//    separated by spaces, and print the result to the console.

		String namesConcat = "";  
		for (int i = 0; i < names.length; i++) {
			  namesConcat += names[i] + " ";
			   
		}
		System.out.println("Step 2.b" + " " + "Names: "+ namesConcat);
				
		System.out.println("----------------------");
		
//    3. How do you access the last element of any array?
//    You find the length of the the array and then subtract 1.
	
	// arr[arr.length -1];

				
//    4. How do you access the first element of any array?
//    You can find the first element of any array by using index 0. 	

	// arr[0];	
	
				
//    5. Create a new array of int called nameLengths. Write a loop to iterate over the previously 
//    created names array and add the length of each name to the nameLengths array.
		
		int[] nameLengths = new int[names.length]; // Created a new array called names.length.
		for (int i = 0; i < names.length; i++) {   // Obtained the total of all letters in Strings.
		nameLengths[i] = names[i].length();	       // Added length of each String to nameLengths array.
			
		}	
				
//    6. Write a loop to iterate over the nameLengths array and calculate the sum of all the 
//    elements in the array. Print the result to the console.

		int sum2 = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			   sum2 += nameLengths[i];
			   
		}
		System.out.println("Step 6" + " " + "Sum = " + sum2);
				
		System.out.println("----------------------");
		
		
//		String firstName = "Stevie";                              Even though the assignment didn't require me to print
//		String lastName = "Wonder";                               these results, I wanted to know my code worked.
//		System.out.println(createFullName(firstName, lastName));
//		
//		System.out.println(repeatWord("bla", 3));
		
} //end of main

			
//   7. Write a method that takes a String, word, and an int, n, as arguments and returns 
//   the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
//   I expect the method to return “HelloHelloHello”).
	
		public static String repeatWord(String word, int n) {
		String newString = "";
		for (int i = 0; i < n; i++) {
		newString += word;
		}
		return newString;
	
	}
	
//    8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
//    (the full name should be the first and the last name as a String separated by a space).
				
		public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
		
	}
	
//   9. Write a method that takes an array of int and returns true if the sum of all the ints 
//   in the array is greater than 100.
	
		public static int myArray(int x, int y, int z) {
		int sum = x + y + z;
			if (sum > 100) {
//			System.out.println("Sum of all ints is greater than 100."); This is what we would use to call this method in the main method.
			}
		}
//   10. Write a method that takes an array of double and returns the average of all the elements 
//   in the array.
	
        public static double getAverage(double[] values) {
       	double sum = 0;
    	for (double value : values) {
    	sum += value;
        }
    	return sum / values.length;
        }
        
//   11. Write a method that takes two arrays of double and returns true if the average of the 
//   elements in the first array is greater than the average of the elements in the second array.
	
        public static double getAverages2(double[] firstNums, double[] secondNums) {
        double sum1 = 0;
        double sum2 = 0;
        for (double firstNum : firstNums) {
        sum1 += firstNum;
        } for (double secondNum : secondNums) {
        sum2 += secondNum;
        }
        return (sum1 + sum2) / (firstNums.length + secondNums.length); 	
        }

	
//   12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double 
//   moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

        public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        if (moneyInPocket > 10.50 && isHotOutside == true) {
        } 
        return true;
        	
        }
	
//   13. Create a method of your own that solves a problem. In comments, write what the method does 
//   and why you created it.
	
        // I honestly can't think of anything because my brain is completely fried.
	
}