interface car {
     public void start();
}

class electricCar implements car {
     public void start() {
          System.out.println("electric car start");
     }
}

class petrolCar implements car {
     public void start() {
          System.out.println("petrol car start");
     }
}

public class interface_demo {
     public static void main(String[] args) {
          car tata = new electricCar();
          car BMW = new petrolCar();
          tata.start();
          BMW.start();
     }
}
