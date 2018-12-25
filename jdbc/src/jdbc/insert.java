package jdbc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class insert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				
					Class.forName("com.mysql.jdbc.Driver");
				
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
					     Statement st=con.createStatement();
					     System.out.println("done");
					     Scanner sc=new Scanner(System.in);
                                             
                                             while(true)
                                             {
                                                 System.out.println("Enter name");
                                                 String name=sc.nextLine();
                                                 System.out.println("Enter ROll");
                                                 int roll=sc.nextInt();
                                                 System.out.println("Enter Marks");
                 
                                                  double marks=sc.nextDouble();
                                                  
                                                     System.out.println("Enter Branch");
                                                 String branch=sc.nextLine();
                                                 String sqlQuery=String.format("insert into studentinfo values(%s,%d,%lf,%s)",name,roll,marks,branch);
                                                 st.executeUpdate(sqlQuery);
                                                 System.out.println("RECORD INSERTED SUCCESSFULLY");
                                                 System.out.println("Do you wnt to insert again yes/no");
                                                 
                                             String option=sc.nextLine();
                                             if(option.equalsIgnoreCase("NO"))
                                             {
                                                 break;
                                             }
                                             }
	con.close();
        }
	}

