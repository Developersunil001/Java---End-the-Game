     class A {
          public void print() {
               System.out.println("print A");
          }
     }

     class B extends A {
          public void printB() {
               System.out.println("print B");
          }
     }

     class C extends A {
          public void printC() {
               System.out.println("print C");
          }
     }

     public class hierarichalDemo {
          public static void main(String[] args) {
               B obj = new B();
               C obj1 = new C();
               obj.print();
               obj1.print();
          }
     }