import java.util.ArrayList;
public class max{
  public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(2);
    list.add(92);
    list.add(2);
    list.add(22);
    list.add(12);
    int max= Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
      if(max<list.get(i)){
        max=list.get(i);
      }
    }
    System.out.println("Max element is "+max);
  }
}