package ishani;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISHANI
 */
public class st1prac {
    
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
        int sum;
        int k=sc.nextInt();
    for(int i=0;i<arr.length;i++)
    {
        sum=arr[i];
        //System.out.println(sum);
    for(int j=i+1;j<arr.length;j++)   
    {
      
       
         if(sum==k)
        {
            for(int k1=i;k1<j;k1++)
            System.out.print(arr[k1]+" ");
        }     
        else if(sum>k)
        {
            break;
        }
         sum=sum+arr[j];
    }
        
    }
    
    
    }
       
}
