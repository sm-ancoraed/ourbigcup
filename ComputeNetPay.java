/*

Awaiting net pay data
 */


public class ComputeNetPay {
    public static void computeNetPay(double hours, double payrate, double withhold) {

        hoursWorked = hours;
        withholdRate = withhold / 100;
        rateOfPay = payrate;
        grossPay = hours * rateOfPay;
        netPay = grossPay - (grossPay * withholdRate);

    }
}
