package com.bridgelabz.maximumproblem;

public class MaximumProblem {
	public static void main(String[] args) {
		getMaximum(1,2,3);
		getMaximum(0.1f,0.2f,0.3f);
		getMaximum("Apple","Peach","Banana");
	}
	
	public static <E extends Comparable<E>> void getMaximum(E first, E second, E third) {
		if (first.compareTo(second) > 0) {
			if (first.compareTo(third) > 0) {
				System.out.println(first);
			} else {
				System.out.println(third);
			}
		} else {
			if (second.compareTo(third) > 0) {
				System.out.println(second);
			} else {
				System.out.println(third);
			}
		}
	}
}
