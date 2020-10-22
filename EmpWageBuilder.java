package empwagecomputation;

public class EmpWageBuilder {

	private static final int FULLTIME = 1;
	private static final int PARTTIME = 0;
	private static final int WORKINGDAYS_PER_MONTH = 20;
	private static final int WAGE_PER_HOUR = 20;
	private static final int TOTALHOURS = 100;

	public static void get_EmployeeWage() {
		int workingHours = 8;
		int monthlyWage = 0;
		int totalDays = 0;
		int totalHours = 0;

		while (totalDays < WORKINGDAYS_PER_MONTH && totalHours < TOTALHOURS) {
			totalDays++;

			int checkWorking = (int) (Math.random() * 3);

			switch (checkWorking) {
			case FULLTIME:
				workingHours = 8;
				break;
			case PARTTIME:
				workingHours = 4;
				break;
			default:
				workingHours = 0;
			}

			totalHours = totalHours + workingHours;
		}

		monthlyWage = (WAGE_PER_HOUR * totalHours);
		System.out.println("Total Hours:" + totalHours);
		System.out.println("Monthly Employee Wage:" + monthlyWage);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		get_EmployeeWage();
	}
}
