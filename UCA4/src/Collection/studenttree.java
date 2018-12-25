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
public class studenttree {
    public static void main(String str[])
    {
     
   student t1=new student("ishani",20,34);
    student t2=new student("rucchi",32,45);
   student t3=new student("ram",45,6);
    
    
   
    TreeSet <student> hs=new TreeSet <student>();
     
    
    hs.add(t1);
    hs.add(t2);
    hs.add(t3);
    
   for(student ob :hs)
   {
       System.out.println(getTostring()+" "+ob.age+" "+ob.marks);
       
   }/*
    for(student k:hs)
    {
        System.out.print(k);
        
    }
*/
}
}