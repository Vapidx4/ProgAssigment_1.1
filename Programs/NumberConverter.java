import java.util.Scanner;
public class NumberConverter {

    /**
     * Converts the given octal number to a decimal
     * @author Brandon Lee Felix
     * @since 17/9/21
     */

    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);
        System.out.println("Please enter a 4-digit Octal number:");
        double octal = myInput.nextDouble();

        //converts to char and gets the digits individually
        char charString1 = String.valueOf(Math.round(octal)).charAt(0);
        char charString2 = String.valueOf(Math.round(octal)).charAt(1);
        char charString3 = String.valueOf(Math.round(octal)).charAt(2);
        char charString4 = String.valueOf(Math.round(octal)).charAt(3);

        //converts to integer
        int o1 = Character.getNumericValue(charString1);
        int o2 = Character.getNumericValue(charString2);
        int o3 = Character.getNumericValue(charString3);
        int o4 = Character.getNumericValue(charString4);

        // converts to decimal
        double d1 = o1 * Math.pow(8, 3);
        double d2 = o2 * Math.pow(8, 2);
        double d3 = o3 * Math.pow(8, 1);
        double d4 = o4 * Math.pow(8, 0);

        double deci = d1 + d2 + d3 + d4;


        String octalValue = "Octal Value";
        String deciValue = "Decimal Value";
        String format = "%-10s %8s %1s %n";

        System.out.printf(format,octalValue, ":", Math.round(octal));
        System.out.printf(format,deciValue, ":", Math.round(deci));
    }
}
