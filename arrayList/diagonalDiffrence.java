import java.util.*;
public class diagonalDiffrence{
  public static void main(String args[]){
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();

    list1.add(2);
    list1.add(3);
    list1.add(4);
    list2.add(5);
    list2.add(7);
    list2.add(8);
    list3.add(12);
    list3.add(22);
    list3.add(33);

    // list.add(0,1,3);
    // list.get(1).add(0,5);
    // list.get(1).add(1,6);
    list.add(list1);
    list.add(list2);
    list.add(list3);
    System.out.println(list);
    for(int i=0;i<list.size();i++){
      ArrayList<Integer> currentList=list.get(i);
      for(int j=0;j<currentList.size();j++){
        System.out.print(currentList.get(j)+" ");
      }
      System.out.println();
    }
    int row=0,col=0,n_row=list.size();
    int left_sum=0;

    System.out.println(n_row);
    while(row<n_row){
      int ele = list.get(row).get(col);
      left_sum+=ele;
      row+=1;
      col+=1;
    }
    row=0;
    col=list.size()-1;
    int right_sum=0;
      // System.out.println("rr"+row);
      // System.out.println("rr"+n_row);

    while(row<n_row){
      int ele1=list.get(row).get(col);
      row+=1;
      col-=1;
      System.out.println("nn"+ele1);
      right_sum+=ele1;
      // right_sum


    }
    // int n_col=list.size();
        System.out.println("left_sum="+left_sum);
    System.out.println("right_sum="+right_sum);
    int res = Math.abs(left_sum-right_sum);
    System.out.println("result="+res);
  }
}