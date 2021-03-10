package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configure.MyConnection;
import com.ltts.model.Player;

public class PlayerDao {
	
	public boolean insertPlayer(Player p) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into pappu values(?,?,?,?,?,?,?,?,?,?)");

		ps.setInt(1, p.getId());
		ps.setString(2, p.getPlayerName());
		ps.setString(3, p.getDob());
		ps.setString(4, p.getCountry());
		ps.setString(5, p.getSkill());
		ps.setString(6, p.getBatStyle());
		ps.setInt(7, p.getRuns());
		ps.setInt(8, p.getWickets());
		ps.setInt(9, p.getId());
		ps.setInt(10, p.getMatches());
		
		return ps.execute();
		//return false;

		
	}
	
	public List<Player> getAllPlayers() throws Exception{
		List<Player> li=new ArrayList<Player>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from pappu");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Player(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5),rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10)));
			
		}
		return li; 
		
	}

	
	
	
	}

