// Java Methods 
public class methods {
     int lisence_id;
     String name;

     public void eat() {
          System.out.println(name + " " + "eats");
     }

     public static void main(String[] args) {
          methods dog = new methods();
          dog.name = "brusli";
          dog.eat();
     }
}