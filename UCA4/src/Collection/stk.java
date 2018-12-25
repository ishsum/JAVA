/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISHANI
 */
import java.util.*;
public class stk {
public static void main(String arg[])
{
Stack<Integer>s=new Stack<Integer>();    
    
ArrayList<Integer>ar=new ArrayList<Integer>();

ArrayList<Integer>ar1=new ArrayList<Integer>();

Scanner sc= new Scanner(System.in);

while(true)
{
    
int i=sc.nextInt();

if(i==0)
{
    break;
}    
    
else
  
{
    
    for(int j=0;j<i;j++)
    {
        int val=sc.nextInt();
        ar.add(val);
        
        
    }
    int cnt=999;
    for(Integer k: ar )
    {
       if(k<cnt)
       {
           cnt=k;
       }
        
    }
    ar1.add(cnt);
}

}

}
}

