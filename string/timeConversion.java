public class timeConversion{
  public static void main(String args[]){
    String time = "12:01:00AM";
    String start=time.substring(0,2);
    String end = time.substring(2,10);
    int hour  = Integer.parseInt(start);
    if(time.contains("P")){
      hour=hour+12;
      start=String.valueOf(hour);
    }
    else if(time.contains("A") && hour==12){
      start="00";
    }
    System.out.println("Before conversion time is "+time);
    String convertTime=start+end;
    System.out.println("After conversion time is "+convertTime);
  }
}