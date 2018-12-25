/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.*;
import java.lang.*;

/**
 *
 * @author ISHANI
 */
public class main98 {
    public static void main(String str[])
    {
     
    student98 t1=new student98("ishani",20,34);
    student98 t2=new student98("rucchi",32,45);
    student98 t3=new student98("ram",45,6);
    
    
   
   ArrayList <student98> hs=new ArrayList <student98>();
     
    
    hs.add(t1);
    hs.add(t2);
    hs.add(t3);
    Collections.sort(hs,new k());
    
   for(student98 ob :hs)
   {
       System.out.println(ob.name+" "+ob.age+" "+ob.marks);
       
   }
    }
    
}
