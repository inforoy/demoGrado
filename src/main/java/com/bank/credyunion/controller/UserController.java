package com.bank.credyunion.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bank.credyunion.bean.UsuarioBean;
import com.bank.credyunion.model.GeneralView;
import com.bank.credyunion.service.UserService;
import com.google.gson.Gson;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/loadHome.htm", method = RequestMethod.GET)
	public String loadHome(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("llego");
		String jsonData = request.getParameter("jsonData");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
		
		Gson gson = new Gson();
		GeneralView generalView = new GeneralView();
		generalView.setMensaje("success");
		generalView.setSuccess(true);
		generalView.setTotalCount(1L);
		generalView.setData(null);
		String data = gson.toJson(generalView);
		out.write(data);
		System.out.println("termino");
		
//		UsuarioBean usuarioBean = gson.fromJson(jsonData, UsuarioBean.class);
		UsuarioBean usuarioBean = new UsuarioBean();
		usuarioBean.setIdUsuario("1");
		usuarioBean.setNombreUsuario("roy");
		usuarioBean.setNombres("Roy Walter");
		usuarioBean.setApellidoPaterno("Calle");
		usuarioBean.setApellidoMaterno("Sulca");
		usuarioBean.setContrasenia("123");
		usuarioBean.setIndicadorEliminacion("0");
		userService.findUserById(usuarioBean);
		userService.registerUser(usuarioBean);
		userService.deleteUser(usuarioBean);
		userService.findAllUsers();
		
		return "home";
	}
	
//	@RequestMapping(value="/saveUser.htm", method = RequestMethod.GET)
//	public String saveUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		System.out.println("llego");
//		String jsonData = request.getParameter("jsonData");
//        PrintWriter out = response.getWriter();
//        response.setContentType("text/html");
//		
//		User user = new User();
//		user.setName("roy");
//		user.setEmail("roy@gmail.com");
//		
//		Gson gson = new Gson();
//		GeneralView generalView = new GeneralView();
//		generalView.setMensaje("success");
//		generalView.setSuccess(true);
//		generalView.setTotalCount(1L);
//		generalView.setData(user);
//		String data = gson.toJson(generalView);
//		out.write(data);
//		System.out.println("termino");
//		return "home";
//	}
}
