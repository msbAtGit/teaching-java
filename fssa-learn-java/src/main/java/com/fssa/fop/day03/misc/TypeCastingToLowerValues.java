package com.fssa.fop.day03.misc;

public class TypeCastingToLowerValues {
	public static void main(String[] args) {
		int d = Short.MAX_VALUE + 4;
		short c = (short) d;
		System.out.println(Short.MAX_VALUE);
		System.out.println(d);
		System.out.println(c);
	}
}
