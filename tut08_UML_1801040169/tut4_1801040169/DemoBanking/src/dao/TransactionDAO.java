package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.Transaction;

public class TransactionDAO {
	
	public TransactionDAO() {
		
	}
	public List<Transaction> selectAllTransactions(){
		List<Transaction> transactions = new ArrayList<Transaction>();
		
		Connection connection = DBConnect.getConnection();
		
		String SELECT_ALL_TRANSACTIONS = "SELECT * FROM transaction";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TRANSACTIONS);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				String TransactionId = rs.getString("TransactionId");
				String fromAccountNumber = rs.getString("fromAccountNumber");
				String toAccountNumber = rs.getString("toAccountNumber");
				double amount = rs.getDouble("amount");
				
				transactions.add(new Transaction(TransactionId, fromAccountNumber, toAccountNumber, amount));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return transactions;
	}
}
