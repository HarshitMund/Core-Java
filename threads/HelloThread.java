package com.rays.threads;

public class HelloThread extends Thread {

	private String name;

	public HelloThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(i + " = " + name);
		}
	}

}
