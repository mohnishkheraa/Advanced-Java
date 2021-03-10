package com.ltts.controller;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.PlayerDao;
import com.ltts.model.Player;
import javax.servlet.RequestDispatcher;
/**
 * Servlet implementation class InsertPlayerServlet
 */
@WebServlet("/InsertPlayerServlet")
public class InsertPlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public InsertPlayerServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int id=Integer.parseInt(request.getParameter("pid"));
		String name=request.getParameter("pname");
		String dob=request.getParameter("pdob");
		String country=request.getParameter("pcountry");
		String skill=request.getParameter("pskill");
		String style=request.getParameter("pstyle");
		int runs=Integer.parseInt(request.getParameter("pruns"));
		int wickets=Integer.parseInt(request.getParameter("pwickets"));
		int tid=Integer.parseInt(request.getParameter("tid"));
		int matches=Integer.parseInt(request.getParameter("pmatch"));
		Player p=new Player(id,name, dob, country, skill, style, runs, wickets,tid, matches);
		System.out.println("Inside Servlet: "+p);
		PlayerDao pd=new PlayerDao();
		boolean b=false;
		 PrintWriter out = response.getWriter(); 
		RequestDispatcher rd=null;
		try {
			b=pd.insertPlayer(p); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
			rd=request.getRequestDispatcher("Result.html");
			rd.forward(request, response);
			//System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.write("Already Player id Used: "+e);
			rd=request.getRequestDispatcher("Player.html");
			rd.include(request, response);
			e.printStackTrace();
		}
	}

}
