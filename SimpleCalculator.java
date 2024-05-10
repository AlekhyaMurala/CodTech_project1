package com.codetech.project1;
import java.util.*;

public class SimpleCalculator {

	public static void main(String[] args) 
	{
		Colors colors=new Colors();
		
		Scanner sc=new Scanner(System.in);
		int num1=0,num2=0;
		int ch;
		float result,sol=0;
		
		System.out.println(colors.BG_BLUE+ colors.BOLD+"*****Simple Calculator*****"+ colors.RESET);
		System.out.println();

		try
		{
		System.out.print(colors.BOLD+"Enter your First Number:"+colors.RESET);
		num1=sc.nextInt();
		
		System.out.print(colors.BOLD+"Enter your Second Number:"+colors.RESET);
		num2=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input. Please enter numbers ");
			return;
		}
		
		System.out.println();
		System.out.println(colors.BOLD+"Enter your operation"+colors.RESET);
        System.out.println("1."+ colors.GREEN + " Addition"+ colors.RESET);
        System.out.println("2."+ colors.RED +" Subtraction"+ colors.RESET);
        System.out.println("3."+ colors.YELLOW +" Multiplication"+ colors.RESET);
        System.out.println("4."+ colors.RED +" Division"+ colors.RESET);
        System.out.println("5."+ colors.PURPLE +" Exit"+ colors.RESET);
        
        System.out.println();
		System.out.print(colors.BOLD+"Enter Your Choice Here : "+colors.RESET);
        ch=sc.nextInt();
		
		switch(ch)
		{
		case 1 : result = num1 + num2;
					sol=result;
					break;
					
		case 2 : result = num1 - num2;
					sol=result;
					break;
					
		case 3 : result = num1 * num2;
					sol=result;
					break;
		
		case 4 : result = num1 / num2;
					sol=result;
					break;
			
		case 5 : System.exit(0);
		
		default : System.out.println("Invalid Choice of Operation");
					break;
		}
		System.out.println();
		System.out.println(colors.BOLD+"Result of your Operation: "+colors.RESET +sol);
	}
	
}
