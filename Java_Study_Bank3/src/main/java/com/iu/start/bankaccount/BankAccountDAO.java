package com.iu.start.bankaccount;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Calendar;

import com.iu.start.util.DBConnector;

public class BankAccountDAO {

	
	public ArrayList<BankAccountDTO> getList(){
		
		
		return null;
	}
	
	public int add(BankAccountDTO bankAccountDTO) throws Exception {
		
		Connection con = DBConnector.getConnection();
		
		String sql = "insert into bankaccount VALUES (ACCOUNT_SEQ.nextval,?,?,sysdate)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		
		
		st.setString(1,bankAccountDTO.getUserID() );
		st.setLong(2,bankAccountDTO.getBookNum() );
		
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		return result;
	}
	
	
	
}
