package com.ltts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.TeamDao;
import com.ltts.model.Player;
import com.ltts.model.Team;

/**
 * Servlet implementation class UpdateTeamServlet
 */
@WebServlet("/UpdateTeamServlet")
public class UpdateTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTeamServlet() {
        super();
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
		 PrintWriter out = response.getWriter(); 
			int Teamid=Integer.parseInt(request.getParameter("Teamid"));
			
			String Teamname=request.getParameter("Teamname");
			String Teamowner=request.getParameter("Teamowner");
			String Teamcoach=request.getParameter("Teamcoach");
			Team t = new Team(Teamid,Teamname,Teamowner,Teamcoach);
			System.out.println("Inside Update Team Servlet: "+t);
			TeamDao td=new TeamDao();
			boolean b=false;
			RequestDispatcher rd=null;
			try {
				b=td.updateTeam(Teamid,Teamname,Teamowner,Teamcoach); // Control TRanfers to Dao file
				rd=request.getRequestDispatcher("Result.html");
				rd.forward(request, response);
				//System.out.println("Successfully Inserted...");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				out.write("Already Team id Used: "+e);
				rd=request.getRequestDispatcher("Team.html");
				rd.include(request, response);
				e.printStackTrace();
			}
	}
	}


