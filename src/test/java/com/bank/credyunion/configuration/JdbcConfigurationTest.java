package com.bank.credyunion.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Services configuration.
 *
 * @author Vector ITC Group
 */
@Configuration
@EnableTransactionManagement
public class JdbcConfigurationTest
{

    @Autowired
    private DataSource dataSource;

    /**
     * JDBC template bean configuration
     *
     * @return {@link JdbcTemplate}
     */
    @Bean
    public JdbcTemplate jdbcTemplate()
    {
	     return new JdbcTemplate(dataSource);
    }

    /**
     * PlatformTransactionManager bean configuration
     *
     * @return {@link PlatformTransactionManager}
     */
    @Bean
    public PlatformTransactionManager txManager()
    {
	     return new DataSourceTransactionManager(dataSource);
    }

}
