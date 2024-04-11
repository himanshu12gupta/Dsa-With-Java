public class lowertriangle{
  public static void trianglePattern(int n){
    for(int i=1;i<=n;i++){

      for (int j=1;j<=n-i+1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void digitTriangle(){
    int count =1;
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++){
        System.out.print(count+" ");
        count++;
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
    int num = 5;
    trianglePattern(num);
    digitTriangle();
  }
}