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
public class pq{
    public static void main(String arg[])
    {
    PriorityQueue <Integer> pq1 = new PriorityQueue () ;

    pq1.add(10);
    pq1.add(20);
    pq1.add(30);
    pq1.add(5);
    pq1.add(6);
     System.out.println(pq1);
    int temp=pq1.poll();

     for(int i:pq1)
    {
        System.out.println(i);
        
        
    }
    
    
    }
    
}
