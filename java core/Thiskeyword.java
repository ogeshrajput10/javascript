public class Thiskeyword {
     
          int rollno;  
          String name;  
          float fee;  
          Thiskeyword(int rollno,String name,float fee){  
          this.rollno=rollno;  
          this.name=name;  
          this.fee=fee;  
          }  
          void display(){System.out.println(rollno+" "+name+" "+fee);}  
          }  
            
          class TestThis2{  
          public static void main(String args[]){  
               Thiskeyword s1=new Thiskeyword(111,"ankit",5000f);  
          Thiskeyword s2=new Thiskeyword(112,"sumit",6000f);  
          s1.display();  
          s2.display();  
          }}  
          

