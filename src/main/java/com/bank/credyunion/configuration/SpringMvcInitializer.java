package com.bank.credyunion.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { 
				PostgresqlDataSource.class,
				JdbcConfiguration.class,
				WelcomeConfiguration.class,
				AppRepositoryConfiguration.class,
				AppServiceConfiguration.class
				//,AppConfigMapper.class
		};
	}
 
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { SpringWebConfig.class };
	}
 
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
