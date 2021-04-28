package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.Account;

public class AccountDAO {
	
	public AccountDAO() {
		
	}
	
	public List<Account> selectAllAccounts(){
		List<Account> accounts = new ArrayList();
		Connection connection = DBConnect.getConnection();
		
		String SELECT_ALL_ACCOUNTS = "SELECT * FROM account";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(SELECT_ALL_ACCOUNTS);
		ResultSet rs = preparedStatement.executeQuery();
		
		while(rs.next()) {
			String AccountNumber = rs.getString("AccountNumber");
			String name = rs.getString("name");
			String address = rs.getString("address");
			String dob = rs.getString("dob");
			String phone = rs.getString("phone");
			String email = rs.getString("email");
			
			accounts.add(new Account(AccountNumber, name, address, dob, phone, email));
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accounts;
			
	}
}
