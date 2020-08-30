/**
 *
 * @author DEEP
 */
import java.util.Scanner;
public class EmployeeWage {
    //VARIABLES
	private String companyName;
	private int empRatePerHour;
	private int maxWorkingHour;
	private int maxDays;
	private int totalWage;

	//CONSTRUCTOR

 public EmployeeWage(final String companyName,final int empRatePerHour,final int maxWorkingHour,final int maxDays)
        {
		this.companyName=companyName;
		this.empRatePerHour=empRatePerHour;
		this.maxWorkingHour=maxWorkingHour;
		this.maxDays=maxDays;
	}

	public String getCompanyName(){
		return companyName;
	}

	 public int getEmpRatePerHour(){
            return empRatePerHour;
         }

	 public int getMaxWorkingHour(){
          return maxWorkingHour;
         }

	 public int getMaxDays(){
            return maxDays;
         }

	 public int getTotalWage(){
            return totalWage;
         }


	/**
	*calculate employee daily wages based on type of employee
     * @return 
	*@return-> total employee wage 
	*/
	public int calculatedEmployeeWage()
	{
		//VARIABLES
		int totalEmployeeHour=0;
		int employeeHour=0;
		int totalWage=0;
		int totalWorkingDays=0;

		while(totalWorkingDays<getMaxDays() && totalEmployeeHour<getMaxWorkingHour())
		{
			totalWorkingDays++;

	 		//COMPUTATION
			int empCheck = (int)( Math.random() * 10 ) % 3;

			switch(empCheck)
                      {
				case 1:
					employeeHour=4;
					break;

				case 2:
					employeeHour=8;
					break;

				 default:
					employeeHour=0;
		      }

		//calculated total employee hour
		totalEmployeeHour=(totalEmployeeHour + employeeHour);

		//calculated total Salary
		totalWage=(getEmpRatePerHour() * totalEmployeeHour);

                }
		//return totalWage
		         return totalWage;
	}
        public static void main(String[] args)
          {
		int maxDays,maxWorkingHour,empRatePerHour;

                     // Create a Scanner object
                Scanner Keyword = new Scanner(System.in); 
    		System.out.println("Enter Company Name");
    		String companyName = Keyword.nextLine();
		System.out.println("Enter Employee rate per hours");
		empRatePerHour=Keyword.nextInt();
		System.out.println("Enter workings days");
		maxDays=Keyword.nextInt();
		System.out.println("Enter Maximum hours in month");
		maxWorkingHour=Keyword.nextInt();
		EmployeeWage  obj1= new EmployeeWage(companyName,empRatePerHour,maxDays,maxWorkingHour);
		int totalComWage=obj1.calculatedEmployeeWage();
                System.out.println("Total Wage of  Employee:" +totalComWage);
           }


    }

