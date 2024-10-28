//Java Program to demonstrate the use of If else-if ladder.  
//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.

package basicJava.org.com;

import java.util.*;

//these class create for taking user input and print grade according it and we use if else-if ladder for it
public class GradeSystem {
	
//Main method to use if else-if ladder and print logic of grade system
public static void main(String[] args) {
	
	int marks ;//create a int type variable for taking input
	System.out.println("Enter the Marks of Student: ");
	
	Scanner mrk=new Scanner(System.in);	//memory allocation for mrk object
	marks=mrk.nextInt();//the value  of mrk object initialize to marks variable 
	
	//if else-if ladder to print grade logic
	if(marks<35) {
		//if marks less than 35 means FAIL
		System.out.println("Your are FAIL:"+marks);
		System.out.println("your are just fail an exam not in your life stay focus on study..");
		}
	else if(marks <=35 && marks>=44) {
		//if marks less than 35 and greater than or equal 44 than grade D
		System.out.println("Your Grade is D:"+marks);
		System.out.println("give more time to study.. try again");
	}
	else if(marks <=45 && marks>=59) {
		//if marks less than/equal 45 and greater than or equal 59 than grade C
		System.out.println("Your Grade is C:"+marks);
		System.out.println("Stay focus on study.. try again");
	}
	else if(marks <=60 && marks>=74) {
		////if marks less than 60/equal and greater than or equal 74 than grade B
		System.out.println("Your Grade is B:"+marks);
		System.out.println("Good score keep it up ");
	}
	else if(marks <=75 && marks>=100) {
		//if marks less than/equal 75 and greater than or equal 100 than grade A
		System.out.println("Your Grade is A:"+marks);
		System.out.println("well done!! continue these success again ");
	}
	else {
		System.out.println("Invalid input!!!!"); //if user input is invalid 
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
