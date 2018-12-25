/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISHANI
 */
package Collection;

class stu implements Comparable <stu>
{
   
    
    int age;
    String name;
    float marks;
    
    
    
    public stu()
    {
        name="";
        age=0;
        marks=0 ;
    }
   public stu(String name,int age,float marks)
    {
        this.age=age;
        this.name=name;
        this.marks=marks;
        
    }
    
    public String toString()
    {
        
        return(name+" "+age+" "+marks);
    }
 public int compareTo(stu s1)
 {
     if(age==s1.age)
     {
         return 0;
     }
     else if(age>s1.age)
     {
         return 1;
     }
     else
         
     {
         return -1;
     }
     
 }

}
