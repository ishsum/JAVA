/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ishani;

/**
 *
 * @author ISHANI
 */
import java.util.*;
import java.lang.*;
import java.util.Scanner;



public class P3 { 

public static void main(String arg[])
{
    
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of students");
    int n=sc.nextInt();//no of students
    HashMap <String,ques> hm=new HashMap <String,ques> ();
    for(int i=1;i<=n;i++)
    {
        
        System.out.println("Enter the details of the student"+i);
      
        String id=sc.nextLine();
        String name=sc.nextLine();
        String mail=sc.nextLine();
        String dept=sc.nextLine();
        ques s=new ques(name,dept,mail);
        hm.put(id,s);
        
        
    }
    
    
    System.out.println("ENTER ID OF STUDENT TO BE SEARCHED");
    
    String test=sc.nextLine();
    
    int flag=0;
     System.out.println("Student Deatils");
        
    for(Map.Entry m: hm.entrySet())
    {
        String nm=(String)m.getKey();
        if(test.equals(nm))
        {
        System.out.println(m.getKey()+"--->" + m.getValue());
        flag=1;
        }
        
    }
    if(flag==0)
    {
        System.out.println("Student not found");
    }
    
    
}
    
}
