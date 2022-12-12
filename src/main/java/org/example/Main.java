package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        final int quartPerGallon = 4;
        int gallon = 4;
        final double gallonPrice = 29.99;
        final double quartPrice = 9.99;
        int gallonsNeeded;
        double measurements;
        int quartsNeeded;
        double finalQuartsPrice;
        double totalGallonsPrice;
        String finalGallonsPrice;
        String total;

        Scanner input = new Scanner(System.in);
        System.out.println("There are " + quartPerGallon + " Quarts per Gallon\nThe price per gallon is £" + gallonPrice + "\nThe price per quart is £" + quartPrice);
        System.out.println("Input your measurements and we will calculate how many quarts and gallons you will need.");
        measurements = input.nextDouble();
        input.nextLine();
        System.out.println("Your measurements are >> " + measurements);
        gallonsNeeded = (int) (measurements / gallon);
        quartsNeeded = (int) Math.round(measurements % gallon);
        System.out.println("Your requirements are " + gallonsNeeded + " gallons and " + quartsNeeded + " quarts");
        totalGallonsPrice = gallonPrice * gallonsNeeded;
        finalQuartsPrice = quartPrice * quartsNeeded;
        finalGallonsPrice = String.format("%.2f",totalGallonsPrice);
        System.out.println("The total price for the gallons is £" + finalGallonsPrice + " and £" + finalQuartsPrice + " for the quarts");
        total = String.format("%.2f",finalQuartsPrice + Double.parseDouble(finalGallonsPrice));
        System.out.println("Your total price is £" + total + "\nThank you very much for your custom");
    }
}