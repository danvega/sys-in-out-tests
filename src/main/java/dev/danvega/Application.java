package dev.danvega;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // InputStream Source
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();
        validate("First Name", firstName);

        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();
        validate("Last Name", firstName);

        System.out.println("What is your email address?");
        String email = scanner.nextLine();
        validate("Email", firstName);

        // print to the console in the format of firstname,lastname,email
        System.out.println(firstName + "," + lastName + "," + email);
    }


    private static void validate(String label, String arg) {
        if(arg.trim().isEmpty()) {
            throw new IllegalArgumentException(label + " should not be empty.");
        }
    }
}
