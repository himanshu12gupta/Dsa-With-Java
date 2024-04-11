import java.util.Scanner;
public class basics{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int num = input.nextInt(); 
    boolean flag = true;
    // 
    int factorial = 1;
    for(int i=1;i<=num;i++){
      factorial = factorial*i;
    }
    System.out.println("Factorial of a number is "+ factorial);
  }
}

// reverse ,palindrome,armstrong
// 4! = 4*3*2*1 ->num=5 i-> 1 to 5