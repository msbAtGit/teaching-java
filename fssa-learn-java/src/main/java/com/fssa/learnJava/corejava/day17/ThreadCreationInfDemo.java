package com.fssa.learnJava.corejava.day17;

class DemoInfThread implements Runnable {
	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		for(int i = 1; i <10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("I am in " + currentThread.getName() + " Thread");
		}
	}
}

//Prompt for students what's the difference between the 
//old extends way and this way of doing it
public class ThreadCreationInfDemo {
	public static void main(String[] args) {
		Thread demoThread = new Thread(new DemoInfThread());
		demoThread.setName("Demo Thread");
		demoThread.start();
		Thread mainThread = Thread.currentThread();
		for(int i = 1; i <10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("I am in " + mainThread.getName() + " Thread");
		}
	}
}
