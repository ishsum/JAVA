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
public class hashlinked {
    public static void main(String args[])
    {
   
    List <String> hs1=new LinkedList<String>();
    List <String> ls=new LinkedList<String>();
    
    Scanner sc=new Scanner(System.in);
    
  System.out.println("ENTER NO OF PASSENERS"); 

  int n=sc.nextInt();
    sc.nextLine(); 
     System.out.println("ENTER name of PASSENERS");
    for(int i=0;i<n;i++)
    {
        String name=sc.nextLine();
        hs1.add(name);
    
    }
   System.out.println("ENTER CaPACITY");
      int rem=sc.nextInt();
    for(int h=rem;h<=hs1.size()-1;h++)
    {
        String nm=(String)(hs1.get(h));
        ls.add(nm);
        
    }
    

        System.out.print(ls);
  


  
    
    }
    
}
