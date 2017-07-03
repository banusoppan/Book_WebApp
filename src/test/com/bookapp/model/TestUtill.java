package test.com.bookapp.model;

import java.sql.Connection;
import java.sql.SQLException;

import com.bookapp.util.ConnectionUtil;

public class TestUtill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=ConnectionUtil.getconnection();
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
