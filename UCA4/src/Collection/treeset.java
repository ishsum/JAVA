/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISHANI
 */
///ascending order
import java.util.*;
public class treeset {
public static void main(String arg[])
{
    
    TreeSet <String> ts=new TreeSet<String>();
    
    ts.add("ifg");
    ts.add("abc");
    ts.add("efg");
    
    for(String k:ts)
    {
        System.out.println(k);
        
    }
    
    System.out.println(ts.size());
    System.out.println(ts.contains("ishani"));
    
    
}
}
