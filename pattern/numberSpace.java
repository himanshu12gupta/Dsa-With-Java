public class numberSpace{
  public static void main(String args[]){
    int num =4;
    for(int i=1;i<=num;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
      for(int j=1;j<=2*num-2*i;j++){
        System.out.print(" ");
      }
      for(int k=i;k>=1;k--){
        System.out.print(k);
      }
      System.out.println();
    }
  // second way
  int space = 2*(num-1);
  for(int i=1;i<=num;i++){
    for(int j=1;j<=i;j++){
      System.out.print(j);
    }
    for(int j=1;j<=2*num-2*i;j++){
      System.out.print(" ");
    }
    for(int k=i;k>=1;k--){
      System.out.print(k);
    }
    System.out.println();
    space = space - 2;
  }

}


}