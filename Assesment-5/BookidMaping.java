import java.util.*;
class BookidMaping
{
  public static void main(String args[])
  {
    Map<String,Integer> map =new HashMap<String,Integer>();
    map.put("B1",50);
    map.put("B2",100);
    map.put("B3",200);
    map.put("B4",300);
    map.put("B5",400);
    map.remove("B3",350);
    map.replace("B4",880);
    Set set =map.entrySet();
    map.forEach((k,v)->System.out.println( k + " "+ v)); 
  }
}