class overloading {
     void sum(int a, int b) {
          System.out.println(a + b);
     }

     void sum(int a, int b, int c) {
          System.out.println(a + b + c);
     }

     // void sum(String d, String b, String e) {
     //      System.out.println();
     // }

}

public class polymorphism {
     public static void main(String[] args) {
       overloading obj = new overloading();
       obj.sum(5, 10);
       obj.sum(10, 2);
     }
}
