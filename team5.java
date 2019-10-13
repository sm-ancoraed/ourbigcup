    public static void computeNewNetPay(double hours, double payrate) {

        hoursWorked = hours;
        withholdRate = 0.15;    // Change the rate
        rateOfPay = payrate;
        grossPay = hours * payrate;
		
		// New pay function, make something with automatic Overtime or Double Pay
		
        netPay = grossPay - (grossPay * withholdRate);
    }