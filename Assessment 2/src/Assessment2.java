/*
 * Assessment 2
 * Student name: Ngoc Han Luu
 * Student ID: 33104824
 * Copyright (c) 2022  Monash University
 * Written by  Jonny Low
 */
import java.util.Scanner;
public class Assessment2 {
    public static void main(String[] args) {
        Assessment2 a2 = new Assessment2();


// Instruction: To run your respective task, uncomment below individually

//        a2.task1(22);          // testing values
//        a2.task1(40);
//        a2.task1(45);
//        a2.task1(61);


//        a2.task2();
//        a2.task3();
//        a2.task4();

//        test your task 5 here
//        a2.pythagorasTheorem(3,4);

    }

    private void task1(int n) {
        // code your task 1 here

        // TRUE when ... 0 > n > 40    OR    50 > n > 100
        if (n > 0 && n < 40 || n > 50 && n <= 100) {
            System.out.println("n: " + n + " expect true get true");
            return;
        }
        // FALSE when .... 40 > n > 50, and 'n' is not divisible by 2
        if (n >= 40 && n <= 50 && n % 2 == 1) {
            System.out.println("n: " + n + " expect false get false");

        // HOWEVER, if 40 > n > 50 AND 'n' IS divisible by 2, then return TRUE
        } else {
            System.out.println("n: " + n + " expect true get true");
        }
        // test values in "Public Static Void"

    }

    private void task2() {
        // code your task 2 here
        boolean x = true;
        boolean y = false;

        System.out.println("Before swapping: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        boolean z = x;
        x = y;
        y = z;

        System.out.println("Before swapping: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }

    private void task3() {
        // code your task 3 here
        int height = 20;
        // angles of each block
        float angleBlockA = 53.13F;
        float angleBlockB = 41.00F;

        // convert angles to radians = (pi/180 * angle)
        double radianBlockA = (Math.PI / 180) * angleBlockA;
        double radianBlockB = (Math.PI / 180) * angleBlockB;

        // Use Tangent to find the base of triangle for both block A and B
        double baseLengthBlockA = (height/Math.tan(radianBlockA));
        double baseLengthBlockB = (height/Math.tan(radianBlockB));

        // Find the area of base between block A and B
        double area = baseLengthBlockA * baseLengthBlockB;
        System.out.println(Math.ceil(area) + " blocks is required");

        //

    }


    private void task4() {
        // code your task 4 here
        // create a method
        // declare variables x and y and get the input value

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 'x' and 'y' values:");
        System.out.print("x = ");
        int x = scan.nextInt();

        System.out.print("y = ");
        int y = scan.nextInt();

        int bitwiseAnd = x&y;
        int bitwiseExclusiveOr = x^y;

        System.out.println("\nResults:");
        System.out.println("x & y = " + bitwiseAnd);
        System.out.println("x ^ y = " + bitwiseExclusiveOr);

        /**********
         PART 1 EXPLANATION: Bitwise AND
         1. User inputs two values for x and y
         2. Values for x and y are converted into binary
         3. Binary values are added up with each other
         Rules:  i.e 0 & 0 = 0
                     0 & 1 = 0
                     1 & 0 = 0
                     1 & 1 = 1  ... Hence, both x and y needs to be identical for results to be greater than 0

         4. Once a result is produced, the results will convert binary into decimal number as the final output

         Example:
         Binary: x = 1010   Decimal  x = 10
                 y = 0111            y = 7
                ===========
                     0010    --> Outcome = 2

        ---------------------------------------------------------------------------------------------------------
        PART 2 EXPLANATION: Bitwise Exclusive OR
         1. User inputs two values for x and y
         2. Values for x and y are converted into binary
         3. Binary must follow the rules when producing the result of binary numbers:
         Rules:  i.e 0 ^ 0 = 0
                     0 ^ 1 = 1
                     1 ^ 0 = 1
                     1 ^ 1 = 0   ... Exclusive OR means both 1's will
         4. Once a result is produced, the results will convert binary into decimal number as the final output

         Example:
         Binary: x = 1010   Decimal  x = 10
                 y = 0111            y = 7
                ===========
                   = 1101   --> Outcome: 13
         ***********/

    }

    // task 5
    private void pythagorasTheorem(double a, double b) {
        double insideSquareRoot = Math.pow(a, 2) + Math.pow(b, 2);
        double c = Math.sqrt(insideSquareRoot);
        System.out.println("c = " + c);

    }
}

