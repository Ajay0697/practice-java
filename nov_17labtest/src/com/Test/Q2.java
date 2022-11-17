package com.Test;

public class Q2
{
	public static void main(String[] args) {
		 
		String str = "Ajay Kumar";
		
		// Length method 
		
		System.out.println("Length of String is : "+ str.length());
		
		// .equals() 

		String s1 = "rock"; 
		String s2 = "star";
		if(s1.equals(s2)) 
			System.out.println("Both strings are same"); 
		else
			System.out.println("Both strings are not same"); 
		
		// .equalsIgnoreCase() 
			
		s1 = "rock";
		
		if(s1.equalsIgnoreCase(s2)) 
			System.out.println("Both strings are same"); 
		else
			System.out.println("Both strings are not same"); 
		
		// .charAt(0) 
		
		System.out.println(s1.charAt(2));
		
		
		// s1.concat(s2) it return the concatenated string
		System.out.println(s1.concat(s2));
		 
	}

}


			
				  
			

				 