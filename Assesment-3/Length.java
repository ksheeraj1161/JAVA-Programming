package pack1.pack2;
public class Length
{
  public void strLength(String s)
  {
      int i = 0;
      for(char c: s.toCharArray()) {
         i++;
      }
      System.out.println("Length of given string is : "+i);
  }
}
