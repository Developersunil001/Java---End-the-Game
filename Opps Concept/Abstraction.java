abstract class car {
     // method
     abstract public void fueltype();

     // method
     public void color() {
          System.out.println("black");
     }
}

class tata extends car {
     public void fueltype() {
          System.out.println("diesel");

     }
}

public class Abstraction {
     public static void main(String[] args) {
          tata tcs = new tata();
          tcs.color();
          tcs.fueltype();
     }
}
