// same name of function 
// different no. of argument 
// same no. of args but different datatypes

public class method_overloading{

     public static int sum(int x, int y){
          return x+y;
     }

     public static int sum(int x, int y,int z){
          return x+y+z;
     }

     public static String sum(String x, String y){
          return x+y;
     }
     public static void main(String args[]){
      System.out.println(sum(5,7));
      System.out.println(sum(4,8,7));
      System.out.println(sum("Indian","Boy"));

     }
}