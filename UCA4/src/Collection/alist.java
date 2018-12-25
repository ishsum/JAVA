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
public class alist {
    public static void main(String arg[])
    {
        ArrayList <Integer> ar = new ArrayList <Integer> ();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        for(int i=0;i<num;i++)
        {
            int val=sc.nextInt();
            ar.add(val);
            
        }
        int cnt=0;
        for(int s:ar)
        {
            if(s>90)
            {
                cnt++;
            }
            
            
        }
         
       System.out.println("No of subjects is "+cnt);
    
    System.out.println();
        
    
    Iterator itr=ar.iterator();
   
    while(itr.hasNext())
    {
        
        System.out.println(itr.next());
    }
    
    
    }
}
