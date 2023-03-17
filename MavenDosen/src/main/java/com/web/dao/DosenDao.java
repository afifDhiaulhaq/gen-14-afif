package com.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.web.model.Dosen;


public class DosenDao {

	String url = "jdbc:postgresql://localhost:5432/Data_Mhs";
	String username = "postgres";
	String password ="Afif@123";
	String CREATE_SQL = "INSERT INTO dosen (kode_dosen,nama) VALUES (?,?);";
	String ALL_SQL = "SELECT * FROM dosen ORDER BY kode_dosen ASC;";
	String SELECT_BY_ID = "SELECT kode_dosen,nama FROM dosen WHERE kode_dosen=?";
	String UPDATE_SQL = "update dosen set nama=? where kode_dosen=?";
	String DELETE_SQL = "delete from dosen where kode_dosen=?;";
	
	public Connection getConnect() {
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void inserDosen(Dosen dosen) {
		try {
			Connection con = getConnect();
			PreparedStatement st = con.prepareStatement(CREATE_SQL);
			st.setString(1, dosen.getKode_dosen());
			st.setString(2, dosen.getNama());
			st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Dosen selectDosen(String kode_dosen) {
		Dosen dosen = null;
		try {
			Connection con = getConnect();
			PreparedStatement st = con.prepareStatement(SELECT_BY_ID);
			st.setString(1, kode_dosen);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				String nama = rs.getString("nama");
				dosen = new Dosen(kode_dosen,nama);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dosen;
	}
	
	public boolean deletDosen(String kode_dosen) {
		boolean rowDelete = false;
		try {
			Connection con = getConnect();
			PreparedStatement st = con.prepareStatement(DELETE_SQL);
			st.setString(1, kode_dosen);
			rowDelete = st.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowDelete;
	}
	
	public boolean updateDosen(Dosen dosen) {
		boolean rowUpdate = false;
		try {
			Connection con = getConnect();
			PreparedStatement st = con.prepareStatement(UPDATE_SQL);
			st.setString(1, dosen.getNama());
			st.setString(2,dosen.getKode_dosen());
			rowUpdate = st.executeUpdate() > 0;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdate;
	}
	
	public List<Dosen> getAllDosen(){
		List<Dosen> listDosen = new ArrayList<>();
		try {
			Connection con = getConnect();
			PreparedStatement st = con.prepareStatement(ALL_SQL);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				String kode_dosen = rs.getString("kode_dosen");
				String nama = rs.getString("nama");
				listDosen.add(new Dosen(kode_dosen,nama));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listDosen;
	}
}
