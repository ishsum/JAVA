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
public class maphah98 {
  public static void main(String arg[])
  {
    stu obj1=new stu("ishani",20,30);
        stu obj2=new stu("riya",30,50);
      HashMap<Integer,stu> hm=new HashMap<Integer,stu>();
      hm.put(1,obj1);
      hm.put(2,obj2);
    for(Map.Entry m:hm.entrySet())
    {
        System.out.println(m.getKey()+"--->"+m.getValue());
        
        
    }
    Scanner sc=new Scanner (System.in);
    System.out.println("ENTER Key");
    int a=sc.nextInt();
        int flag=0;

    for(Map.Entry m:hm.entrySet())
    {
        if((int)m.getKey()==a)
        {
        System.out.println(m.getValue());
        flag=1;
        }
        
    }
    
    if(flag==0)
    {
        System.out.println("KEY NOT FOUND");
    }
  } 
}
