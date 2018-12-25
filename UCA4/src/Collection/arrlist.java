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
public class arrlist {
    
public static void main(String arg[])
{
    
    
    ArrayList<student1> arr=new ArrayList<student1> ();
    System.out.println("ENTER NUM OF STUDENTS");        
    
      student1 ob1=new student1("ishani",20,30);
      student1 ob2=new student1("ruchika",30,40);
                arr.add(ob1);
            arr.add(ob2);
            
            
            Collections.sort(arr);
            for(student1 ob:arr)
            {
               
                
                System.out.println(ob.name+" "+ob.age+" " +ob.marks);
                
                
            }
            
            
}


}
