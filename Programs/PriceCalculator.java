package com.company;
import java.util.Scanner;
public class PriceCalculator {

        /**
         * Calculates the price of a purchase after taxes and discounts
         * @author Brandon Lee Felix
         * @since 17/9/21
         */

    public static void main(String[] args) {

            Scanner myInput = new Scanner(System.in);
            //inputs
            System.out.println("Please enter the price:");
            double price = myInput.nextDouble();
            System.out.println("Please enter the discount ratio:");
            double discount = (myInput.nextDouble()*0.01);

            //format
            String headingOriginalPrice = "Original Price";
            String headingDiscount = "Discount Ratio";
            String headingPriceBeforeTax = "Price Before Tax";
            String headingFederalTax = "Federal Tax";
            String headingProvincialTax = "Provincial Tax";
            String headingFinalPrice = "Final Price";
            String divider = "--------------------------------------";
            String format = "%-20s %8s %1s %n";
            String formatF = "%-20s %8s %1.2f %n";

            //math
            double priceBeforeTax = (price - Math.round((price * discount)*100)/100);
            double federalTax = 0.05 * priceBeforeTax;
            double provincialTax = 0.09975 * priceBeforeTax;
            double finalPrice = (provincialTax + federalTax + priceBeforeTax);

            //returns
            System.out.printf(format,headingOriginalPrice, ":", price);
            System.out.printf(format,headingDiscount, ":", discount);
            System.out.printf(format,headingPriceBeforeTax, ":", priceBeforeTax);
            System.out.println(divider);
            System.out.printf(formatF,headingFederalTax, ":", federalTax);
            System.out.printf(formatF,headingProvincialTax, ":", provincialTax);
            System.out.printf(formatF,headingFinalPrice, ":", finalPrice);







        }
    }
