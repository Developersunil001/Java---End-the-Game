// Java Methods 
public class methods {
    String name;

    public void dog(){
     System.out.println(name + " " + "eats");
    }

    public static void main(String[] args) {
     methods eats = new methods();
     eats.name = "brusli";
     eats.dog();
    }
}