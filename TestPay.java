/*
 * Project Complete
 * I am satisfy.
 */

/**
 *
 * @author <Mustafa>
 *
 */
public class TestPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pay m = new Pay();
        m.computeNetPay(20);
        m.info();
        m.computeNetPay(40, 12.50);
        m.info();
        m.computeNetPay(40, 10.00, 20);
        m.info();

    }

}
