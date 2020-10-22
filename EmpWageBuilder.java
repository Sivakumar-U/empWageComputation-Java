package empwagecomputation;

public class EmpWageBuilder {
	private static final int FULL_TIME = 1;
	private static final int PART_TIME = 0;
	private static final int WORKING_DAYS_PER_MONTH = 20;
	private static final int WAGE_PER_HOUR = 20;
	private static final int TOTAL_HOURS = 100;

	public static void get_EmployeeWage() {
		int montlyWage = 0;
		int totalDays = 0;
		int totalHours = 0;
		int workingHours = 8;

		while (totalDays < WORKING_DAYS_PER_MONTH && totalHours < TOTAL_HOURS) {
			totalDays++;
			int checkWorking = (int) (Math.random() * 3);
			switch (checkWorking) {
			case FULL_TIME:
				workingHours = 8;
				break;
			case PART_TIME:
				workingHours = 4;
				break;
			default:
				workingHours = 0;
			}
			totalHours += workingHours;
		}
		montlyWage = (WAGE_PER_HOUR * totalHours);
		System.out.println("Montly Employee Wage :" + montlyWage);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		get_EmployeeWage();
	}
}
