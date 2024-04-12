import java.util.*;
public class two_sum {
  public static void main(String args[]){
    HashMap <Integer,Integer> map = new HashMap<>();
    int arr[] = new int[] {2,3,4,5,6};
    int res[] = new int[2];
    int target = 9;
    for(int i=0;i<arr.length;i++){
      int checktar = target - arr[i];
      if (map.containsKey(target - arr[i])){
        // System.out.println(getKeys(map, checktar));
        res[0] = map.get(target - arr[i]);
      }else{
        map.put(i,arr[i]);
      }
    }
  }
}
