import java.util.Scanner;
public class alphabets1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=num;i>0;i--){
      for(int j=0;j<=num-i;j++){
        System.out.print((char)(i+j-1+65));
      }
      System.out.println();
    }
  }
}