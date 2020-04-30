package edu.ti.caih313.recursion;
import java.math.BigInteger;
import java.util.Scanner;

public class LastRecursion
{
    public static void main(String[] args)
    {
        LastRecursion tester = new LastRecursion();
        Scanner keyboard = new Scanner(System.in);

        boolean wantToPlay = true;
        while (wantToPlay)
        {
            System.out.println("Enter in numbers that you would like to see in factorial: ");
            BigInteger number = keyboard.nextBigInteger();
            BigInteger factorial = tester.factorial(number);
            System.out.println(number + "! = " + factorial);

            System.out.println("Would you like to try out another number? Write yes to play again, and no to exit.");
            String answer = keyboard.next();
            if (answer.equalsIgnoreCase("no")) {
                wantToPlay = false;
                System.out.println("Thanks for playing!");
            }
        }
    }

    public static int handshake(int number) {
        if (number <= 1) {return 0; }

        else if (number == 2) { return 1; }

        else
        {
            return number + handshake(number - 1);
        }
    }

    public static BigInteger factorial(BigInteger number) {
        if (number.compareTo(BigInteger.ZERO) == 0) {
            return BigInteger.ONE;
        }
        else {
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
        }
    }

    public static int findLargestValue(int[] array)
    {
        int maxValue;
    }
}
