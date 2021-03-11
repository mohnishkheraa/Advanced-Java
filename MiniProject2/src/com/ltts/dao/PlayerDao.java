package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	
	public Player getPlayerById(int id) throws Exception {
		Player p=new Player();
		List<Player> li=getAllPlayers();
		for(Player p1:li) {
			if(p1.getId() == id) {
				p.setId(id);
				
				p.setPlayerName(p1.getPlayerName());
				p.setDob(p1.getDob());
				p.setCountry(p1.getCountry());
				p.setSkill(p1.getSkill());
				p.setBatStyle(p1.getBatStyle());
				p.setRuns(p1.getRuns());
				p.setWickets(p1.getWickets());
				p.setTid(p1.getTid());
				p.setMatches(p1.getMatches());
				
				
			}
		}
		
		return p;
	
}



	public boolean updatePlayer(int playerid, String name, String dOB, String country, String skill, String style,
			int runs, int wickets, int teamid, int matches) throws Exception {
		// TODO Auto-generated method stub
		Connection c=MyConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("UPDATE pappu SET playername = ?,DOB = ?,country = ?,skill=?,style=?,runs = ?,wickets = ?,matches = ? where player_id=?");
		
		ps.setString(1, name);
		ps.setString(2, dOB);
		ps.setString(3, country);
		ps.setString(4, skill);
		ps.setString(5, style);
		ps.setInt(6, runs);
		ps.setInt(7, wickets);
		
		ps.setInt(8, matches);
		ps.setInt(9,playerid );
		return ps.execute();

	}
	
	
	}

