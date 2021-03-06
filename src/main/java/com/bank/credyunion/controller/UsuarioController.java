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
import com.bank.credyunion.service.UsuarioService;
import com.google.gson.Gson;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioService userService;
	
	@RequestMapping(value="/loadHome.htm", method = RequestMethod.GET)
	public String loadHome(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("llego");
		String jsonData = request.getParameter("jsonData");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
		System.out.println(jsonData);
        
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
	
	@RequestMapping(value="/loadLogin.htm", method = RequestMethod.GET)
	public String loadLogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			System.out.println("llego");
		} catch (Exception e) {
			System.out.println("Error"+e);
		}
		return "login";
	}
	
	@RequestMapping(value="/registrarUsuario.htm", method = RequestMethod.GET)
	public String registrarUsuario(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			System.out.println("llego");
		} catch (Exception e) {
			System.out.println("Error"+e);
		}
		return "registrarUsuario";
	}
	
	@RequestMapping(value="/registrarEmpresa.htm", method = RequestMethod.GET)
	public String registrarEmpresa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			System.out.println("llego");
		} catch (Exception e) {
			System.out.println("Error"+e);
		}
		return "registrarEmpresa";
	}
	
	@RequestMapping(value="/registrarAgencia.htm", method = RequestMethod.GET)
	public String registrarAgencia(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			System.out.println("llego");
		} catch (Exception e) {
			System.out.println("Error"+e);
		}
		return "registrarAgencia";
	}
	
	@RequestMapping(value="/registrarSocio.htm", method = RequestMethod.GET)
	public String registrarSocio(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			System.out.println("llego");
		} catch (Exception e) {
			System.out.println("Error"+e);
		}
		return "registrarSocio";
	}
	
	@RequestMapping(value="/registrarProductoCuenta.htm", method = RequestMethod.GET)
	public String registrarProductoCuenta(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			System.out.println("llego");
		} catch (Exception e) {
			System.out.println("Error"+e);
		}
		return "crearProductoCuenta";
	}
	
	@RequestMapping(value="/buscarSocio.htm", method = RequestMethod.GET)
	public String buscarSocio(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			System.out.println("llego");
		} catch (Exception e) {
			System.out.println("Error"+e);
		}
		return "BuscarSocio";
	}
	

}
