
/**
 * inherit
 */
 interface data1{
void add(int a , int b);
    
}
interface data extends data1{
    void show ();
}

/**
 * Innerinherit1
 */
class Innerinherit1 implements data {

    public void show(){
        System.out.println("This is show method from Derived class");
    }
    
    public void add(int a, int b){
        System.out.println("Addition: " + (a+b));
    }
}

public class inter  extends Innerinherit1{
    
    public static void main(String[] args) {
        Innerinherit1 obj = new Innerinherit1();
        obj.show();
        obj.add(10, 20);
      
        










        
    }
}