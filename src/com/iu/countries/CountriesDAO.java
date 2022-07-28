package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnector;

public class CountriesDAO {

	
	public void getDetail(String country_name) throws Exception {
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		//2. SQL문 작성
		String sql = "SELECT * From Countries WHERE country_name='%?%'";
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ? 겂 새탕 =
		
		st.setString(1, country_name);
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			String rId= rs.getString("country_name");
		
			
			System.out.println(rId);
			
			
		}
		

		DBConnector.disConnect(rs, st, con);
		
	}
	
	
	
	
	//1.Regions의 모든 데이터 가져오기
		public void getList() throws Exception {
			//1.DB 연결
			Connection con = DBConnector.getConnection();
			
			
			//2. query문 작성
			String sql = "SELECT * FROM Countries";
			
			//3. Query문 미리 전송
			
			PreparedStatement st = con.prepareStatement(sql);
			
			//4. 
			
			//5. 최종 전송 후 결과 처리
			ResultSet rs = st.executeQuery();
			
			
			while(rs.next()) {
				
				int id = rs.getInt("Region_id");
				String name = rs.getString("Country_name");
				
				System.out.println(id);
				System.out.println(name);
				
				
			}
			
			//6. 자원 해제
			
			DBConnector.disConnect(rs, st, con);
			
		}
		
}
