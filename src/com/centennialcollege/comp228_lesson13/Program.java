package com.centennialcollege.comp228_lesson13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program { // Driver Class

	public static void main(String[] args) { // Main Method aka Main Process

		//MyRunnable objects - for tasks
		MyRunnable  myRunnable1 = new MyRunnable("1");
		MyRunnable  myRunnable2 = new MyRunnable("2");

		//create a fixed thread of (3) possible threads - to use a Runnable to run a Thread from this Thread-Pool concurrently
		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.execute(myRunnable1);
		executor.execute(myRunnable2);
		//Still Needs Synchronize Keyword - to sync processes (the threads?) to have their own priority
		
		/* - calling an Executor Service instead - in order to synchronize tasks, and schedule their runtime seperatly and simultaneously
		//Thread object run tasks via instances of MyRunnable objects
		Thread thread1 = new Thread(myRunnable1);
		Thread thread2 = new Thread(myRunnable2);

		thread1.start(); // (SECONDARY THREAD) to execute a thread, run it's start method
		thread2.start(); // (SECONDARY THREAD) to execute a thread, run it's start method
*/

		//INTERLEAVING - These Threads run in this same process - sharing the same resources
		
		//RUN THIS MAIN THREAD - THIS INTERLEAVES BETWEEN BOTH THREADS AND THEIR TASK (running both at the same time)
		//MAIN THREAD TAKES PRIORITY
		for(int index = 0; index < 10; index++)
		{
			System.out.println("Main Thread Count: " + index);
			try { // after task is executed with no exception error
				Thread.sleep(1000); //sleep (part of Thread class) - has the thread (task - to run the for loop) pause/wait for a set amount of milliseconds - 1000ms = 1s
				/*if(index > 5){ // at 5th iteration of running Main Thread's task
					//thread1.interrupt(); // stops a thread - interrupts it
					//COULD NOT INTERUPT THE THREAD - DUE TO INHERITANCE?
				}*/
			} catch (InterruptedException e) {
				System.err.println("Thread Interrupted: " + e);
			}
		}
	}

}
