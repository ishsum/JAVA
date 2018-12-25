import java.util.Scanner;

class code
{
  
 public void check(String str)
    {
          String jack1="";
       String t="";
          str=str.toLowerCase();
       String arr[]=str.split(" ");
       
      
       
      
       for(int i=0;i<arr.length;i++)
       {
            t="";
              jack1="";
               if(arr[i].charAt(0)=='a' || arr[i].charAt(0)=='e' || arr[i].charAt(0)=='i' || arr[i].charAt(0)=='o' || arr[i].charAt(0)=='u')
           
                   
               {
                  
                   arr[i]=arr[i].concat("way");
                   
                  System.out.print(arr[i]+" ");
                  
                   
                   
               }       
               else
               {
          for(int j=0;j<arr[i].length();j++)
          {
             
           if(arr[i].charAt(j)=='a' || arr[i].charAt(j)=='e' || arr[i].charAt(j)=='i' || arr[i].charAt(j)=='o' || arr[i].charAt(j)=='u')
           {
               t=arr[i].substring(j,arr[i].length());
           
               break;
               
           }   
           else
               
           {
               jack1=jack1+arr[i].charAt(j);
           }
           
          
               }
          
       t=t.concat(jack1);
       t=t.concat("ay");
       System.out.print(t+" ");
       
          
       }
       
}
}
 
}
 public class codeconverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        String str=sc.nextLine();
     
        code ch=new code();
        ch.check(str); 
        
        
    }
}
 /*else
                  {
                      t=arr[i].substring(j,arr[i].length()-1);
                      break;
                      
                  }
                 
      
               }
                t=t.concat(jack1);
               t=t.concat("ay");
               System.out.print(t+" ");
              t=t.replace(t,"");
    
            */