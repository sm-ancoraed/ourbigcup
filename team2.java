    public static void computeNetPay(double hours, double payrate) {

        hoursWorked = hours;
        withholdRate = 0.15;
        rateOfPay = payrate;
        grossPay = hours * payrate;
        netPay = grossPay - (grossPay * withholdRate);
    }