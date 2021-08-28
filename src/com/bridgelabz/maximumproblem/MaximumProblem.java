package com.bridgelabz.maximumproblem;

public class MaximumProblem {
	public static void main(String[] args) {
		getMaximum(1,2,3);
		getMaximum(0.1f,0.2f,0.3f);
		getMaximum("Apple","Peach","Banana");
	}
	
	public static void getMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
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
	
	public static void getMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
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
	
	public static void getMaximum(String firstWord, String secondWord, String thirdWord) {
		if (firstWord.compareTo(secondWord) > 0) {
			if (firstWord.compareTo(thirdWord) > 0) {
				System.out.println(firstWord);
			} else {
				System.out.println(thirdWord);
			}
		} else {
			if (secondWord.compareTo(thirdWord) > 0) {
				System.out.println(secondWord);
			} else {
				System.out.println(thirdWord);
			}
		}
	}
}
