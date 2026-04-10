package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        //prompt the user for the sandwich size
        System.out.print("What size sandwich would you like? ");
        String choice = scanner.nextLine();
        double reg = 5.45;
        double lg = 8.95;

        double sandwich = 0;
        double discount = 0;

        if(choice.equals("regular")){
             sandwich = reg;
            //System.out.print("regular sandwich");
        }else if (choice.equals("large")){
             sandwich = lg;
            //System.out.print("Large sandwich");
        }else{
            System.out.print("Invalid entry ");
        }
        System.out.print("Would you like that loaded? (yes/no) ");
        String loadedChoice = scanner.nextLine().toLowerCase();
        boolean loaded = loadedChoice.equals("yes");

        if (loaded && choice.equals("regular")){
            sandwich += 1.00;
        }else if (loaded && choice.equals("large")){
            sandwich += 1.75;
        }else {
            System.out.print("Not Loaded");
        }

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        if (age <= 17){
             discount = .10;
        } else if (age >= 65){
             discount = .20;
        } else {
            System.out.print("No Discount!!");
        }

        double finalPrice = sandwich - (sandwich * discount);
        System.out.printf("The final price is $%.2f%n" , finalPrice);
    }
}
