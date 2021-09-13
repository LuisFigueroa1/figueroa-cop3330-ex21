package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 21 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String month; //month name
        int monthN; //month number

        System.out.print("Please enter the number of the month: ");
        monthN = userInput.nextInt(); //scan for the month number

        switch (monthN) { //start of the switch case to match to the corresponding number
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default: //error case
                month = "not available";
                break;
        }

        System.out.print("The name of the month is " + month + ".");

    }
}