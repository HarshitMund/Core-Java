package com.rays.threads.priority;

public class PriorityThread extends Thread {

	private String name;

	public PriorityThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(i + " - " + name);
		}
	}

}
