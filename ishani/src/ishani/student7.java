/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ishani;

/**
 *
 * @author ISHANI
 */
import java.util.*;
import java.lang.*;
public class student7 implements Comparable <student7> 
{
    String name;
    int age;
    student7(String name,int age)
    {
        this.name=name;
        this.age=age;
        
    }
    
    
    public int compareTo(student7 s)
    {
        if(age==s.age)
        {
            return 0;
        }
        else if(age<s.age)
        {
            return 1;
        }
        
        else
            
        {
            return -1;
        }
        
    }
    
    public String toString()
    {
        
        
        
        return (name+" "+age);
    }
    
    
    
}
