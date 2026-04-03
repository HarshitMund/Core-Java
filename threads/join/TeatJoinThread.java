package com.rays.threads.join;

public class TeatJoinThread {

	public static void main(String[] args) {

		JoinThread t1 = new JoinThread("Tom");
		JoinThread t2 = new JoinThread("Jerry");

		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();

	}

}
