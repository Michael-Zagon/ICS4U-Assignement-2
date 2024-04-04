/*
 * Assignment 2 program find max run
 *
 * @author Michael Zagon
 * @version 1.0
 * @since 2024-04-01
 */

import java.util.Scanner;

/**
* This is the standard "MaxRunFunction" program.
*/
final class MaxRun {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private MaxRun() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This function calculates the max run of a string.
    *
    * @param userString The user's input.
    *
    * @return maxRun The max run of the string
    */
    public static int maxRunFunction(String userString) {
        int maxRun = 1;
        int currentRun = 1;

        for (int temp = 0; temp < userString.length() - 1; temp++) {
            if (userString.charAt(temp) == userString.charAt(temp + 1)) {
                currentRun++;
                if (currentRun > maxRun) {
                    maxRun = currentRun;
                }
            } else {
                currentRun = 1;
            }
        }
        return maxRun;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {

        System.out.println("This is the max run program.");
        System.out.println("It finds the length of the max run in a string");
        System.out.println("STRING EX. xxyyyz, string has a max run of 3.");

        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        final String userString = scanner.nextLine().trim();

        // Error check
        if (userString.length() == 0) {
            System.out.println("Invalid input.");
        } else {
            // Process
            final int maxRun = maxRunFunction(userString);

            // Output
            System.out.print("The string \"" + userString);
            System.out.println("\" has a max run of " + maxRun + "!");
        }

        System.out.println("\nDone.");

    }
}
