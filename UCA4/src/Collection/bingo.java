/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISHANI
 */
import java.util.Scanner;
public class bingo {

public static void main(String arg[])
{
    int arr[][]=new int[5][5];
    
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            char a=sc.next().charAt(0);
        arr[i][j]=a;
        }
    }
    
    
    
    int p=sc.nextInt();//i
    int q=sc.nextInt();//j
    //(2,2)
    
    for(int r=p+1;r>=p-1;r--)
    {
        for(int g=q+1;g>=q-1;g--)
        {
        arr[r][q]='z';
        }
        
        
    }
    
    
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            System.out.print((char)arr[i][j]+" ");
        }
        System.out.println();
    
    
    }
    
     
    arr[p+2][q+2]='z';
    arr[p+2][q-2]='z';
    arr[p-2][q+2]='z';
    arr[p-2][q-2]='z';
    
    
}
    
}
