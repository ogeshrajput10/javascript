package mypackage;
import java.util.*;

public class mypack {
    public void week() {
      Scanner input = new Scanner(System.in);
      System.out.println("enter week name");
     String week = input.next();
 switch(week){
    case "Sun": System.out.println("1");
    break;
    case "Mon": System.out.println("2");
    break;
    case "Tue": System.out.println("3");
    break;
    case "Wed": System.out.println("4");
    break;
    case "Thu": System.out.println("5");
    break;
    case "Fri": System.out.println("6");
    break;
    case "Sat": System.out.println("7");
    break;
    default: System.out.println("Invalid week day");
    break;
 }
     }
public void month() {
    System.out.println("enter month number");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for (int i = 0; i < n; i++) {
     System.out.println(" your month  " + i);
      
    }
    }
  }


