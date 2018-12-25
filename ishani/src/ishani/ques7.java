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
public class ques7 {
    public static void main(String arg[])
    {
        
        ArrayList <student7> ts=new  <student7> ArrayList() ;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of passengers");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name of passsenger");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enter age of passsenger");
            
            int age=sc.nextInt();
            student7 s1=new student7(name,age);
            ts.add(s1);
            
        }
        Collections.sort(ts);
        System.out.println( "Passengers Details by age(High to Low");
       int cnt=1;
        for(student7 ob:ts)
        {
            
            System.out.println(cnt+" "+ob);
            cnt++;
        }
        
        
        
        
        
    }
}
