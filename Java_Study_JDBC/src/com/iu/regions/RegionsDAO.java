package com.iu.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnector;

public class RegionsDAO {

	//2.Regions 하나의 결과 (row )
	public RegionsDTO getDetail(int region_id) throws Exception {
		RegionsDTO dto = null;
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		//2. SQL문 작성
		String sql = "SELECT * From REGIONS WHERE REGION_ID=?";
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ? 겂 새탕 =
		st.setInt(1,region_id);
		
		ResultSet rs = st.executeQuery();
		
		
		
		
		if(rs.next()) {
			dto = new RegionsDTO();
			dto.setRegion_id(rs.getInt(1));
			dto.setRegion_name(rs.getString(2));
		}

		DBConnector.disConnect(rs, st, con);
		return dto;
	}
	
	
	
	
	
	
	
	//1.Regions의 모든 데이터 가져오기
	public void getList() throws Exception {
		//1.DB 연결
		Connection con = DBConnector.getConnection();
		
		
		//2. query문 작성
		String sql = "SELECT * FROM REGIONS";
		
		//3. Query문 미리 전송
		
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. 
		
		
		
		//5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		
		while(rs.next()) {
			
			int id = rs.getInt("Region_id");
			String name = rs.getString("Region_name");
			
			
			
			
			
			
		}
		
		
		

		DBConnector.disConnect(rs, st, con);
		
		
		
		
	}
	
	
	
}
