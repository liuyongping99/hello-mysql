package com.liuyongping.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJDBC {
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/imooc";
	static final String USER="root";
	static final String PASSWORD="diebold";
	
	public static void helloword() throws ClassNotFoundException
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		// 1. 装载驱动程序
		Class.forName(JDBC_DRIVER);
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			
			//3. 执行SQL语句
			stmt = conn.createStatement();			
			rs = stmt.executeQuery("select userName from user order by userId");
			
			// 4. 获取执行结果
			while(rs.next())
			{
				System.out.println("Hello, " + rs.getString(1));
			}						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally
		{
			try
			{
				if(conn != null)
				{
					conn.close();
				}
				if(stmt != null)
				{
					stmt.close();
				}
				if(rs != null)
				{
					rs.close();
				}
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		helloword();
	}
}
