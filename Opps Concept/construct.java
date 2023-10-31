// Constructor => In the constructor name is always same as class name 

// This is a class
// class students {
//      int id;
//      int age;

//      // This is a constructor
//      students(int id, int age) {
//           this.id = id;
//           this.age = age;
//           // System.out.println("Hello world");
//           System.out.println("Parametrized constructor");
//      }

//      students() {
//           System.out.println("default constructor");
//      }
// }

public class construct {
     // This is a class
     int id;
     int age;

     // This is a constructor
     construct(int id, int age) {
          // System.out.println("Hello World");
          System.out.println("parametrized constructor");
     }

     construct() {
          System.out.println("Default constructor");
     }

     // multiple constructor
     construct(int id, String name, int age) {
          System.out.println("parametrized constructor 2");
     }

     public static void main(String[] args) {
          // This is a default constructor
          construct sd1 = new construct(5, 10);
          // This is a parametrized constructor
          construct sd2 = new construct(5, 10);
          // This is a parametrized constructor
          construct sd3 = new construct(5, "Aman", 10);

     }
}
