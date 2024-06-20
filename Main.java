package main;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        firststartinging(scnr);
    }

    static void firststartinging(Scanner scnr) throws IOException {

        System.out.println("Welcome to Ganap's chat App!");
        System.out.println("Please select from the following options:");
        System.out.println("(R)egister, (L)ogin, (Q)uit");
        System.out.println("---------------------------");

        String input = scnr.next();
        input = input.toLowerCase();
        switch(input) {
            case "r":
            case "register":
                register(scnr);
                break;
            case "l":
            case "login":
                login(scnr);
                break;
            case "q":
            case "quit":
                quit();
                break;
            case "j":
            case "Join":
                Join();
                break;
            case "c":
            case "Create":
                Create();
                break;
            case "a":
            case "Account":
                Account();
                break;
            case "l":
            case "LogOut":
                LogOut();
                break;
            default:
                System.out.println("Invalid input!\n");
                firstOpening(scnr);
                break;
        }

    }

    static void register(Scanner scnr) throws IOException {
        System.out.print("\nEnter a valid username: ");
        scnr.nextLine();
        String input = scnr.nextLine();
        while (input.contains(" ") || Account.usernameExists(input)) {
            if (input.contains(" ")) {
                System.out.print("\nUsername cannot contain a space. Enter a valid username: ");
                input = scnr.nextLine();
            } else {
                System.out.print("\nUsername already exists. Enter a valid username: ");
                input = scnr.nextLine();
            }
        }
        String newUsername = input;

        System.out.print("\nEnter a valid password: ");
        input = scnr.nextLine();
        while (input.contains(" ")) {
            System.out.print("\nPassword cannot contain a space. Enter a valid password: ");
            input = scnr.nextLine();
        }
        String newPassword = input;
        Account.createAccount(newUsername, newPassword);
        System.out.println("\nAccount successfully created!");
        
    }

    static void login(Scanner scnr) throws IOException {
        System.out.print("\nUsername");
        scnr.nextLine();
        String input = scnr.nextLine();
        while (!Account.usernameExists(input)) {
            System.out.print("Username does not exist. Please enter a valid username: ");
            input = scnr.nextLine();
        }
        String currentUsername = input;
        String password = Account.getPassword(currentUsername);
        System.out.print("\nPassword: ");
        input = scnr.nextLine();
        while (!(input.equals(password))) {
            System.out.print("Incorrect Password! Try again: ");
            input = scnr.nextLine();
        }
        System.out.print("\nWelcome"+Username+"!");
        
    }

    static void quit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

}