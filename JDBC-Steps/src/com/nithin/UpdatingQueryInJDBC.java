package com.nithin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatingQueryInJDBC {
	public static void main(String[] args) {
		
		Connection con=null;
		Statement stm;
		
		String qup= "update beca35.emp set salary=56000.00 where id=125";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");           //Step:2
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beca35?user=root&password=Settleinspain1@");      //Step:3

			stm = con.createStatement();                //Step:4
			
			boolean ans = stm.execute(qup);           //Step:5
			System.out.println(ans);
			
			
			
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
	}
}
