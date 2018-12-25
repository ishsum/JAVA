/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author ISHANI
 */

import java.util.*;
 class test <T>
{
    
   T arr[];
    int size;
   public test(T arr[],int size)
   {
       this.size=size;
       this.arr=arr;
   
   }

void print()
{
    
    for(int i=0;i<size;i++)
    System.out.print(arr[i]);
}
    
    
    
}
public class template1 {

    public static void main(String arg[])
    {
   
        Scanner sc=new Scanner (System.in);
       
         
         Integer arr[]={1,2,3,4};
       
         Integer n=(Integer)arr.length;
         test<Integer> ob=new test <Integer>(arr,n);
       ob.print();
 System.out.println();       
 Character brr[]={'a','b','c','d'};
 
         Integer n1=(Integer)brr.length;
 
 test<Character> ob1=new test <Character>(brr,n1);
        ob1.print();
        
        
        
    }
}
