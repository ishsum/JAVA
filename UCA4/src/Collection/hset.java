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
public class hset {
    
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        List<Integer>l1=new ArrayList<Integer>();
        List<Integer>l2=new ArrayList<Integer>();
        System.out.println("ENTER NUM OF VALUES IN LIST1");
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int val=sc.nextInt();
            l1.add(val);
            
        }
        int b=sc.nextInt();
        for(int i=0;i<b;i++)
        {
            int val=sc.nextInt();
            l2.add(val);
            
        }
        
        Set<Integer>s1=new HashSet <Integer> ();
        
        Set<Integer>s2=new HashSet <Integer> ();
        
        Iterator it1=l1.iterator();
        Iterator it2=l2.iterator();
        
        while(it1.hasNext())
        {
            int val1=(int)it1.next();
            s1.add(val1);
        }
        
        while(it2.hasNext())
        {
            int val1=(int)it2.next();
            s2.add(val1);
        }
        s1.retainAll(s2);
        System.out.println("INTERSECTION");
        for(int k:s1)
        {
        System.out.println(k);
        }
        
    } 
    
}
