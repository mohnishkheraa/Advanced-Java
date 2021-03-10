package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configure.MyConnection;
import com.ltts.model.Auction;
import com.ltts.model.Player;
import com.ltts.model.Team;

public class TeamDao {
	public boolean insertTeam(Team t) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into team values(?,?,?,?)");
		ps.setInt(1, t.getTeamId());
		ps.setString(2, t.getTeamname());
		ps.setString(3, t.getOwnerName());
		ps.setString(4, t.getCoachName());
		return ps.execute();
		//return false;
}
	
	public List<Team> getAllPlayers2() throws Exception{
		List<Team> li=new ArrayList<Team>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from team");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Team(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			
		}
		return li; 
		
	}
}
