import java.util.Scanner;
public class alphabets{
  public static void upperAlphabetTriangle(int num){
    for(int i=0;i<num;i++){
      for(char j='A';j<='A'+i;j++){
        System.out.print(j+ " ");
      }
      System.out.println();
    }
  }
  public static void lowerAlphabetTriangle(int num){
    for(int i=1;i<=num;i++){
      for(char j='A';j<='A'+num-i;j++){
        System.out.print(j+ " ");
      }
      System.out.println();
    }
  }
  
  public static void alphabet2(int num){
    System.out.println();
    for(int i=0;i<num;i++){
      for(int j=0;j<=i;j++){
        System.out.print((char)(i+65)+ " ");
      }
      System.out.println();
    }
    System.out.println("Second way");
    for(int i=0;i<num;i++){
      for(int j=i;j<=2*i;j++){
        System.out.print((char)(i+65)+ " ");
      }
      System.out.println();
    }
  }
  public static void alphabet3(int n){
    System.out.println();

    
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    upperAlphabetTriangle(num);
    lowerAlphabetTriangle(num);
    alphabet2(num);
    alphabet3(num);
    // second way

    
  }
}