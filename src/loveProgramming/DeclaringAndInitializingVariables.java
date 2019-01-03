package loveProgramming;

import java.lang.*;

public class DeclaringAndInitializingVariables {

    public static void main(String[] args) {

        //Declaring and Initializing in 2 lines

        int myNumber;//Declaration

        //System.out.println("My Number is"+myNumber);
        myNumber = 10; //initialization

//        System.out.println("My Number is "+myNumber);

        //Declaring and Initializing in 1 line

        double myDouble = 7.50;

//        System.out.println("My Double is "+ myDouble);

        //Declaring multiple variables in 1 one
        float myFloat1,myFloat2,myFloat3;

        float myFloat4; float myFloat5; //This is also allowed

//        double myDouble1, double myDouble2; //Doesn't compile;

        int int1, int2;

        //int int3, int int4; //Doesn't compile

        //int int = 10; //doesn't compile : don't use keywords

        /*
        ********** Class Work **********
         */

//        String myString, myString1, myString2, myString3;

//        String myString = "Bobby";
//        String myString1 = "Jyothi";
//        String myString2 = "Catherine";
//        String myString3 = "Rachel";

        String myString = "Bobby", myString1 = "Jyothi", myString2 = "Catherine", myString3 = "Rachel";

        System.out.println("My family: "+ myString + " " + myString1 + " " + myString2 + " " + myString3);



    }
}