/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ishani;
import java.util.*;
import java.lang.*;
class stu
{
    String name;
    int age;
    float marks;
    stu(String name,int age,float marks)
    {
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
}
class k implements Comparator <stu>
{
    
    public int compare(stu s1,stu s2)
    {
         if(s1.age==s2.age)
         {
             
             
               if(s1.name.equals(s2.name))
              {
                  if(s1.marks==s2.marks)
                  {
                      return 0;
                  }
                  else if(s1.marks>s2.marks)
                          {
                              return 1;
                          }
                  else
                  {
                      return -1;
                  }
              }
               else if((s1.name.compareTo(s2.name))>0)
              {
                  return 1;
              }
               else
               {
                   return -1;
               }
         }
        
         else if(s1.age>s2.age)
         {
             return 1;
         }
         else
         {
             return -1;
         }
        
    }
    
}


public class Ishani {
    public static void main(String[] args) {
        stu t1=new stu("ishani",20,34);
    stu t2=new stu("rucchi",32,45);
    stu t3=new stu("ram",45,45);
    stu t4=new stu("ram",45,6);
    stu t5=new stu("riya",20,65);
   stu t6=new stu("riya",11,6);
   ArrayList <stu> hs=new ArrayList <stu>();
     
    
    hs.add(t1);
    hs.add(t2);
    hs.add(t3);
    hs.add(t4);
    hs.add(t5);
    hs.add(t6);
    Collections.sort(hs,new k());
    
   for(stu ob :hs)
   {
       System.out.println(ob.name+" "+ob.age+" "+ob.marks);
       
   }

    }
    
}
