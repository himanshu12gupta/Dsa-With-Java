import java.util.ArrayList;
public class grade{
  public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(4);
    list.add(73);
    list.add(67);
    list.add(38);
    list.add(33);
    ArrayList<Integer> newList = new ArrayList<>();
    for(int i=0;i<list.size();i++){
        int checkVar=list.get(i);
        if(list.get(i)>=30){
          while(checkVar % 5 != 0){
            checkVar++;
          }
          System.out.println(checkVar);
        if((checkVar - list.get(i))<3 && list.get(i)>=38){
          newList.add(checkVar);
        }
        else{
          newList.add(list.get(i));
        }
        }
    }
    System.out.println("old list =  "+list);
    System.out.println("new list = "+newList);
  }
}