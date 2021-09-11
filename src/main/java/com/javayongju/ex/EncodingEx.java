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
	    System.out.println("doGet �޼ҵ尡 ����Ǿ����ϴ�.");
	
	    String name = request.getParameter("name");
	   
	   response.setContentType("text/html; charset=EUC-KR");
	   PrintWriter wt = response.getWriter();
	   
	   wt.println("<html><head></head><body>");
	   wt.println("�̸��� : "+name+"�Դϴ�.");
	   wt.println("</body></html>");
	   
	   wt.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
	    System.out.println("doPost �޼ҵ尡 ����Ǿ����ϴ�.");
	    
	    request.setCharacterEncoding("EUC-KR"); // request��ü�� �Ķ��Ͱ��� �ѱ۷� ���ڵ�
	   String name = request.getParameter("name");
	   
	   response.setContentType("text/html; charset=EUC-KR");
	   PrintWriter wt = response.getWriter();
	   
	   wt.println("<html><head></head><body>");
	   wt.println("�̸��� : "+name+"�Դϴ�.<br/>");
	   wt.println("</body></html>");
	   
	   wt.close();
	}

}
