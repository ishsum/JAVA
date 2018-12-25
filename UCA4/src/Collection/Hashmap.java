/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author ISHANI
 */
import java.util.*;
public class Hashmap {
    public static void main(String arg[])
    {
        
        HashMap<Integer,String>hm= new HashMap<Integer,String>();
    
        hm.put(67,"a");
        hm.put(68,"b");
        hm.put(69,"c");
        hm.put(90,null);
      
        for(Map.Entry m: hm.entrySet())
        {
            
            System.out.println(m.getKey()+"-->"+m.getValue());
        }
        
        hm.put(70,"d");
        hm.remove(90);
        //System.out.println(hm);    
        Set s=hm.entrySet();
        Iterator itr=s.iterator();
       
        Scanner sc=new Scanner(System.in);
         String name=sc.nextLine();
         
       
        /* while(itr.hasNext())
        {
            
            Map.Entry m=(Map.Entry)itr.next();
            if(m.getValue()==)
            {
            System.out.println(m.getKey());
            }
        }
         System.out.println(hm.containsKey(2));
         System.out.println(hm.containsValue("c"));
         */
    }
    
}
