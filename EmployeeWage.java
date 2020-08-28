public class EmployeeWage
{
                //CONSTANTS
         final int partTime=1;
	 final int fullTime=2;
	 final int absent=0;
	 final int empRatePerHrs;
         final int maxWorkingHrs;
         final int maxDays;

             //CONSTRUCTOR
 public EmployeeWage(int empRatePerHrs,int maxWorkingHrs,int maxDays){
		this. empRatePerHrsmpRatePerHrs;
		this. maxWorkingHrs=  maxWorkingHrs;
		this.maxDays=maxDays;
 }

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
    EmployeeWage employee = new EmployeeWage(20,100,20);

    //method call
    employee.calculatedEmployeeWage();

      }



}


