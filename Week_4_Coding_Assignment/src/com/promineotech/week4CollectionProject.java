package com.promineotech;

public class week4CollectionProject {

	public static void main(String[] args) {

//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
//		a. Programmatically subtract the value of the first element in the array from the value in the last 
//		element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		System.out.println("The substraction of item 0 and last item in first array is: " + (ages[0]-ages[ages.length-1]));

//		b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, 
//				and have more elements). 
		int[] ages2 = {4, 10, 24, 65, 5, 9, 29, 94, 1};

//			i. Make sure that there are 9 elements of type int in this new array.
		if(ages2.length == 9) {
			System.out.println("The second array legth is " + ages2.length + " items long.");
		}
		
//			ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first 
//					element in the new array ages2 from the last element of ages2). 
		System.out.println("The substraction of item 0 and last item is: " + (ages2[0]-ages2[ages2.length-1]));

//			iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		for(int i=0;i<ages.length;i++)
		{
			System.out.println("Printing out items from the smaller array " + ages[i]);
		}
		for(int i=0;i<ages2.length;i++)
		{
			System.out.println("Printing out items from the larger array " + ages2[i]);
		}
		
//		c. Use a loop to iterate through the array and calculate the average age. 
		//Print the result to the console.		
		int addition=0;
		double averageAge=0;
		for(int i=0;i<ages.length;i++)
		{
			addition=addition+ages[i];
		}
		System.out.println("The sume of the short array is: " + addition);
		averageAge=addition/ages.length;
		System.out.println("The avergage age is: " + averageAge);
	

		System.out.println("_________________________________________________________");		
		//2. Create an array of String called names that contains the following 
		//values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//a. Use a loop to iterate through the array and calculate the average number of letters per name. 
				//Print the result to the console.
		int sumOfLetters=0;
		double averageNumOfLetters = 0;

		for(int i=0;i<names.length;i++) {
			sumOfLetters = sumOfLetters + names[i].length();
		}
		averageNumOfLetters = sumOfLetters/names.length;
		System.out.println("The average number of letters per name are: " + averageNumOfLetters);

		//b. Use a loop to iterate through the array again and concatenate all the names together, 
				//separated by spaces, and print the result to the console.	
		StringBuilder sb = new StringBuilder();
		int lengthOfArray = 0;
		for(int i=0;i<names.length;i++) {
			if (lengthOfArray == names.length-1) {
				sb.append(names[i]);
			}
			else
			{
				sb.append(names[i] + " ");
			}
		}
		System.out.println(sb);
 
		//*******************************************************************************************
		//3. How do you access the last element of any array?
		// We use the length of the array minus 1. We use that in the index of the array we are using
		// Example array[array.length - 1]
		
		//********************************************************************************************
		//4. How do you access the first element of any array?
		//We use the 0 item in the array index. Arrays start from 0 to array size
		//Example array[0]
		
//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously 
		//created names array and add the length of each name to the nameLengths array.	
		System.out.println("_________________________________________________________");
		int[] nameLengths = new int[names.length];
		for(int i=0;i<names.length;i++) {
			nameLengths[i]= names[i].length();
		}
		
		for(int i=0;i<nameLengths.length;i++) {
			//System.out.println("The array element in the array is: " + names[i]);
			System.out.println("The item in nameLengths is: " + nameLengths[i]);
		}

//6. Write a loop to iterate over the nameLengths array and calculate the sum of all 
		//the elements in the array. Print the result to the console.		
		System.out.println("_________________________________________________________");
		int sumOfLengths=0;
		for(int i=0;i<nameLengths.length;i++) {
			sumOfLengths = sumOfLengths+nameLengths[i];
		}
		
		System.out.println("Sum all the elemets in the array: " + sumOfLengths);

//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word 
		//concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
		//I expect the method to return “HelloHelloHello”).		
		System.out.println("_________________________________________________________");
		String word3 = wordsConcatenated("Hello",3);
		System.out.println("The concatenated words are: "+word3);

//8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
		//(the full name should be the first and the last name as a String separated by a space).		
		System.out.println("_________________________________________________________");
		String fullName = retunrFullName("Carlos","Moreno");
		System.out.println("The Full Name is: "+ fullName);

//9. Write a method that takes an array of int and returns true if the sum of all 
		//the ints in the array is greater than 100.
		System.out.println("_________________________________________________________");
		//int[] ages3 = {4, 10, 24, 65, 5, 9, 29, 94, 1};
		int[] ages3 = {4, 10, 24, 5, 9, 1};
		boolean resultOfOneHundered = greatherThan100(ages3);
		if (resultOfOneHundered) {
			System.out.println("The sum of all of the numbers in the array are greater than 100");
		}
		else
		{
			System.out.println("The sum of all of the numbers in the array is not greater than 100");
		}
		
//10. Write a method that takes an array of double and returns the average of all the elements in the array
		System.out.println("_________________________________________________________");
		double[] doubleArray = {4.0, 10.0, 24.0, 5.0, 9.0, 1.0};
		double averages = getAverageOfDoubles(doubleArray);
		System.out.println("The average of the data in the doubleArray array is: "+averages);
		
//11. Write a method that takes two arrays of double and returns true if the average of the elements 
		//in the first array is greater than the average of the elements in the second array.		
		System.out.println("_________________________________________________________");
		double[] doubleArray2 = {5.0, 5.0, 5.0, 5.0, 5.0, 5.0};
		boolean firstArrayGreater = findFirstArrayGreather(doubleArray,doubleArray2);
		if(firstArrayGreater) {
			System.out.println("The First Array has a greater average that the second array");
		}
		else
		{
			System.out.println("The First Array is NOT greater average that the second array");			
		}
		
//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket
		//, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.		
		System.out.println("_________________________________________________________");
		boolean isHotOutside=false;
		double moneyInPocket=11.50;
		boolean gettingDrinkOn = willBuyDrink(isHotOutside,moneyInPocket);
		if(gettingDrinkOn) {
			System.out.println("Yes you can buy a drink");
		}
		else {
			System.out.println("You cannot buy a drink");

		}

//13. Create a method of your own that solves a problem. In comments, 
		//write what the method does and why you created it.	
		//I Recently bought a new vehicle and I had to figure out an estimate of the taxes I eould pay
		//Therefore I crate a method which calcualtes that taxes the same way that I did.
		//It is not an exact calculation becuase of other tax rules that might applay
		//but it gives a good estimate of what you will pay for taxes in my county.
		System.out.println("_________________________________________________________");
		double initialCarCost = 42000;
		double salesTaxRate = 09.50;
		double tradeInCost = 10000; 
		double salesTax = arkansasNewCarCalesTax(initialCarCost,salesTaxRate,tradeInCost);  
		System.out.println("Exected taxes to paid for Arkansas Washington state: "+salesTax);
		
		
	}//ENd OF MAIN

	//13
	private static double arkansasNewCarCalesTax(double initialCarCost, double salesTaxRate
			, double tradeInCost) {
		
		double salesTax=0.0;
		salesTax = (initialCarCost-tradeInCost) * (salesTaxRate/100);
		
		return salesTax;
	}

	//12
	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean gettingDrinkOn =false;
		if(isHotOutside&&(moneyInPocket>10.50))
		{
			gettingDrinkOn =true;
		}
		
		
		return gettingDrinkOn;
	}

	//11
	private static boolean findFirstArrayGreather(double[] doubleArray, double[] doubleArray2) {
		boolean firstArrayGreater=false;
		double firstArrayAverage=getAverageOfDoubles(doubleArray);		
		double secondArrayAverage=getAverageOfDoubles(doubleArray2);
		if(firstArrayAverage>secondArrayAverage)
		{
			firstArrayGreater=true;
		}
		
		return firstArrayGreater;
	}

	//10
	private static double getAverageOfDoubles(double[] doubleArray) {
		double averages=0;
		double addition=0;

		for(int i=0;i<doubleArray.length;i++) {
			addition = addition + doubleArray[i];
		}
		averages = addition/doubleArray.length;

		return averages;
	}

	//9
	private static boolean greatherThan100(int[] ages3) {
		boolean resultOfOneHundered=false;
		int addition=0;
		for(int i=0;i<ages3.length;i++) {
			addition = addition +ages3[i] ;
		}
		
		if(addition > 100)
		{
			resultOfOneHundered=true;
		}
		
		return resultOfOneHundered;
	}

	//8
	private static String retunrFullName(String firstName, String lastName) {
		StringBuilder sb = new StringBuilder();

		sb.append(firstName + " ");
		sb.append(lastName);
		
		return sb.toString();
	}

	//7
	private static String wordsConcatenated(String word, int n) {
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<n;i++) {
				sb.append(word);
		}		
		
		return sb.toString();
	}
	
	

}
