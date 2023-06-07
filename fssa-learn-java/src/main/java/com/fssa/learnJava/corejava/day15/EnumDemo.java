package com.fssa.learnJava.corejava.day15;

enum Status {
	STARTED, COMPLETED, PENDING
}

public class EnumDemo {
	public static void main(String[] args) {
		Status status = Status.valueOf("COMPLETED");
		System.out.println(status.equals(Status.COMPLETED));
	}
}
