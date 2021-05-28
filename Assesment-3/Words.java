package pack1;
public class Words
{
   public void countNumWords(String s)
   {
        int Count = 0;  
        for(int i = 0; i < s.length()-1; i++) 
         {  
            if(s.charAt(i) == ' ' && Character.isLetter(s.charAt(i+1)) && (i > 0)) {  
                Count++;  
            }  
        }  
        Count++;  
        System.out.println("no of words in the given string: " + Count);
   }
}
