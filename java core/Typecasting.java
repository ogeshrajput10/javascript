public class Typecasting{
public static void main(String[] args) {
    float f = 10.5f; 
    int i = (int) f;
    System.out.println("The value of i is: " + i); 
    
    double d = 10.5;
    int j = (int) d;
    System.out.println("The value of j is: " + j);
    
    long l = 10000000000L;
    int k = (int) l;
    System.out.println("The value of k is: " + k);
    
    char c = 'A';
    int m = (int) c;
    System.out.println("The value of m is: " + m);
    
    boolean b = true;
    int n = (int) b;
    System.out.println("The value of n is: " + n);
    
    String str = "100";
    int o = Integer.parseInt(str);
    System.out.println("The value of o is: " + o);
    
    
}
}