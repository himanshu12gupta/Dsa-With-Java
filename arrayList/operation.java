import java.util.*;
public class operation{
 public static void main(String args[]){
     ArrayList<Integer> list1 = new ArrayList<>();
  list1.add(1);
  list1.add(2);
  list1.add(3);
  list1.add(8);
  list1.add(5);

  System.out.println(list1);
  list1.add(0,188);
  System.out.println(list1);
  System.out.println(list1.get(2));
  list1.remove(3);
  System.out.println(list1);
  list1.set(2,19);
  System.out.println(list1);
  System.out.println(list1.contains(12));
  System.out.println(list1.size());


 }
}