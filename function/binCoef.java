package function;
import java.util.*;
public class binCoef {
  public static int fact(int num){
    int factorial = 1;
    for(int i=1;i<=num;i++){
      factorial = factorial * i;
    }
    return factorial;
  }
  public static int binocoef(int n, int r){
    int n_fact = fact(n);
    int r_fact = fact(r);
    int nmr_fact = fact(n-r);
    int bin_coef = n_fact/(r_fact * nmr_fact);
    return bin_coef;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    int coef = binocoef(n,r);
    System.out.println(coef);
  }
}
