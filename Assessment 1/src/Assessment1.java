/*
 * Week 03 Assessment Solution (3%)
 * Student name: Ngoc Han Luu
 * Student ID: ********
 * Copyright (c) 2022  Monash University
 * Written by  Jonny Low
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class Assessment1<num_books> {

    public static void main(String[] args) {

        Assessment1 a1 = new Assessment1();

        // Instruction: To run your respective task, uncomment below individually
//        a1.task1();
//        a1.task2();
//        a1.task3();
//        a1.task4();
//        a1.task5();

    }

    private void task1() {
        // code your task 1 here
        System.out.println("TASK 1:");
//	1. Without using variables at all
        System.out.println(5);
        System.out.println(8);
        System.out.println(4);
        System.out.println(2);
        System.out.println(5 + 8 + 4 + 2); // output: 19

//	2. Using 4 independent variables (one for each number) and another variable for their sum
        // initialise variable
        int num1 = 5;
        int num2 = 8;
        int num3 = 4;
        int num4 = 2;
        int sum = num1 + num2 + num3 + num4;

        System.out.println(sum); // output: 19

//	3. Reusing just one variable for the numbers and one additional variable for their sum
        int var1 = 5;
        int var2 = var1;
        var2 += 8 + 4 + 2;
        System.out.println(var2); // output: 19
    }

    private void task2() {
        System.out.println("TASK 2");
        // code your task 2 here

        // 1. Your jogging speed in miles per hour (mph).
        byte speed = 4;
        System.out.println("1. My jogging speed: " + speed + "mph");

        // 2. FIT1051 lecturer allocated to a workshop.
        String day = "Monday";
        String available = "mornings";
        System.out.println("2. FIT1051 classes are running on: " + day + " " + available);

        // 3. The capacity of passengers in a train wagon.
        int passengers = 700;

        if (passengers > 750) // max is 200 passengers
            System.out.println("3. Too many passengers on the train. Must be less than 200 passengers in a train wagon.");
        else
            System.out.println("3. Train wagon can proceed to carry " + passengers + " on board.");

        // 4. The length of a desk in millimetres.
        float desk_length_cm = 25.5F;
        float desk_length_mm = desk_length_cm / 10;

        System.out.println("4. Desk length: " + desk_length_mm + "mm");

        // 5. The state of a light switch.
        String light = "on";
        if (light == "on")
            System.out.println("5. Light is: " + light);
        else if (light == "off")
            System.out.println("5. Light is: " + light);
        else
            System.out.println("5. Light condition: is not available");

        // 6. The number of books on a library shelf
        int num_books = 2_000_000;
        System.out.println("6. Number of children books in the library: " + num_books);


        // 7. The amount of COVID vaccination a person can have so far.
        byte no_covid_vax = 3;
        System.out.println("7. A person can only have a maximum of: " + no_covid_vax + " covid vaccination");


        // 8. The current temperature of the day.
        int temp_today = 25;
        if (temp_today >= 30)
            System.out.println("8. Today is hot! It is: " + temp_today + "˚C.");
        else
            System.out.println("8. Today is cold! It is: " + temp_today + "˚C.");

        // 9. The number of Ace in a deck of cards.
        short ace_in_deck = 4;      // maximum of 4 suits for each playing card
        System.out.println("9. Number of ace in a deck of cards: " + ace_in_deck);

        // 10. The memory size of a computer chip.
        int computer_memory_size = 2;  // in terabit
        System.out.println("10. The memory size of the computer chip is: " + computer_memory_size + "TB");

        // 11. The state of a traffic light, which can either “RED”, “YELLOW”, or “GREEN”. (Hint: data types need to be declared and initialise before use)
        String traffic_light_go = "GREEN";
        String traffic_light_slow = "YELLOW";
        String traffic_light_stop = "RED";

        System.out.println("11. You must GO if the traffic light is: " + traffic_light_go);
        System.out.println("    You must SLOW DOWN if the traffic light is: " + traffic_light_slow);
        System.out.println("    You must STOP if the traffic light is: " + traffic_light_stop);

    }

    private void task3() {
        // code your task 3 here
        // Declare variables with data type float, int, String, double and boolean and give all of them an initial sensible value of the appropriate type.

        // 	1. Which conversions does Java perform automatically?
               /*
                   1. float --> double
                   2. float --> int
                   3. int --> double
                   4. int --> float
               */

        int myInt = 100;
        float myFloat = 1934.2942F;
        String myString = "myString";
        double myDouble = 242.592528593D;
        boolean myBoolean = true;

        // Float to int
        myInt = (int) myDouble;
        System.out.println(myInt);

        // Float to double
        myDouble = myFloat;
        System.out.println(myDouble);

        // int to float
        myFloat = myInt;
        System.out.println(myFloat);

        // int to string N/A

        // int to  double
        myDouble = myInt;
        System.out.println(myDouble);

        // String to float                  // error
        // myFloat = myString;
        // System.out.println(myFloat);

        // String to int                    // error
        // myInt = myString;
        // System.out.println(myInt);

        // string to double                 // error
        // myDouble = myString;
        // System.out.println(myDouble);

        // Double to float
        myFloat = (float) myDouble;
        System.out.println(myFloat);

        // Double to int
        myInt = (int) myDouble;
        System.out.println(myInt);

        // Double to String                 // error
        // myString = (String)myDouble;
        // System.out.println(myDouble);

        //	2. Which conversions will Java perform with a cast? What are the side effects of these cast(s)?

        /*
         * Java will perform cast from:
         * (WIDENING) - int --> float --> double
         * (NARROWING) - double --> float --> int
         *
         * Side effects:
         * int --> float: int value will become a decimal number (with .0 after the int value)
         * int --> double: int value will become a decimal number (with .0 after the int value)
         * float --> int: the values after the decimal point of the float will be removed, and will be left as an int value
         * float --> double: double will be exactly the same value as float
         * double --> int: the values after the decimal point of the double will be removed, and will be left as an int value
         * double --> float: value will only have up to 6-7 decimal places
         */

    }

    private void task4() {
        // code your task 4 here
        String face1 = ("                   @@@@@@@@@@@@@@@");
        String face2 = ("                  @@@@@@@@@@@@@@@@@");
        String face3 = ("                 @@@@@@@@@@@@@@@@@@@@");
        String face4 = ("                @@@@@@@@@@@@@@@@@@@@@@");
        String face5 = ("               @@@@@@    @@@@@@     @@@");
        String face6 = ("              @@@@@@      @@@@      @@@@");
        String face7 = ("             @@@@@@@@    @@@@@@    @@@@@@");
        String face8 = ("             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        String face9 = ("              @@@@@@@@@@@@@@@@@@@@@@@@@@@");
        String face10 = ("               @@@@@@@   @@@@@@@   @@@@@");
        String face11 = ("                 @@@@@@@   @@@@   @@@@@@");
        String face12 = ("                  @@@@@@@        @@@@@@");
        String face13 = ("                   @@@@@@@@@@@@@@@@@");
        String face14 = ("                    @@@@@@@@@@@@@@@");
        String face15 = ("                      @@@@@@@@@@@");

        System.out.println(face1 + "\n" + face2 + "\n" + face3 + "\n" + face4 + "\n" + face5 + "\n" + face6 + "\n" + face7 + "\n" + face8 + "\n" + face9 + "\n" + face10 + "\n" + face11 + "\n" + face12 + "\n" + face13 + "\n" + face14 + "\n" + face15);

    }

    private void task5() {
        // code your task 5 here

        // PART 1 - WHAT IS THE ERROR?
        String S = null;
        System.out.println(S.length());

        /*
         * Error Message: "Cannot invoke 'String.length()' because "S" is null"
         * Since S is initialised to null, it means that it doesn't contain any content or indicates that it has nothing.
         * Hence, when calling to the terminal to produce S.length, it is not possible because S has no value.
         */

        // PART 2 - HOW THE ERROR OCCURRED:
        /*
         * 1. Processes that String S is initialised to null.
         * 2. Since null means that the assigned value of S does not have any place to refer to the information containing its value or any information can provide its length.
         * 3. Since the string has no location to where the data is being stored, the compiler receives an error message
         */

    }

}
