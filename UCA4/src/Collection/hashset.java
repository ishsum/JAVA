/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISHANI
 */
import java.util.*;
public class hashset {
    public static void main(String arg[])
    {
        HashSet <String> hs=new HashSet <String> ();
        hs.add("ishani");
        hs.add("gupta");
        hs.add("num");
        
        Iterator it=hs.iterator();
        
        while(it.hasNext())
        {
            String k=(String)it.next();
            System.out.println(k);
            
            
        }
        
System.out.println(hs.size());
//System.out.println(capacity(hs));
System.out.println(hs.contains("ishani"));

Object ob[]=hs.toArray();

for(int i=0;i<ob.length;i++)
{
    System.out.println("array-"+ob[i]);
}

hs.clear();
hs.add("abc");
for(String k:hs)
{
    System.out.println(k);
}





        
    }
    
}
