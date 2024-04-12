package Array;
import java.util.*;
public class basic {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int arr[] = new int[5];
    for(int i=0;i<arr.length;i++){
      arr[i] = scn.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    String str[] = new String[4];
    for(int i=0;i<str.length;i++){
      str[i] = scn.next();
    }
    System.out.println(Arrays.toString(str));

  }
  
}
