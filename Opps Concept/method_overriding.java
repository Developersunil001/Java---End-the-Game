class Bank {
     public void RateofInterest() {
          System.out.println("Gernally rate of interest is 5%");
     }
}

class SBI extends Bank {
     @Override
     public void RateofInterest() {
          System.out.println("Gernally rate of interest is 10%");
     }
}

class PNB extends Bank {
     @Override
     public void RateofInterest() {
          System.out.println("Gernally rate of interest is 15%");
     }
}

public class method_overriding {
     public static void main(String args[]) {
          PNB obj = new PNB();
          SBI obj1 = new SBI();
          obj.RateofInterest();
          obj1.RateofInterest();

     }
}