
import java.util.HashSet;

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

public class jass {
    public static void main(String str[])
    {
     
    hashsetques t1=new hashsetques("ishani",20,34);
    hashsetques t2=new hashsetques("rucchi",32,45);
    hashsetques t3=new hashsetques("ram",45,6);
    
    
   
    HashSet <hashsetques> hs=new HashSet <hashsetques>();
     
    
    hs.add(t1);
    hs.add(t2);
    hs.add(t3);
    //for each loop print
   for(hashsetques ob :hs)
   {
       System.out.println(ob.name+" "+ob.age+" "+ob.marks);
       
   }
    }
    
}
