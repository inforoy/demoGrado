package com.bank.credyunion.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInitializerTest extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { 
				PostgresqlDataSourceTest.class,
				JdbcConfigurationTest.class,
				WelcomeConfigurationTest.class,
				AppRepositoryConfigurationTest.class,
				AppServiceConfigurationTest.class
				//,AppConfigMapper.class
		};
	}
 
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { SpringWebConfigTest.class };
	}
 
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
