//  To invoke variable class method

// class dog {
//      String color = "blue";
// }

// class cat extends dog {
//      String color = "red";

//      void printcolor() {
//           System.out.println(super.color);
//      }
// }

// public class superDemo {
//      public static void main(String[] args) {
//           cat c1 = new cat();
//           c1.printcolor();
//      }
// }

// To invoke parent class method

// class Animal {
//      void eat() {
//           System.out.println("Eating....");
//      }
// }

// class dog extends Animal {
//      void bark() {
//           System.out.println("barking....");
//      }

//      void eat() {
//           System.out.println("eating bread");
//      }

//      void work() {
//           super.eat();
//      }
// }

// public class superDemo {
//      public static void main(String[] args) {
//           dog brusllie = new dog();
//           brusllie.work();
//      }
// }

// To invoke parent class constructor

class Animal {
     Animal() {
          System.out.println("animal is created");
     }
}

class dog extends Animal {
     dog() {
          super();
          System.out.println("dog is created");
     }
}

public class superDemo {
     public static void main(String[] args) {
          dog jarman = new dog();
     }
}