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
	
	public E getMaximum() {
		E max = first;
		if (second.compareTo(max) > 0) {
			max = second;
		} 
		if(third.compareTo(max) > 0) {
			max = third;
		}
		
		printMaximum(max);
		return max;
	}
	
	public <E> void printMaximum(E max) {
		System.out.println(max);
	}
}
