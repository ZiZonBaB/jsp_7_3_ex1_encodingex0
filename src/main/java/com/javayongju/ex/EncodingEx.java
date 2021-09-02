package com.javayongju.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EncodingEx
 */
@WebServlet("/EncodingEx")
public class EncodingEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EncodingEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    System.out.println("doGet 메소드가 실행되었습니다.");
	
	    String name = request.getParameter("name");
	   
	   response.setContentType("text/html; charset=EUC-KR");
	   PrintWriter wt = response.getWriter();
	   
	   wt.println("<html><head></head><body>");
	   wt.println("이름은 : "+name+"입니다.");
	   wt.println("</body></html>");
	   
	   wt.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
	    System.out.println("doPost 메소드가 실행되었습니다.");
	    
	    request.setCharacterEncoding("EUC-KR"); // request객체의 파라미터값을 한글로 인코딩
	   String name = request.getParameter("name");
	   
	   response.setContentType("text/html; charset=EUC-KR");
	   PrintWriter wt = response.getWriter();
	   
	   wt.println("<html><head></head><body>");
	   wt.println("이름은 : "+name+"입니다.<br/>");
	   wt.println("</body></html>");
	   
	   wt.close();
	}

}
