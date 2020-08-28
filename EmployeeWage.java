public class EmployeeWage
{
	public static void main(String args[])
	{
		 // CONSTANTS
	        int isFullTime = 1;
		int empRatePerHrs=20;

		//VARIABLES
		int empHrs=0;
		int empWage=0;

		 //Main LogicBuild
		int empCheck = (int)( Math.random() * 10 ) % 2;
		System.out.println(empCheck);

		if ( empCheck == isFullTime )


			empHrs=8;

		else

			empHrs=0;

		empWage=empHrs * empRatePerHrs;

		System.out.println("Employee Wage:" + empWage);
	}
}
