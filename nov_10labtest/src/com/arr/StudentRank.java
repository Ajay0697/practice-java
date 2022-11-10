package com.arr;

	 public class StudentRank
	{
	    String name;
	    int marks, prev_rank;
	      
	    StudentRank()
	    {
	        this.marks = 0;
	        this.prev_rank = 0;
	    }
	
	      
	// Function to print the name of student who
	// stood first after updation in rank
	static void nameRank(String []names, int []marks,
	                      int []updates, int n)
	{
	     
	    // Array of students
	    StudentRank []x = new StudentRank[n];
	   
	    for(int i = 0; i < n; i++)
	    {
	        x[i] = new StudentRank();
	         
	        // Store the name of the student
	        x[i].name = names[i];
	   
	        // Update the marks of the student
	        x[i].marks = marks[i] + updates[i];
	   
	        // Store the current rank of the student
	        x[i].prev_rank = i + 1;
	    }
	   
	    StudentRank highest = x[0];
	      
	    for(int j = 1; j < n; j++)
	    {
	        if (x[j].marks >= highest.marks)
	            highest = x[j];
	    }
	   
	    // Print the name and jump in rank
	    System.out.print("Name: " + highest.name +
	                     ", Jump: " +
	                     Math.abs(highest.prev_rank - 1));
	}
	  
	// Driver code 
	public static void main(String[] args)
	{
	     
	    // Names of the students
	    String []names = { "sam", "ram", "rahul" };
	      
	    // Marks of the students
	    int []marks = { 80, 79, 75 };
	      
	    // Updates that are to be done
	    int []updates = { 0, 5, -9 };
	      
	    // Number of students
	    int n = marks.length;
	      
	    nameRank(names, marks, updates, n);
	}
	}
	 
	

	


