// get => it print the value
// set => it use to intialize the value

class student {
     private String name;
     private int age;
     private int roll_no;

     public String getname() {
          return name;
     }

     public int getint() {
          return age;
     }

     public int getroll_no() {
          return roll_no;
     }

     public void setname(String name) {
          this.name = name;
     }

     public void setage(int age) {
          this.age = age;
     }

     public void setrollno(int roll_no) {
          this.roll_no = roll_no;
     }
}

public class encapsulation {
     public static void main(String[] args) {
          student sd1 = new student();
          sd1.setage(5);
          sd1.setname("sunil");
          sd1.setrollno(100);

          System.out.println(sd1.getint());
          System.out.println(sd1.getname());
          System.out.println(sd1.getroll_no());
     }
}
