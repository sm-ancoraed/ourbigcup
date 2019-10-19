

/**
 *
 Written by BigCup of Java
 <Cup of Java>
 <Java Perfection>
 Source:  pay.java
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
public class pay {
    public static void computeNewNetPay(double hours) {

        hoursWorked = hours;
        rateOfPay = 7.85;      // Change rate of pay
        withholdRate = 0.20;  // Change this rate
        grossPay = hoursWorked * rateOfPay;
        netPay = grossPay - (grossPay * withholdRate);

    }

    private static double hoursWorked;
    private static double rateOfPay;
    private static double withholdRate;
    private static double grossPay;
    private static double netPay;

    public static void computeNetPay(double hours, double rateOfPay, double withhold) {

// put code here

    }
   public static void computeNetPay(double hours, double payrate) {


        hoursWorked = hours;
        withholdRate = 0.20;
        rateOfPay = payrate;
        grossPay = hours * payrate;
        netPay = grossPay - (grossPay * withholdRate);


}

    public static void computeNetPay(double hours) {

        hoursWorked = hours;
        rateOfPay = 6.86;
        withholdRate = 0.15;
        grossPay = hoursWorked * rateOfPay;
        netPay = grossPay - (grossPay * withholdRate);

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
