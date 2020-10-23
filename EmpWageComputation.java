package empwagecomputation;

public class EmpWageComputation {

	public static void main(String[] args) {

		final int PRESENT = 1;
		final int WAGE_PER_HOUR = 20;
		int workingHours = 8;
		int dailyWage = 0;
		int checkPresentOrAbsent = (int) (Math.random() * 2); // check employee present or not using random function

		if (checkPresentOrAbsent == PRESENT) {
			dailyWage = (WAGE_PER_HOUR * workingHours);
		} else {
			dailyWage = 0;
		}
		System.out.println("Daily Employee Wage:" + dailyWage);
	}
}
