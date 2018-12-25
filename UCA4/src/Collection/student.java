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
import java.util.Scanner;

class student implements Comparable <student>
{
   
    
    int age;
    String name;
    float marks;
    public String toString()
    {
        
        return(name+" "+age+" "+marks);
    }
 public int compareTo(student s1)
 {
     if(age==s1.age)
     {
         return 0;
     }
     else if(age<s1.age)
     {
         return 1;
     }
     else
         
     {
         return -1;
     }
     
 }
    public student()
    {
        name="";
        age=0;
        marks=0 ;
    }
   public student(String name,int age,float marks)
    {
        this.age=age;
        this.name=name;
        this.marks=marks;
        
    }

}
