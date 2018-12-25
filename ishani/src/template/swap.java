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
class test3<T>
{
   T a;
   T b;
    
  public test3(T a,T b)
   {
       this.a=a;
       this.b=b;
   }
   public void swap()
    {
        T temp=a;
        a=b;
        b=temp;
      
    }
   void print()
   {
      System.out.println("after a-"+a+" "+ "b-" +b);
     }
}
public class swap {
    public static void main(String arg[])
    {
   
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ENTER a");
        int a=sc.nextInt();
        
        System.out.println("ENTER b");
        int b=sc.nextInt();
        
        System.out.println("before a-"+a+" "+ "b-" +b);
        
        test3 ob=new test3(a,b);
        ob.swap();
    ob.print();
        System.out.println("back to main a-"+a+" "+ "b-" +b);
    
    }
}

