public class EmployeeWage
{
                //CONSTANTS
        public static final int partTime=1;
	public static final int fullTime=2;
	public static final int absent=0;
	public static final int empRatePerHrs=20;

	public void calculatedEmployeeWage()
	{
		//VARIABLES
		int employeeHour=0;
		int empWage=0;
                int totalSalary=0;
                int salary=0;
                int workingDays=20;

	 	//Main Logic Build
                for(int day=1;day<=workingDays;day++)
                   {
		int empCheck = (int)( Math.random() * 10 ) % 3;

		                  switch(empCheck)
                {
			case partTime:
					employeeHour=4;
					break;

			case fullTime:
					employeeHour=8;
					break;

			case absent:
                                        employeeHour = 0;
                                         break;

			default:
		                        System.out.println("invalid choice");
		    }

		empWage=employeeHour * empRatePerHrs;
		System.out.println("Employee Wage:" + empWage);
	       }
             //calculating daily salary
           salary=(empRatePerHrs*employeeHour);

           //calculating monthly salary
         salary=(totalSallary+salary);
        }

	 //main method
    public static void main(String args[]){

    //create object of class
    EmployeeWage employee = new EmployeeWage();

    //method call
    employee.calculatedEmployeeWage();
      }
 

}


