package com.bank.credyunion.integration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bank.credyunion.bean.UsuarioBean;
import com.bank.credyunion.configuration.AppRepositoryConfigurationTest;
import com.bank.credyunion.configuration.AppServiceConfigurationTest;
import com.bank.credyunion.configuration.JdbcConfigurationTest;
import com.bank.credyunion.configuration.PostgresqlDataSourceTest;
import com.bank.credyunion.exception.ServiceException;
import com.bank.credyunion.service.UsuarioService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
        JdbcConfigurationTest.class,
        PostgresqlDataSourceTest.class,
        AppRepositoryConfigurationTest.class,
        AppServiceConfigurationTest.class
    })
public class UsuarioTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired
    private UsuarioService usuarioService;
	
    @Test
    public void registrarUsuario_Ok() throws ServiceException {
        System.out.println("init");
        UsuarioBean bean = new UsuarioBean();
        bean.setNombreUsuario("royw");
        bean.setNombres("roy w");
        bean.setApellidoPaterno("ca");
        bean.setApellidoMaterno("su");
        bean.setContrasenia("pass");

//        boolean isRegister = usuarioService.registerUsuario(bean);
//        Assert.assertEquals(isRegister, true);

        System.out.println("end");
    }
}
