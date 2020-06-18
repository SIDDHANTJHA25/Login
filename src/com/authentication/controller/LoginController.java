package com.authentication.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.authentication.dao.LoginDao;
import com.authentication.model.Login;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		loginProcess(req, resp);
	}

	private void loginProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String username=req.getParameter("username");
		String pass=req.getParameter("pass");
		System.out.println(username+"\t"+pass);
		Login login=LoginDao.getLoginDao().login(username, pass);
		if(login!=null) {
	     	req.getSession().setAttribute("login", login);
			System.out.println("hello");
			
		}else {
		
			System.out.println("not login");
		}
		
		
	}
		
		
	}

