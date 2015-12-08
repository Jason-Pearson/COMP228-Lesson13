package com.centennialcollege.comp228_lesson13;

public class MyRunnable implements Runnable { // A Runnable interface - not a thread

	// PRIVATE INSTANCE VARIABLES
	private String _name;

	public MyRunnable(String name) {
		this._name = name;
	}

	@Override
	public void run() {
		Task1();
	}

	
	private void Task1() {
		// TASK 1 - a for loop
		for (int index = 0; index < 10; index++) {
			System.out.println("Runnable " + this._name + " Count: " + index);
			try { // after task is executed with no exception error
				Thread.sleep(1000); // sleep has the thread (task - to run the
									// for loop) pause/wait for a set amount of
									// milliseconds - 1000ms = 1s
			} catch (InterruptedException e) {
				System.err.println("Runnable Interrupted: " + e);
			}
		}
	}

}
