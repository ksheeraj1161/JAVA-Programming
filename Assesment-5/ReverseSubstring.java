import java.util.*;
class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}
class HandlingException
{  
   static void validate(String s,int a,int b)throws MyException
  {  
     if(a<0 || a>s.length())  
      throw new MyException("Invalid Arguments, sub string length should be in range of string length");     
     else if (b<0 || b>s.length())
      throw new MyException("Invalid Arguments, sub string length should be in range of string length");  
     else if (a>b)
      throw new MyException("start of sub string should be less than end");    
   } 
} 
class ReverseSubstring
{
 static String reverseString(String str)
   {  
    StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    return sb.toString();  
   } 
 public static void main(String[] args) 
    {  
      HandlingException he=new HandlingException();
      String s=args[0];
      int a=Integer.parseInt(args[1]);
      int b=Integer.parseInt(args[2]);
      try
      {
        he.validate(s,a,b);
      }catch(Exception e)
      {
        System.out.println(e);
      }
      s=reverseString(s);
      System.out.println(s.substring(a,b+1));
      
    }   
}