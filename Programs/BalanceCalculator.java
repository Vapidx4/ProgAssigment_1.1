import java.util.Scanner;
public class BalanceCalculator {

    /**
     * Calculates the future balance through compound interest
     * @author Brandon Lee Felix
     * @since 17/9/21
     */

    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);
        //inputs
        System.out.println("Please enter the initial balance:");
        double initialBalance = myInput.nextDouble();
        System.out.println("Please enter the annual interest rate:");
        double intRate = myInput.nextDouble();
        System.out.println("Please enter the number of years the client wants to save money in the bank:");
        double years = myInput.nextDouble();

        //compound interest formula
        double rate = 1 + (intRate/100);
        double ratePower = Math.pow(rate, 5);
        double finalBalance = initialBalance * (ratePower);

        //formatting
        String headingBalance = "Initial Balance";
        String headingRate = "Annual Interest Rate";
        String headingYears = "Saving Years";
        String divider = "--------------------------------------";
        String format =  "%-20s %8s %7.2f%% %n";
        String format2 = "%-20s %8s %8.2f %n";
        String format3 = "%-20s %8s %8s %n";
        String format4 = "%-10s %1s %1s %7s %8.2f";

        //return
        System.out.printf(format2,headingBalance, ":", initialBalance);
        System.out.printf(format,headingRate, ":", intRate);
        System.out.printf(format3,headingYears, ":", Math.round(years));
        System.out.println(divider);
        System.out.printf(format4, "Balance After", Math.round(years), "Years", ":", finalBalance);
    }
}
