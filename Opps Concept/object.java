// public class object{
//   String name ;
//   int rollno;

// // This is a function 
//   public void printdata(){
//     System.out.println(name);
//     System.out.println(rollno);
//   }

// // This is a object 
//   public static void main(String args[]){
//     object sd1 = new object();
//     sd1.name = "Sunil";
//     sd1.rollno = 20;
//     sd1.printdata();

//     object sd2 = new object();
//     sd2.name = "aman";
//     sd2.rollno = 45;
//     sd2.printdata(); 
//   }
// }

// ------------ Practice --------------
public class object {
  // This is a class
  String name;
  int rollno;

  // This is a function
  public void printdata() {
    System.out.println(name);
    System.out.println(rollno);

  }

  public static void main(String[] args) {
    // This is a object
    object sd1 = new object();
    sd1.name = "sunil";
    sd1.rollno = 45;
    sd1.printdata();
    // System.out.println(sd1.name);
    // System.out.println(sd1.rollno);
  }
}