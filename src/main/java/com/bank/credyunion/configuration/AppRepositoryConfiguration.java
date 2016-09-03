package com.bank.credyunion.configuration;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bank.credyunion.repository")
public class AppRepositoryConfiguration {
    /**
     * Using DB manager.
     */
    @PostConstruct
    public void startDBManager()
    {
	/* Descomentar en Local para acceder a la interfaz de H2 */
	/*
	 * DatabaseManagerSwing.main(new String[] { "--url",
	 * "jdbc:h2:mem:testdb", "--user", "sa", "--password", "" });
	 */
    }
}
