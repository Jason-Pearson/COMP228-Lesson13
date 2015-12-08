package com.centennialcollege.comp228_lesson13;

public class Program { // Driver Class

	public static void main(String[] args) { // Main Method aka Main Process

		MyThread  thread1 = new MyThread("1");
		MyThread  thread2 = new MyThread("2");

		thread1.start(); // (SECONDARY THREAD) to execute a thread, run it's start method
		thread2.start(); // (SECONDARY THREAD) to execute a thread, run it's start method


		//RUN THIS MAIN THREAD - THIS INTERLEAVES BETWEEN BOTH THREADS AND THEIR TASK (running both at the same time)
		//MAIN THREAD TAKES PRIORITY
		for(int index = 0; index < 10; index++)
		{
			System.out.println("Thread Count: " + index);
			try { // after task is executed with no exception error
				Thread.sleep(1000); //sleep (part of Thread class) - has the thread (task - to run the for loop) pause/wait for a set amount of milliseconds - 1000ms = 1s
			} catch (InterruptedException e) {
				System.err.println("Thread Interrupted: " + e);
			}
		}
	}

}
