package Java;
class operators{
  int a;
  int b;
  public void addition(int a , int b){
    this.a=a;
    this.b=b; 
System.out.println("Addition is :"+(a+b));
  }

  public void Subtraction(int a , int b){
    this.a=a;
    this.b=b;
    System.out.println("substraction is :"+(a-b));
  }
}

 class Singleinherit extends operators {
  public void divide(int a , int b){
    this.a=a;
    this.b=b;
    System.out.println("division is : " +(a/b));
  }
  public static void main(String[] args) {
    int a = 5, b= 25;
  Singleinherit calculations = new Singleinherit();
  calculations.addition(a , b);
  calculations.Subtraction(a , b);
  calculations.divide(a , b);
  }
 }
