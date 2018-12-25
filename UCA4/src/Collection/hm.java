/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author ISHANI
 */
public class hm {

    public static void main(String arg[])
    {
        
        Scanner sc=new Scanner (System.in);
        
       
        stu obj1=new stu("ishani",20,30);
      
        stu obj2=new stu("riya",30,50);
        
        ArrayList <stu> hm=new ArrayList <stu> ();
        
        hm.add(obj1);
        hm.add(obj2);
        
        Collections.sort(hm);
        
        for(stu s:hm)
        {
            System.out.println(s);
        }
        
        
    }
}