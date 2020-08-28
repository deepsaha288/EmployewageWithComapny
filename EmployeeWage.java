public class EmployeeWage
{
                //CONSTANTS
        public static final int partTime=1;
	public static final int fullTime=2;
	public static final int absent=0;
	public static final int empRatePerHrs=20;
        public static final int maxWorkingHrs=100;
        public static final int maxDays=20;

	public void calculatedEmployeeWage()
	{
		//VARIABLES
		int totalSalary=0;
		int employeeHour=0;
                int totalEmployeeHour=0;
                int totalWorkingDays=0;

            while(totalWorkingDays<maxDays && totlaEmployeeHour<maxWorkingHrs)
                   {
                       totalWorkingDays++

                       //Main Logic Build

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


                              //calculating total employee hour
                            totalEmployeeHour=(totalEmployeeHour + employeeHour)

                               //calculating total salary
                           totalSalary=(empRatePerHrs*totalEmployeeHour)

	            }

              System.out.println("total salary of employee:" +totalSalary);
          }

	 //main method
    public static void main(String args[]){

    //create object of class
    EmployeeWage employee = new EmployeeWage();

    //method call
    employee.calculatedEmployeeWage();

      }



}


