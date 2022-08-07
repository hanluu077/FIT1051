/*
 * Assessment 3
 * Student Name: Ngoc Han Luu
 * Student ID: ********
 * Copyright (c) 2022  Monash University
 * Written by  Jonny Low
 *
 */
import java.util.Arrays;
import java.util.*;

public class assessment3<radius> {

    public static void main(String[] args) {

        assessment3 a3 = new assessment3();

        // Instruction: To run your respective task, uncomment below individually

//        a3.callingMethod();
//        a3.task2();
//        a3.task3();
//        a3.gradeScale("80");
//        a3.daysOfTheWeek("5");
//        a3.task6();
//        a3.task7();

    }

    // TASK 1
    private void callingMethod() {
        // code your task 1a (calling method) here
        double[] arr = {10000, 20000, 30000, 40000, 50000};
        System.out.println("Value Type: " + arr[0]);
        System.out.println("Reference Type: " + Arrays.toString(arr));

        calledMethod(arr, arr[0]);

        System.out.println("\nValue Type: " + arr[0]);     // Doesn't affect the original value
        System.out.println("Reference Type: " + Arrays.toString(arr)); //affects the original value
    }

    private void calledMethod(double[] a, double b) {
        // code your task1b (called method) here
        a[1]++;     // increments the reference type
        b++;        // incrementing value type

        // param b was not used as is a different copy.
    }

    // TASK 2
    private void task2() {
        // code your task 2 here
        int num = 1;
        String str = String.format("%04d\n %03d \n %02d  \n %01d   ", num, num, num, num);
        //System.out.println(str);

        String reverse = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            reverse = ch + reverse; //adds each character in front of the existing string
        }
        System.out.println(reverse);

    }

    // TASK 3
    private void task3() {
        // code your task 3 here

        // 1. create a list which has a capacity of 10
        int[] myList = new int[10];

        // 2. add 1, 7, 5, 3, 8, 10 into the list
        myList[0] = 1;
        myList[1] = 7;
        myList[2] = 5;
        myList[3] = 3;
        myList[4] = 8;
        myList[5] = 10;

        // 3. insert the value '11' between 5 and 3 --> index [3]
        // expectant output: [1, 7, 5, 11, 3, 8, 10, 0, 0, 0]
        int element = 11;
        int position = 3;

        for (int i = myList.length - 1; i > position; i--) {
            myList[i] = myList[i - 1];
        }
        myList[position] = element;

        // 4. print out all the elements in the list
        System.out.println("New Array: " + Arrays.toString(myList));

        // 5. delete the second last element in the myList
        // need to make a new array to make the array myList - 1, then copy elements except it is the deleted 'index'

        int index = myList.length - 1; // Second last element in array
        int[] newArray = new int[myList.length - 1];
        int counter = 1; // only delete one value

        for (int i = 0; i < myList.length - 1; i++) {
            if (myList[i] == myList[index]) {
                counter--;
            } else {
                newArray[i] = myList[i];
            }
        }
        System.out.println("Deleted value: " + Arrays.toString(newArray));

        // 6. Print true if array contains 7. else print false
        int containsNum = 7;
        boolean inArray = false;
        for (int n : newArray) {
            if (n == containsNum) {
                inArray = true;
                break;
            }
        }
        if(inArray)
            System.out.println("True. " + containsNum + " is in the array.");
        else
            System.out.println("False. " + containsNum + " is not in the array.");
    }

    // TASK 4
    private String gradeScale(String mark) {
        String retVal = " ";

        if (isNumeric(mark)) {
            int grade = Integer.parseInt(mark);
            if (grade >= 80) {
                if (grade > 100)
                    System.out.println("Error: Mark is over limit");
                else
                    System.out.println("HD: High Distinction");
            } else if (grade >= 70)
                System.out.println("D: Distinction");
            else if (grade >= 60)
                System.out.println("C: Credit");
            else if (grade >= 50)
                System.out.println("P: Pass");
            else if (grade <= 49) {
                System.out.println("N: Fail");
            } else {
                retVal = "not in range";
            }
        }
        return retVal;
    }

    private boolean isNumeric(String input) {
        boolean isNum = false;
        try {
            Double.parseDouble(input);
            isNum = true;
        }
        catch (Exception e){
            System.out.println("Error: Mark must be an integer");
            // ignore the error, the default return is false
        }
        return isNum;
    }

    // TASK 5
    private void daysOfTheWeek(String stringDay) {
        // code your task 5 here. You should create your own method shell.
        int day = Integer.parseInt(stringDay);
        String output = "";

        switch (day) {
            case 1:
                output = "Monday";
                break;

            case 2:
                output = "Tuesday";
                break;

            case 3:
                output = "Wednesday";
                break;

            case 4:
                output = "Thursday";
                break;

            case 5:
                output = "Friday";
                break;

            case 6:
                output = "Saturday";
                break;

            case 7:
                output = "Sunday";
                break;

            default:
                output = "there are only 7 days in a week";
        }
        System.out.println(output);
    }

    // TASK 6
    private void task6() {
        // code your task 6 here
        int radius = 1;

        for (int i = radius; i < 30; i++) {
            double area = Math.PI * Math.pow(radius, 2);
            double circumference = 2 * Math.PI * radius;
            System.out.println("Radius = " + radius);
            System.out.println("Area : Circumference " );
            System.out.println(String.format("%.3f", area) + " : "+  String.format("%.3f", circumference) + "\n" );


            //System.out.println("Area = " + String.format("%.3f", area));
            //System.out.println("Circumference = " + String.format("%.3f", circumference) + "\n");
            radius++;

        }
    }

    // TASK 7
    private void task7() {
        // code your task 7 here
        int size = 5;
        int length = size;
        int width = size;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j || (i + j) % width == width - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
