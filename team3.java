    public static void computeNetPay(double hours) {

         hoursWorked = hours;
         rateOfPay = 5.85;
         withholdRate = 0.15;
         grossPay = hoursWorked * rateOfPay;
         netPay = grossPay - (grossPay * withholdRate);

    }