// class employess {
//      void salary() {
//           System.out.println("the salary is 30k");
//      }
// }

// class hr extends employess {
//      void bonus() {
//           System.out.println("the bonus is 50k");
//      }
// }

// public class single_inherit {
//      public static void main(String[] args) {
//           hr h1 = new hr();
//           h1.bonus();
//           h1.salary();
//      }
// }

class employess {
     void salary() {
          System.out.println("this is salary is 30k");
     }
}

class manager extends employess {
     void bonus() {
          System.out.println("this is salary is 50k");
     }
}

public class single_inherit {
     public static void main(String[] args) {
          manager m1 = new manager();
          m1.salary();
          m1.bonus();
     }
}