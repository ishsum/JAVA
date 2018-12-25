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

public class set {
public static void main(String arg[])
{
    Scanner sc=new Scanner(System.in);
    HashSet <String> hs1=new HashSet <String> ();
   HashSet<String> hs2=new HashSet <String>();
   HashSet<String> hs3=new HashSet<String>();
  System.out.println("Enter the number of passengers in First friday flight from Chennai to Coimbatore");
        int n1=sc.nextInt();
        sc.nextLine();
         System.out.println("Enter the passengers Names");
        for(int j=0;j<n1;j++)
        {
            String name1=sc.nextLine();
            hs1.add(name1);
            
        }
        
        System.out.println("Enter the number of passengers in Second friday flight from Chennai to Coimbatore");
        int n2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the passengers Names");
        for(int j=0;j<n2;j++)
        {
            String name2=sc.nextLine();
            hs2.add(name2);
            
        }
        
         System.out.println("Enter the number of passengers in Third friday flight from Chennai to Coimbatore");
        
        int n3=sc.nextInt();
        sc.nextLine();
         System.out.println("Enter the passengers Names");
        for(int j=0;j<n3;j++)
        {
            String name3=sc.nextLine();
            hs3.add(name3);
            
        }

        hs1.retainAll(hs2);
        hs1.retainAll(hs3);
        
        
        System.out.println("Selected passengers for discount:");
        for(String k:hs1)
        {
            System.out.println(k);
        }
    
    
}
}
