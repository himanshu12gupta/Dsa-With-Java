import java.util.ArrayList;
public class swap{
  public static void swap(ArrayList<Integer> list,int idx1,int idx2){
    int temp = list.get(idx1);
    list.set(idx1,list.get(idx2));
    list.set(idx2,temp);
    System.out.println("function called");
    System.out.println(list);
  }
  public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(215);
    list.add(34);
    list.add(22);
    list.add(5);
    list.add(3);
    int idx1 = 1;
    int idx2 = 2;
    System.out.println(list);
    swap(list,idx1,idx2);
  }
}