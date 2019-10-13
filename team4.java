    public static void computeNewNetPay(double hours) {

         hoursWorked = hours;
         rateOfPay = 5.85;      // Change rate of pay
         withholdRate = 0.15;  // Change this rate
         grossPay = hoursWorked * rateOfPay;
         netPay = grossPay - (grossPay * withholdRate);

    }