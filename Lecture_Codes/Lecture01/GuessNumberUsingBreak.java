//package com.gsv.pack1;
import java.util.Scanner;
public class GuessNumberUsingBreak 
{
public static void main(String[] args) 
{
	//Generate the random number to guessed
    int number  = (int)(Math.random()*101);
    //Input
    Scanner input  = new Scanner(System.in);
    System.out.println("Guess a magic number between 0 and 100");
    while(true)
    {
    	//Prompt the user to guess the number
    	System.out.println("\n Enter your guess");
    	int guess = input.nextInt();
    	if(guess==number)
    	{
    		System.out.println("Yes, the number is "+number);
    		break;
    	}
    	else if(guess>number)
    	{
    		System.out.println("Your guess is too high");
    	}
    	else
    	{
    		System.out.println("Your guess is too low");
    	}
    }
    
}
}
