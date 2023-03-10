package com.iu.start.members;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.iu.start.util.DBConnector;


@Repository
public class BankMembersDAO implements MembersDAO{

	
	
	@Override
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception {
		
		
		
		Connection con = DBConnector.getConnection();
		String sql = "INSERT INTO BANKMEMBERS VALUES (?,?,?,?,?)";
		
		PreparedStatement st =  con.prepareStatement(sql);
		
		st.setString(1, bankMembersDTO.getID());
		st.setString(2, bankMembersDTO.getPW());
		st.setString(3, bankMembersDTO.getName());
		st.setString(4, bankMembersDTO.getEmail());
		st.setString(5, bankMembersDTO.getPhone());
		
		
		
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);	
		
		return result;
	}

	@Override
	public ArrayList<BankMembersDTO> getSearchByID(String search) throws Exception {
		
		ArrayList<BankMembersDTO> SearchList = new ArrayList<BankMembersDTO>();
		
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM BANKMEMBERS WHERE ID LIKE ?";
		
		PreparedStatement st =  con.prepareStatement(sql);
		
		st.setString(1, "%"+search+"%");
		
		ResultSet rs = st.executeQuery();
		int i = 0;
		while(rs.next()) {
			BankMembersDTO bankMembersDTO = new BankMembersDTO();
			bankMembersDTO.setID(rs.getString(1));
			bankMembersDTO.setPW(rs.getString(2));
			bankMembersDTO.setName(rs.getString(3));
			bankMembersDTO.setEmail(rs.getString(4));
			bankMembersDTO.setPhone(rs.getString(5));
			SearchList.add(bankMembersDTO);
		}
		
		DBConnector.disConnect(rs,st, con);
		return SearchList;	
		
	}
	
	
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
		
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT ID,NAME,EMAIL FROM BANKMEMBERS WHERE ID = ? AND PW = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, bankMembersDTO.getID());
		st.setString(2, bankMembersDTO.getPW());
		
		ResultSet rs = st.executeQuery();
		
		
		if(rs.next()) {
			bankMembersDTO.setID(rs.getString(1));
			bankMembersDTO.setName(rs.getString(2));
			bankMembersDTO.setEmail(rs.getString(3));
		}else
			bankMembersDTO = null;
		
		DBConnector.disConnect(rs,st, con);
		
		return bankMembersDTO;
		
		
	}
	
	
	
}
