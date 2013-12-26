package com.huang.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import com.huang.util.Massage;

public class ChatServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name=request.getParameter("name");
		String content=request.getParameter("content");
		ServletContext application=request.getSession().getServletContext();
		Object ob=application.getAttribute("massage");
		if (ob==null)
		{
			application.setAttribute("massage",new ArrayList<Massage>());
		}
		
		List<Massage> list=new ArrayList<Massage>();
		Massage massage=new Massage();
		massage.setName(name);
		massage.setContent(content);
		massage.add(list);
		application.setAttribute("massage",list);
		response.sendRedirect("/chat/chatWindow.jsp");
	}

}
