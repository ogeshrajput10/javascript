                    /*  simple inherit */
class Student {                                             // super inherit
    int  rollno = 1;
    int  marks =89;
    String studentname = "vishal";

}
class vishal extends Student{                               // sub inherit
void input(){
    System.out.println("Student " + studentname);
    System.out.println("Marks " + marks);
    System.out.println("Rollno " + rollno);
  }
    public static void main(String[] args) {
        vishal obj = new vishal();
        obj.input(); 
     
    }
}