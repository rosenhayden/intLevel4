package org.vashon;

//imports scanner
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a amount of money as a double");
        //creates new scanner
        Scanner scan = new Scanner(System.in);

        //scans for next double
        double money = scan.nextDouble();

        //divides answer by 10 because we want to know how many 10 dollar bills of money we have.
        int answer = (int)money / 10;

        //gets change
        double change = money - (10 * answer);

        //formats change to only have 2 decimal places
        String changeRounded = String.format("%.2f", change);
        
        //prints answer
        System.out.println("You have " + answer + " ten dollar bills.");
        System.out.println("You have " + changeRounded + " in change.");
    }
}
