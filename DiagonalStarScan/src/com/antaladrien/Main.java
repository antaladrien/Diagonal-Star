package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Print diagonal star");
        System.out.println("Enter number (>5): ");
        int num = myObj.nextInt();

        printSquareStar(num);
    }

    public static void printSquareStar(int number) {
        int currentRow = 1;
        if (number >= 5) {
            while (currentRow <= number) {
                int columnNumber = 1;
                while (columnNumber <= number) {
                    if (currentRow == 1 || currentRow == number) {
                        System.out.print("*");
                    } else if (columnNumber == 1 || columnNumber == number) {
                        System.out.print("*");
                    } else if (currentRow == columnNumber) {
                        System.out.print("*");
                    } else if (columnNumber == number - currentRow + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    columnNumber++;
                }
                currentRow++;
                System.out.println();
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
