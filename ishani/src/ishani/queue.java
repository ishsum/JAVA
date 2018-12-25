/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ishani;
import java.util.*;
import java.lang.*;
/**
 *
 * @author ISHANI
 */
public class queue {
    public static void main(String arg[])
    {
        PriorityQueue <Integer> pq=new PriorityQueue();
        PriorityQueue <Integer> pq2=new PriorityQueue();
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            
            pq.add(val);
            
            
        }
        
        for(int a:pq)
        {
            pq2.add(a);
            
        }
        System.out.println(pq2);
    }
    
}
