package com.bank.credyunion.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc//<mvc:annotation-driven />
@Configuration
@ComponentScan({ "com.bank.credyunion.controller" })// component-scan
public class SpringWebConfigTest extends WebMvcConfigurerAdapter {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	 public void onStartup(ServletContext container) {
		 ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new DispatcherServlet());
	     registration.setLoadOnStartup(1);
	     registration.addMapping("/*");
	 }
	
//	public void onStartup(ServletContext container) {
//      // Create the 'root' Spring application context
//      AnnotationConfigWebApplicationContext rootContext =
//        new AnnotationConfigWebApplicationContext();
//      rootContext.register(AppConfig.class);
//
//      // Manage the lifecycle of the root application context
//      container.addListener(new ContextLoaderListener(rootContext));
//
//      // Create the dispatcher servlet's Spring application context
//      AnnotationConfigWebApplicationContext dispatcherContext =
//        new AnnotationConfigWebApplicationContext();
//      dispatcherContext.register(DispatcherConfig.class);
//
//      // Register and map the dispatcher servlet
//      ServletRegistration.Dynamic dispatcher =
//        container.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
//      dispatcher.setLoadOnStartup(1);
//      dispatcher.addMapping("/");
//    }
	
}
