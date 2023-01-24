package com.nithin;

import java.sql.*;                         //Step:1

public class DeletingInJDBC {

	public static void main(String[] args) {

		Connection con=null;
		Statement stm;

		String qdel= "delete from beca35.emp where id=123";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");           //Step:2

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beca35?user=root&password=Settleinspain1@");      //Step:3

			stm = con.createStatement();                //Step:4

			boolean ans = stm.execute(qdel);           //Step:5
			System.out.println(ans);


		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}
}