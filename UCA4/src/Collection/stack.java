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
public class stack {
public static void main(String arg[])
{
    Stack<Integer>stk=new Stack<Integer>();
    Scanner sc=new Scanner(System.in);
System.out.println("ENTER NUM OF ITEMS YOU WANT TO INSERT");
    int n=sc.nextInt();    
System.out.println("ENTER ITEMS YOU WANT TO INSERT");

    for(int i=0;i<n;i++)
    {
        int val=sc.nextInt();
    stk.push(val);
       }
    int smallest=999;
    int largest=0;
    
    for(int k:stk)
    {
        if(k>largest)
            
        {
            largest=k;
        }
        if(k<smallest)
        {
            smallest=k;
        }

        
    }
    
    System.out.println("LARGEST- "+largest);
System.out.println("SMALLEST- "+smallest);
}
}