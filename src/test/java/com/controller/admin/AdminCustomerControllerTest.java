package com.controller.admin;

import com.data.CustomerDAOImpl;
import com.domain.Customer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by vlad on 31.01.17.
 */
public class AdminCustomerControllerTest {
    @Autowired
    private ServletContext context;
    @Test
    public void getCustomersCrudPage() throws Exception {

    }

}