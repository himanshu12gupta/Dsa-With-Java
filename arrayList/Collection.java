import java.util.Collections;
import java.util.ArrayList;
public class Collection{
  public static void Sort(ArrayList<Integer> list){
    Collections.sort(list);
  }
  public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(12);
    list.add(112);
    list.add(42);
    list.add(5);
    list.add(34);
    list.add(15);
    System.out.println(list);
    Sort(list);
    System.out.println(list);
    Collections.sort(list,Collections.reverseOrder());
    System.out.println(list);
  }
}