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

public class AuctionDao {
	
	public boolean insertAuction(Auction p) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into auction values(?,?,?,?)");
		ps.setInt(1, p. getAuc_id());
		ps.setInt(2, p. getPlayer_id());
		ps.setInt(3, p.getTeam_id());
		ps.setInt(4, p.getAmount());
		
		
		return ps.execute();
	}

	public List<Auction> getAllPlayers1() throws Exception{
		List<Auction> li=new ArrayList<Auction>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from auction");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Auction(rs.getInt(1),rs.getInt(2), rs.getInt(3), rs.getInt(4)));
			
		}
		return li; 
		
	}
	
	public Auction getAuctionById(int aid) throws Exception {
		Auction t=new Auction();
		List<Auction> li=getAllPlayers1();
		for(Auction t1:li) {
			if(t1.getAuc_id() == aid) {
				t.setAuc_id(aid);
				t.setAuc_id(t1.getAuc_id());
				t.setTeam_id(t1.getTeam_id());
				t.setAmount(t1.getAmount());
				
				
				
		
				
				
			}
		}
		
		return t;
	
}
public boolean updateAuction(int auctionid, int playerid, int teamid,int Amount) throws Exception {
	// TODO Auto-generated method stub
	
	Connection c=MyConnection.getConnection();
	PreparedStatement ps=c.prepareStatement("UPDATE auction SET amount = ? where auc_id=?");
	ps.setInt(1, Amount);
	
	ps.setInt(2, auctionid);
	

return ps.execute();



}

}