// multilevel inheritence => it is a bottom down approach

class objA {
     void methodA() {
          System.out.println("This is a method A");
     }
}

class objB extends objA {
     void methodB() {
          System.out.println("This is a method B");
     }
}

class objC extends objB {
     void methodC() {
          System.out.println("This is a method C");
     }
}

public class multilevel {
     public static void main(String[] args) {
          objC c1 = new objC();
          c1.methodA();
          c1.methodB();
          c1.methodC();
     }
}
