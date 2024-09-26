package Java;
/**
 * superkeyword
 */
 class keyword {
void show(){
    System.out.println("this is a superclass");
}
    
}
class subclass extends keyword{
    void show(){
        System.out.println("this is a subclass");
        super.show();
    }
}
public class Superkeyword {
    public static void main(String args[]){
subclass obj= new subclass();
obj.show();
    }  
}

