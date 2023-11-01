// class parentClass {
//      void display() {
//           System.out.println("parent class");
//      }
// }

// class childClass extends parentClass {
//      void show() {
//           System.out.println("child class");
//      }
// }

// public class inherit {
//      public static void main(String[] args) {
//           childClass in1 = new childClass();
//           in1.display();
//           in1.show();
//      }
// }

// Industry standard code 

// class vehical {
//      int milege;
//      int price;
//      String color;

//      void display() {
//           System.out.println(milege);
//           System.out.println(color);
//           System.out.println(price);
//      }

// }

// class car extends vehical {
//      String brand;
//      boolean sunroof;
//      String ftype;
// }

// public class inherit {
//      public static void main(String[] args) {
//           car c1 = new car();
//           c1.brand = "tata";
//           c1.color = "black";
//           c1.ftype = "Disel";
//           c1.milege = 10000;
//           c1.price = 4512454;
//           c1.sunroof = true;
//           c1.display();
//      }
// }

class vehical {
     String brand;
     int price;
     int milege;

     void display() {
          System.out.println(brand);
          System.out.println(price);
          System.out.println(milege);
     }
}

class car extends vehical {
     String color;
     String ftype;
}

public class inherit {
     public static void main(String[] args) {
          car c1 = new car();
          c1.brand = "tata";
          c1.color = "black";
          c1.ftype = "petrol";
          c1.milege = 30;
          c1.price = 500000;
          c1.display();
          System.out.println(c1.color);
          System.out.println(c1.ftype);

     }
}