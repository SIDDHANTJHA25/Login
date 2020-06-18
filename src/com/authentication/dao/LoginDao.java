package com.authentication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.authentication.model.Login;
import com.authentication.utility.Utility;;
public class LoginDao {
	private String TAG="com.authentication.dao.LoginDao";
	
	private static LoginDao loginDao = new LoginDao();
	
	private LoginDao() {
		
	}
	public static LoginDao getLoginDao() {
		return loginDao;
	}
	public Login login(String username,String pass) {

		Login login=null;
		try (Connection con = Dao.getMyConnection();) {
			PreparedStatement ps = con.prepareStatement("select * from LOGINTEST where USERNAME=? and PASSWORD=?");
			System.out.println("connection established successfully");
			ps.setString(1, username);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();

			if(rs.next()) {
				login=new Login();
				login.setName(rs.getString(1));
				login.setPass(rs.getString(2));
				
	}
		}
		catch(Exception e)
		{
			Utility.logFile(TAG + ".insert", e.toString());
		}
		return login;
    }
}
