//static Variable
class Student{
     int rollno; // instance variable
     String name;
     static String college = "LPU"; // Static variable
     
     //Constructor
     Student (int r , String n){
          rollno = r;
          name = n ;
     }
     // method to display the values
     void display(){
          System.out.println(rollno+ " "+name+" "+college);
     }
     //Test class to show the values of objects
     public class testStaticVariable1{
          public static void main(String args[]){
               Student s1 = new Student(111,"Karan");
               Student s2 = new Student(222,"vishal");
//We can change the college of all object by the single line of code
          Student.college = "lovely professional University";
          s1.display();
          s2.display();
     }
}
} 
