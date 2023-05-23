/**
 * 
 */
package com.fssa.learnJava.corejava.day17;

/**
 * @author BharathwajSoundarara
 *
 */

class DemoThread extends Thread {
	@Override
	public void run() {
		
		for(int i = 1; i <10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("I am in " + this.getName() + " Thread");
		}
	}
}
public class ThreadCreationDemo {
	public static void main(String[] args) {
		Thread demoThread = new DemoThread();
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
