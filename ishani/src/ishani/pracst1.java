/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ishani;
import java.util.*;
/**
 *
 * @author ISHANI
 */
public class pracst1 {
    public static void main(String arg[])
            
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        String arr[]=str.split(" ");
        
        if(arr.length==2)
        {
            System.out.print(arr[1]+" "+arr[0]);
        }
        else
        {
            
                System.out.print(arr[arr.length-1]+" ");
                
            for(int i=arr.length-2;i>0;i--)
            {
                StringBuffer s1=new StringBuffer(arr[i]);
                s1.reverse();
        System.out.print(s1+" ");
                 
            }
            System.out.print(arr[0]);
        }
    }
    
    
}
