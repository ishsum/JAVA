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
public class arraylist{
    public static void main(String arg[])
    {
        ArrayList<String> ob=new ArrayList<String>();
       
       //List<String> ob=new ArrayList<String>();
        ob.add("abc");
        ob.add("bhf");
        ob.add("adaebhf");
        
        ob.add(2,"bc");
        System.out.println(ob);
  
   for(String k:ob)
  {
      System.out.println(k);
  }      
   System.out.println("Iterator");
   Iterator it=ob.iterator();
   while(it.hasNext())
   {
       String k=(String)it.next();
       System.out.println(k);
   }
   
        ob.remove(3);//by index
        System.out.println("remove 3rd inedex");
   Iterator it1=ob.iterator();
   while(it1.hasNext())
   {
       String k=(String)it1.next();
       System.out.println(k);
   }
        
   
   
   
        ob.remove("bc");//by value
        System.out.println("remove val bc");
   Iterator it2=ob.iterator();
   while(it2.hasNext())
   {
       String k=(String)it2.next();
       System.out.println(k);
   }
   
   int i=ob.indexOf("ab");//-1 if not found elemnt else index
   int j=ob.indexOf("abc");//-1 if not found elemnt else index

   System.out.println("inexOf "+i);
   
   System.out.println("inexOf "+j);
  
   System.out.println(ob.contains("bhf"));
   System.out.println(ob.size());
   
     
    }
    
}
