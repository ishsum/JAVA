/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ishani;

/**
 *
 * @author ISHANI
 */import java.util.*; 
public class test
{ public static void main(String args[]) 
{ List<Integer> l = new LinkedList<Integer>(); 
l.add(2);
l.add(3);
l.add(4);
List<Integer> s=new LinkedList<Integer>();
s.add(7); 
s.add(8);
s.add(9);
for (Iterator<Integer> itr1=l.iterator(); itr1.hasNext();)
{ for (Iterator<Integer> itr2=s.iterator(); itr2.hasNext();)
{ if (itr1.next() < itr2.next()) System.out.print(itr1.next());
} 
} 
}
}
