package function;

public class sum {
  public static int hello(int a,int b){
    int mul = a*b;
    return mul;
  } 
  public static void main(String[] args) {
    int a=12;
    int b =5;
    int multiply = hello(a,b);
    System.out.println(multiply);
  }
}
