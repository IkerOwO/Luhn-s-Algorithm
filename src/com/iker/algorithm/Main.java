package com.iker.algorithm;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el numero de la tarjeta: ");
        long cardNumber = s.nextLong();
        checkCard(cardNumber);
        s.close();
    }

    public static void checkCard(long cardNumber) {
        int position = 0;
        int sum = 0;

        while (cardNumber > 0) {
            int digit = (int)(cardNumber % 10);

            if (position % 2 == 0) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }

            sum += digit;
            cardNumber /= 10;
            position++;
        }

        if (sum % 10 == 0) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }
}

