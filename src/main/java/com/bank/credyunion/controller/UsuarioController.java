package com.bank.credyunion.controller;

import java.io.PrintWriter;
import java.util.List;

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
public class UsuarioController {

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
		usuarioBean.setIdUsuario("0");
		usuarioBean.setNombreUsuario("demo");
		usuarioBean.setNombres("Demo New");
		usuarioBean.setApellidoPaterno("CalleX");
		usuarioBean.setApellidoMaterno("SulcaX");
		usuarioBean.setContrasenia("123");
		
		try {
			/*boolean isTrue = userService.registerUser(usuarioBean);
			
			usuarioBean.setIdUsuario(3);
			usuarioBean.setNombreUsuario("demo");
			usuarioBean.setNombres("Demo New XYZ");
			usuarioBean.setApellidoPaterno("Calle XYZ");
			usuarioBean.setApellidoMaterno("Sulca XYZ");
			boolean isTrue2 = userService.updateUser(usuarioBean);
			
			UsuarioBean usuarioBean2 = userService.findUserById(usuarioBean);
			
			List<UsuarioBean> list = userService.findAllUsers();
			
			boolean isTrue3 = userService.deleteUser(usuarioBean2);
			*/
		} catch (Exception e) {
			System.out.println("Error"+e);
		}
		return "home";
	}
	

}
