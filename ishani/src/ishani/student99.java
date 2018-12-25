/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ishani;

import java.util.*;
import java.lang.*;

/**
 *
 * @author ISHANI
 */
public class student99 implements Comparator <student99>
{
    private String name;
    private String dept;
    private String mail;
    
    public student99(String name,String dept,String mail)
    {
        this.name=name;
        this.dept=dept;
        this.mail=mail;
        
    }
    
    public int compare(student99 s1,student99 s2)
    {
        if((s1.name.compareTo(s2.name))==0)
        {
         
            if(s1.dept.compareTo(s2.dept)==0)
            {
                if(s1.mail.compareTo(s2.mail)==0)
                {
                 return 0;   
                }
                else if(s1.mail.compareTo(s2.mail)<0)
                {
                    return 1;
                }
                else 
                {
                    return -1;
                }
                    
                
            }
            else if(s1.dept.compareTo(s2.dept)<0)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        
        }
        else if(s1.name.compareTo(s2.name)>0)
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
        return (name+" "+dept+" "+mail);
        
    }

    
}
