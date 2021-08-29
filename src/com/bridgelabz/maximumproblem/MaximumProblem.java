package com.bridgelabz.maximumproblem;

public class MaximumProblem <E extends Comparable<E>>{
	E first,second, third;
	
	public MaximumProblem(E first, E second, E third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public static void main(String[] args) {
		new MaximumProblem<Integer>(1,2,3).getMaximum();
		new MaximumProblem<Float>(0.1f,0.2f,0.3f).getMaximum();
		new MaximumProblem<String>("Apple","Peach","Banana").getMaximum();
	}
	
	public void getMaximum() {
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
