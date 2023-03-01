package com.iu.start.bankBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.iu.start.members.BankMembersDTO;
import com.iu.start.util.DBConnector;


@Repository
public class BankBookDAO implements BookDAO {

	
	
	
	
	@Override
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = DBConnector.getConnection();
		String sql = "INSERT INTO BANKBOOK VALUES (?,?,?,?)";
		
		PreparedStatement st =  con.prepareStatement(sql);
		
//		long milliSecond = System.currentTimeMillis();
		
		
		st.setLong(1, bankBookDTO.getBooknum());
		st.setString(2, bankBookDTO.getBookname());
		st.setDouble(3, bankBookDTO.getBookrate());
		st.setBoolean(4, bankBookDTO.isBooksale());
		
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);	
		
		return result;
	}

	@Override
	public ArrayList<BankBookDTO> getList() throws Exception {
		// TODO Auto-generated method stub
		
		ArrayList<BankBookDTO> getlist = new ArrayList<BankBookDTO>();
		
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM BANKBOOK";
		
		PreparedStatement st =  con.prepareStatement(sql);
		
		//st.setString(1, "");
		
		ResultSet rs = st.executeQuery();
		//int i = 0;
		while(rs.next()) {
			BankBookDTO dto = new BankBookDTO();
			dto.setBooknum(rs.getLong(1));
			dto.setBookname(rs.getString(2));
			dto.setBookrate(rs.getDouble(3));
			dto.setBooksale(rs.getBoolean(4));
			
			getlist.add(dto);
			
			
			
		}
		
		DBConnector.disConnect(rs,st, con);
		
		
		return getlist;	
		
		
		
		
	}

	@Override
	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception  {
		// TODO Auto-generated method stub
		
		
	//	bankBookDTO.setBooksale(!bankBookDTO.isBooksale()) ;
		boolean change = !bankBookDTO.isBooksale();
		System.out.println(bankBookDTO.isBooksale());
		System.out.println(change);
		Connection con = DBConnector.getConnection();
		String sql = "UPDATE BANKBOOK SET BOOKSALE = ? WHERE BOOKNUM = ?";
		
		PreparedStatement st =  con.prepareStatement(sql);
		
		st.setBoolean(1, change);
		st.setLong(2, bankBookDTO.getBooknum());
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);	
		return result;
	}


	@Override
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
		
		BankBookDTO dto = new BankBookDTO();
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM BANKBOOK WHERE BOOKNUM = ? ";
		
		PreparedStatement st =  con.prepareStatement(sql);
		
		st.setLong(1,bankBookDTO.getBooknum() );
		
		ResultSet rs = st.executeQuery();
		//int i = 0;
		if(rs.next()) {
			
			dto.setBooknum(rs.getLong(1));
			dto.setBookname(rs.getString(2));
			dto.setBookrate(rs.getDouble(3));
			dto.setBooksale(rs.getBoolean(4));
			
		}
	
		return dto;
	}

	@Override
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception {
		
		
		
		
		Connection con = DBConnector.getConnection();
		String sql = "UPDATE BANKBOOK SET BOOKNAME = ? , BOOKRATE = ? WHERE BOOKNUM = ?";
		
		PreparedStatement st =  con.prepareStatement(sql);
		
		
		
		st.setString(1,bankBookDTO.getBookname() );
		st.setDouble(2, bankBookDTO.getBookrate() );
		st.setLong(3, bankBookDTO.getBooknum() );
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);	
		return result;
		
	}
	
	public int setDelete(BankBookDTO bankBookDTO) throws Exception {
		
		
		
		
		Connection con = DBConnector.getConnection();
		String sql = "DELETE BANKBOOK WHERE BOOKNUM = ?";
		
		PreparedStatement st =  con.prepareStatement(sql);
		
		
		
		st.setLong(1,bankBookDTO.getBooknum() );
		
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);	
		return result;
		
	}
	

}
