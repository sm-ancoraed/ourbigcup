
/**
 *
   Writen by BigCup of Java
   <title>
   <Name of Project>
   
   Source:  Pay.java


	Write a class program that computes the Net pay.

	Gross pay and Net Pay is calculated and presented.


 Variables in Pay class:

 rateOfPay = hourly rate
 hoursWorked = number of hours worked (not used - documentation)
 grossPay = Gross pay is rateOfPay * hoursWorked
 withholdRate = withholding rate 15% of gross otherwise stated
 netPay = payment after all withholding are taken out

 * method computeNetPay(hoursWorked)
 * method computeNetPay(hoursWorked, rateOfPay)
 * method computeNetPay(hoursWorked, rateOfPay, withholdRate)
 * method computeNewNetPay(hoursWorked, rateOfPay)
 * method computeNewNetPay(hoursWorked, rateOfPay, withholdRate)
 * 

 */
public class Pay {

    private static double hoursWorked;
    private static double rateOfPay;
    private static double withholdRate;
    private static double grossPay;
    private static double netPay;

    public static void computeNetPay(double hours, double payrate, double withhold) {

// put code here

    }
    public static void computeNetPay(double hours, double payrate) {

// put code here

    }

    public static void computeNetPay(double hours) {

// put code here

    }
    public static void info() {
	
	// Talk to team members about the ComputeNewNetPay() methods
	// They should be printed
	//
         System.out.println("Hours worked " + hoursWorked);
         System.out.println("Rate of pay " + rateOfPay);
         System.out.println("Gross pay " + grossPay);
         System.out.println("With hold rate " + withholdRate);
         System.out.println("Net pay " + netPay);
         System.out.println("\n\n");
    }


}