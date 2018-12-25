/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISHANI
 */
import java.util.Scanner;
class stack
{
    int top;
   int arr[]=new int[20];
    stack()
    {
        top=-1;
        int arr[]=new int[20];   
    }
    public void push(int i)
    {
        top++;
        arr[top]=i; 
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.print("UNDERFLOW");
        }
        int num=arr[top];
        top--;
       return num; 
    }
    public void display()
    {
        while(top!=-1)
        {
            System.out.print(arr[top]);
            top--;
        }
    }
    
}
public class stack1 
{ 
    public static void main(String arg[])
    {
    
    stack s=new stack();
    
    
    Scanner sc=new Scanner(System.in);
   System.out.println("ENTER 1 TO ADD ITEM TO STACK");
       System.out.println("ENTER 2 TO REMOVE ITEM FROM STACK");
       System.out.println("ENTER 3 TO DISPLAY");
       System.out.println("ENTER 4 TO EXIT");
       
   while(true)
   {
       
      int ch=sc.nextInt();
      switch(ch)
      {
      case 1:
          int b=sc.nextInt();
          s.push(b);
      break;
      
      case 2:
          s.pop();
      break;
      
      
      case 3:
          s.display();
      break;
      case 4:
          break;
      }
   }
    }
}

