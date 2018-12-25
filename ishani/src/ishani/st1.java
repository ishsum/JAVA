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
public class st1 {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int vl=sc.nextInt();
            arr[i]=vl;
            
        }
        
        int sum=0;
        int flag=0;
        int flag1;
        for(int i=0;i<arr.length;i++)
        {
            
            for(int j=i+1;j<arr.length;j++)
            {
                
                if(arr[i]==arr[j])
                {
                {
                    flag1=0;
                arr[j]=arr[j]+1;
                
                    for(int k=j;k<arr.length;k++)
                    {
                        if(arr[j]==arr[k])
                        {
                            //System.out.println("here");
                            flag1=1;
                            continue;
                        }
                        
                        if(flag1==0 && k==arr.length)
                    {
                        break;
                        
                    }
                    }
                    
                }
                }
            }
            
        }
        
       
            
            for(int i=0;i<arr.length;i++)
            {
                sum=sum+arr[i];
            }
            System.out.println(sum);
        
        
    }
    
}
