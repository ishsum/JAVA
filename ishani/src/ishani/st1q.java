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
public class st1q {
    public static void main(String arg[])
    {
      
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int size=sc.nextInt();
            int arr[]=new int[size];
            for(int j=0;j<size;j++)
            {
                int val=sc.nextInt();
                arr[j]=val;
                
            }
        int sum;
        int brr[]=new int [size];
            for(int m=0;m<arr.length;m++)
            {
                sum=0;
                for(int k=0;k<arr.length;k++)
                {
                    if(arr[k]!=arr[m])
                    {
                        sum=sum+arr[k];
                        brr[m]=sum;
                    }
                    
                }
                    }
            for(int h=0;h<brr.length;h++)
            {
                System.out.print(brr[h]+" ");
            }
        }
        
        
    }
    
}
