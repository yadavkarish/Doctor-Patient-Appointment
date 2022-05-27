package com.Apointment.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Apointment.Entity.PatientSettingData;
import com.Apointment.Model.PatientDAOimp;
import com.Apointment.Model.UserDAOimp;
import com.Apointment.Controller.LoginController;

/**
 * Servlet implementation class LogoutController
 */
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	UserDAOimp udi= null; 
	PatientDAOimp pdi =null;
    public LogoutController() {
        pdi=new PatientDAOimp();
    	udi= new UserDAOimp();
        // TODO Auto-generated constructor stub
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	} 
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String action= request.getParameter("action");
		
		switch(action) {
		case "patientLogout":  patientLogout(request,response);break;
		
		default :
		
		}

	}
	
	
protected void patientLogout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(false);
	      session.invalidate();
		  RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		  rd.forward(request, response);
		
	}

}
