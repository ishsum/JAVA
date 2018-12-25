/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISHANI
 */

//list-interface
//ArrayList-class
import java.util.*;
public class integer{
    public static void main(String arg[])
    {
        ArrayList<Integer> ob=new ArrayList<Integer>();
       
       //List<String> ob=new ArrayList<String>();
       ob.add(5);
       ob.add(4);
       ob.add(1);
        ob.add(2);
        ob.add(3);
        
        ob.set(1,5);
        int g=ob.get(1);//index
        System.out.println("get func "+g);
  
        System.out.println(ob);
  
   for(Integer k:ob)
  {
      System.out.println(k);
  }      
   System.out.println("Iterator");
   Iterator it=ob.iterator();
   while(it.hasNext())
   {
       Integer k=(Integer)it.next();
       System.out.println(k);
   }
   
        ob.remove(1);//by index
        System.out.println("remove 1st index");
   Iterator it1=ob.iterator();
   while(it1.hasNext())
   {
       Integer k=(Integer)it1.next();
       System.out.println(k);
   }
        
  
   Collections.sort(ob,Collections.reverseOrder());
   System.out.println(ob);
   
   
    }
    
}
