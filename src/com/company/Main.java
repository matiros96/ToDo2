package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Declaring stuff
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanTask = new Scanner(System.in);
        Scanner scanChoice = new Scanner(System.in);

        int choice =  0;
        String task = null;

        // User chooses option in main menu
        while ( choice < 5) {
            System.out.println("Please select one of the following: ");
            System.out.println("1 - View list");

            System.out.println("2 - Add to list");

            System.out.println("5 - Exit program");

            choice = scanChoice.nextInt();


            if (choice == 1) {
                // positive branch


                }
                else if (choice == 2) {
                    task = scanTask.next();
                    list.add(task);
                    System.out.println(task + " added to list.");
                }
            }
            System.out.println("Quitting");
            System.exit(0);


        }}}