package com.centennialcollege.comp228_lesson13;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program { // Driver Class

	public static void main(String[] args) { // Main Method aka Main Process

		//input number to print Fibonacci series up to how many numbers
        System.out.print("Enter number of terms to print from the Fibonacci series: ");
        int number = new Scanner(System.in).nextInt();
        
        //Instantiate Runnable Object with the number of Terms given to Constructor
        MyRunnable  myRunnable1 = new MyRunnable(number);	
        //Use Executor Service with a Thread-Pool of 1 to run the Runnable in a Thread
		ExecutorService executor = Executors.newFixedThreadPool(1);
		executor.execute(myRunnable1);
		
		executor.shutdown(); // stops the executor service, after Runnable ends operation
	}

}
