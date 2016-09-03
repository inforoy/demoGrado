package com.bank.credyunion.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bank.credyunion.model.GeneralView;
import com.bank.credyunion.model.User;
import com.google.gson.Gson;

@Controller
public class UserController {

	@RequestMapping(value="/loadHome.htm", method = RequestMethod.GET)
	public String loadHome(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("llego");
		String jsonData = request.getParameter("jsonData");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
		
		User user = new User();
		user.setName("roy");
		user.setEmail("roy@gmail.com");
		
		Gson gson = new Gson();
		GeneralView generalView = new GeneralView();
		generalView.setMensaje("success");
		generalView.setSuccess(true);
		generalView.setTotalCount(1L);
		generalView.setData(user);
		String data = gson.toJson(generalView);
		out.write(data);
		System.out.println("termino");
		return "home";
	}
}
