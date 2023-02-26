//Task
// Given an integer, n, perform the following conditional actions:
// If n is odd, print Weird
// If n is even and in the inclusive range of n  to , print Not Weird
// If n is even and in the inclusive range of n to , print Weird
// If n is even and greater than , print Not Weird
// Complete the stub code provided in your editor to print whether or not n is weird.
//HackerRank

import java.util.Scanner;

public class JavaIfElse {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
