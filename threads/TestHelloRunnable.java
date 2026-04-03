package com.rays.threads;

public class TestHelloRunnable {

	public static void main(String[] args) {

		Thread t1 = new Thread(new HelloRunnable("Ram"));
		Thread t2 = new Thread(new HelloRunnable("Tom"));

		t1.start();
		t2.start();

	}

}
