package com.bridgelabz.maximumproblem;

public class MaximumProblem {
	public static void main(String[] args) {
		Integer firstNumber = new Integer(1);
		Integer secondNumber = new Integer(3);
		Integer thirdNumber = new Integer(2);

		if (firstNumber.compareTo(secondNumber) > 0) {
			if (firstNumber.compareTo(thirdNumber) > 0) {
				System.out.println(firstNumber.intValue());
			} else {
				System.out.println(thirdNumber.intValue());
			}
		} else {
			if (secondNumber.compareTo(thirdNumber) > 0) {
				System.out.println(secondNumber.intValue());
			} else {
				System.out.println(thirdNumber.intValue());
			}
		}
	}
}
