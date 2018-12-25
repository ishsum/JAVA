package collection;
import java.util.*;
import java.lang.*;
class k implements Comparator <student98>
{
    
    public int compare(student98 s1,student98 s2)
    {
         if(s1.age==s2.age)
         {
             
             
               if(s1.name.equals(s2.name))
              {
                  return 0;
              }
               else if((s1.name.compareTo(s2.name))>0)
              {
                  return 1;
              }
               else
               {
                   return -1;
               }
         }
        
         else if(s1.age>s2.age)
         {
             return 1;
         }
         else
         {
             return -1;
         }
        
    }
    
}
