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
public class ques 
{
    private String name;
    private String dept;
    private String mail;
    
    public ques(String name,String dept,String mail)
    {
        this.name=name;
        this.dept=dept;
        this.mail=mail;
        
    }
    
   
    
    public String toString()
    {
        return (name+" "+dept+" "+mail);
        
    }

    
}
