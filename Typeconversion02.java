package Java;


import java.util.*;
public class Typeconversion02 {
    public static void main(String[] args) {
        // int i = 45;
        // double d = i; // implicit type conversion
        // System.out.println("int to double: " + d);
        // double d2 = 3.14;
        // int i2 = (int) d2; // explicit type conversion
        // System.out.println("double to int: " + i2);

        // // -------------------type casting with Scanner-------------------------
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter an integer: ");
        // int num = scanner.nextInt();
        // double d3 = num; // implicit type conversion
        // System.out.println("Integer to double: " + d3);
        // scanner.close();

        // //------------------ type casting with try-catch block---------------
        // try {
        //     System.out.print("Enter a double: ");
        //     double d4 = scanner.nextDouble();
        //     int i3 = (int) d4; // explicit type conversion
        //     System.out.println("Double to int: " + i3);
        // } catch (Exception e) {
        //     System.out.println("Invalid input. Please enter a valid double.");
        // }
        // scanner.close();

        // //------------------ type casting with String to primitive types------------------
        // String str = "45";
        // int i4 = Integer.parseInt(str); // string to int
        // double d5 = Double.parseDouble(str); // string to double
        // System.out.println("String to int: " + i4);
        // System.out.println("String to double: " + d5);

        // //------------------ type casting with String to wrapper class------------------
        // String str2 = "45";
        // Integer i5 = Integer.valueOf(str2); // string to Integer
        // Double d6 = Double.valueOf(str2); // string to Double
        // System.out.println("String to Integer: " + i5);
        // System.out.println("String to Double: " + d6);

        // //------------------ type casting with wrapper class to primitive types------------------
        // Integer i6 = Integer.valueOf(45);
        // Double d7 = Double.valueOf(3.14);
        // int i7 = i6.intValue(); // Integer to int
        // double d8 = d7.doubleValue(); // Double to double
        // System.out.println("Integer to int: " + i7);
        // System.out.println("Double to double: " + d8);

        //     Scanner scanner = new Scanner(System.in);
        //     System.out.println("enter a name : ");
        //   int num  = scanner.nextInt();
        //   System.out.println("name : "+ num);
    
       float a = 2.2f;
       int rupee = (int)a;
       float paise = (a-rupee);
       System.out.println(paise);
       if (paise >= 0.5f) {
        System.out.println(rupee+1);
       }
       else{
        System.out.println(rupee);
       }

      }
       }
    




