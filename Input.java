import java.util.*;
public class Input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n enter your name ");
        String name = input.nextLine();
        System.out.println(name);
        int a, b;
        System.out.print("enter a = "); 
        a=input.nextInt();
        System.out.print("enter b = ");
        b=input.nextInt();
        int c= a+b;
        System.out.println("sum = "+c);
     
}

    public String InputVariable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'InputVariable'");
    }
}


