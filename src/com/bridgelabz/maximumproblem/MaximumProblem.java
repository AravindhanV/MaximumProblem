package com.bridgelabz.maximumproblem;

public class MaximumProblem {
	public static void main(String[] args) {
		getMaximumNumber(1,2,3);
		getMaximumNumber(0.1f,0.2f,0.3f);
	}
	
	public static void getMaximumNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
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
	
	public static void getMaximumNumber(Float firstNumber, Float secondNumber, Float thirdNumber) {
		if (firstNumber.compareTo(secondNumber) > 0) {
			if (firstNumber.compareTo(thirdNumber) > 0) {
				System.out.println(firstNumber.floatValue());
			} else {
				System.out.println(thirdNumber.floatValue());
			}
		} else {
			if (secondNumber.compareTo(thirdNumber) > 0) {
				System.out.println(secondNumber.floatValue());
			} else {
				System.out.println(thirdNumber.floatValue());
			}
		}
	}
}
