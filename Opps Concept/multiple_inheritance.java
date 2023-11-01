interface A {
     public void run();
}

interface B {
     public void run();
}

class C implements A, B {
     public void run() {
          System.out.println("class C run");
     }
}

public class multiple_inheritance {
     public static void main(String[] args) {
          C obj = new C();
          obj.run();
     }
}
