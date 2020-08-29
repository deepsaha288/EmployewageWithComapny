public class EmployeeWage
{
//CONSTANTS
	final int absent=0;
	final int PartTime=1;
	final int FullTime=2;

	//VARIABLES
	private String companyName;
	private int empRatePerHour;
	private int maxWorkingHour;
	private int maxDays;

	//CONSTRUCTOR

	public EmployeeWage(String companyName,int empRatePerHour,int maxWorkingHour,int maxDays){
		this.companyName=companyName;
		this.empRatePerHour=empRatePerHour;
		this.maxWorkingHour=maxWorkingHour;
		this.maxDays=maxDays;
	}


	//calculate employee daily wages based on type of employe
	public int calculatedEmployeeWage()
	{
		//VARIABLES
		int totalEmployeeHour=0;
		int employeeHour=0;
		int totalSalary=0;
		int totalWorkingDays=0;

		while(totalWorkingDays<maxDays && totalEmployeeHour<maxWorkingHour)
		{
			totalWorkingDays++;

	 		//COMPUTATION
			int empCheck = (int)( Math.random() * 10 ) % 3;

			switch(empCheck){
				case PartTime:
					employeeHour=4;
					break;

				case FullTime:
					employeeHour=8;
					break;

				case absent:
            	employeeHour = 0;
                break;

				 default:
					System.out.println("invalid choice");
			}

		//calculated total employee hour
		totalEmployeeHour=(totalEmployeeHour + employeeHour);

		//calculated total Salary
		totalSalary=(empRatePerHour * totalEmployeeHour);
		}
		return totalSalary;
	}


   public static void main(String args[]){

   //created object of class
   EmployeeWage DellEmployee = new EmployeeWage("Dell",20,100,20);
	int totalDellEmpWage=DellEmployee.calculatedEmployeeWage();
	System.out.println("Total Wage of Dell Employee:" +totalDellEmpWage);

	//created object of class
   EmployeeWage IBMEmployee = new EmployeeWage("IBM",20,100,20);
   int totalIBMEmpWage=IBMEmployee.calculatedEmployeeWage();
   System.out.println("Total Wages of IBM Employee:" +totalIBMEmpWage);

  }
}
