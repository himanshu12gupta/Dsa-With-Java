package Array;
import java.util.*;

public class twoDArray {
  public static void main(String[] args) {
    int arr[][] = new int[3][4];
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(Arrays.toString(arr[i]));
    }

    for(int i=0;i<arr.length;i++){
      System.out.print("[ ");
      for(int j=0;j<arr[i].length;j++){
    System.out.print(" " + arr[i][j]);
      }
      System.out.print(" ],");
      System.out.println();
    }
    // enhance for loop
    for(int a[] : arr){
      System.out.println(Arrays.toString(a));
    }
  }
}
