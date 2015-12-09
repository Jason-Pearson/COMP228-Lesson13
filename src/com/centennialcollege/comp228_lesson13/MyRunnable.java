package com.centennialcollege.comp228_lesson13;

public class MyRunnable implements Runnable { // A Runnable interface - not a thread

	// PRIVATE INSTANCE VARIABLES
	private int _sequence;

	//CONSTRUCTOR - takes in user input for the number of terms
	public MyRunnable(int fib) {
		this._sequence = fib;
	}

	@Override
	public void run() {
		Task1();
	}

	
	private synchronized void Task1() {
		// TASK 1 - Display Fibonacci Sequence
        int[] feb = new int[this._sequence];
        feb[0] = 0;
        feb[1] = 1;
        //Assign each array-item (the term) the correct number
        for(int i=2; i < this._sequence; i++){
            feb[i] = feb[i-1] + feb[i-2];
        }
        //Display the Fibonacci Sequence up to the requested terms 
        for(int i=0; i< this._sequence; i++){
                System.out.println("Term " + i + ": "+ feb[i]);
        }
	}
}
