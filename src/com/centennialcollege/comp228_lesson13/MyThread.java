package com.centennialcollege.comp228_lesson13;

public class MyThread extends Thread { // class inherits Thread class, making this is a single thread 

	//PRIVATE INSTANCE VARIABLES
	private int _sequence;
	
	//CONSTRUCTOR
	public MyThread(int fib){ // get name of Thread object (a single thread) instantiated in Main Method
		this._sequence = fib;
	}
	
	@Override
	public void run() { // Run Method - runs this task every time it is called
		//the task itself - a for loop
		for(int index = 0; index < 10; index++)
		{
			//System.out.println("Thread " + this._name + " Count: " + index);
			try { // after task is executed with no exception error
				sleep(1000); // sleep has the thread (task - to run the for loop) pause/wait for a set amount of milliseconds - 1000ms = 1s
			} catch (InterruptedException e) {
				System.err.println("Thread Interrupted: " + e);
			}
		}
	super.run();
	}

}
