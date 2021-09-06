/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        String output;
        double principal, ratePercentage, time, amountAccrued;

        System.out.println("Enter the principal:");
        scan = new Scanner(System.in);
        principal = Double.parseDouble(scan.next());

        System.out.println("Enter the rate as a percentage:");
        scan = new Scanner(System.in);
        ratePercentage = Double.parseDouble(scan.next());

        System.out.println("Enter the time:");
        scan = new Scanner(System.in);
        time = Double.parseDouble(scan.next());

        amountAccrued = principal * (1 + ((ratePercentage/100) * time));

        output = String.format("After %.0f years at %.2f%%, the investment will be worth $%.2f!", time, ratePercentage, amountAccrued);

        System.out.println(output);
    }
}