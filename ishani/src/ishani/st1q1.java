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
public class st1q1
{
public static void main(String arg[])
{
    
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER TEST CASSES");
    
   int a=sc.nextInt();
   sc.nextLine();
   for(int f=0;f<a;f++)
   {
       System.out.println("ENTER STRING");
    String str=sc.nextLine();
    char arr[]=str.toCharArray();
    int cnt=0;
    for(int i=0;i<arr.length;i++)
    {
        cnt=1;
        System.out.println(arr[i]);
        for(int j=i+1;j<arr.length;j++)
         {        
             if(arr[i]==arr[j])
             {
              cnt++;
             for(int k=i;k<=j;k++)
             {   
                 System.out.print(arr[k]);
             }
                 System.out.println();
             
         }
          
        }
          
                 
    }
   System.out.println(cnt);
    
   }
}
    
   
    
    
}
