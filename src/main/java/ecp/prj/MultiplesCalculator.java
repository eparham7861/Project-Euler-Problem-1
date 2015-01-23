package ecp.prj;

public class MultiplesCalculator {
	
	public int getSum(int total) {
		int sum = 0;
		
		for (int i = 0; i < total; i++) {
			if (multipleOfThree(i) || multipleOfFive(i)) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	private boolean multipleOfThree(int currentNumber) {
		if (currentNumber % 3 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean multipleOfFive(int currentNumber) {
		if (currentNumber % 5 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}