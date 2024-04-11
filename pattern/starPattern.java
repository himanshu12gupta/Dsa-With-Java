public class starPattern{
  public static void star1(){
    int num =4;
    for(int i=1;i<=4;i++){
      for(int j=1;j<=num-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
      }
      for(int j=1;j<=num-i;j++){
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  public static void star2(){
    int num =4;
    for(int i=0;i<4;i++){
      for(int j=0;j<i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=2*num-(2*i+1);j++){
        System.out.print("*");
      }
      for(int j=0;j<i;j++){
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  public static void star3(){
    int num =5;
    int count=0;
    int star,space;
    for(int i=0;i<2*num-1;i++){
      if(i<5){
        star = 2*i+1;
        space = num-i-1;
      }else{
        space = i-num+1;
        star = 3*num-2*i+2;

      }
      for(int j=0;j<space;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=star;j++){
        System.out.print("*");
      }
      for(int j=0;j<space;j++){
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
    star1();
    star2();
    System.out.println("NEW STAR");
    star3();
  }
}