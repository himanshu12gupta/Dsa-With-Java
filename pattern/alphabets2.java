import java.util.Scanner;
public class alphabets2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=0;i<num;i++){
      for(int j=i;j<=2*i;j++){
        System.out.print((char)(i+65));
      }
      System.out.println();
    }
    for(int i=0;i<num;i++){
      for(int j=i;j<=2*i;j++){
        System.out.print((char)(j+65));
      }
      System.out.println();
    }
    for(int i=num;i>0;i--){
      for(int j=i;j<=2*i;j++){
        System.out.print((char)(j+65));
      }
      System.out.println();
    }
    for(int i=0;i<num;i++){
      for(int j=i;j>=0;j--){
        System.out.print(num-(j+1));
      }
      System.out.println();
    }
    for(int i=0;i<num;i++){
      for(int j=1;j<=num-i-1;j++){
        System.out.print(" "+" ");
      }
      for(int k=1;k<=i+1;k++){
        System.out.print(k+" ");
      }
      System.out.println();
    }
  System.out.println("end\n");
    for(int i=0;i<num;i++){
      for(int j=1;j<=num-i;j++){
        System.out.print(num-i);
      }
      for(int k=1;k<=i+1;k++){
        System.out.print(" ");
      }
      System.out.println();

    }

    for(int i=0;i<num;i++){
      for(int j=1;j<=num-i-1;j++){
        System.out.print("."+" ");
      }
      for(int k=i+1;k<=2*i+1;k++){
        System.out.print(k+" ");
      }
      for(int m=2*i;m>=i+1;m--){
        System.out.print(m+" ");
      }
      for(int j=1;j<=num-i;j++){
        System.out.print(" "+" ");
      }
      System.out.println();
    }
  }
}