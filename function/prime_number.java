package function;
import java.util.Scanner;
public class prime_number {
  public static void checkPrime(int num){
    boolean flag = true;
   for(int j=2;j<num;j++){
    if(num%j==0){
      flag = false;
    }
   }
   if(flag){
    System.out.println("Number is prime");
   }else{
    System.out.println("Number is not prime");
   }

  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    checkPrime(num);
  }
}
