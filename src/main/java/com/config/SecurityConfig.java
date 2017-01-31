package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

import javax.sql.DataSource;

/**
 * Created by vlad on 30.01.17.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .anyRequest().authenticated()
                    .and()
                .formLogin().loginPage("/login")
                .defaultSuccessUrl("/dashboard")
                .permitAll()
                .and()
                .rememberMe()
                    .tokenValiditySeconds(2419200)
                    .key("secretKey")
                .and()
                .logout()
                .permitAll();
                //.httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
            auth
                    .jdbcAuthentication()
                    .dataSource(dataSource)
                    .usersByUsernameQuery(
                            "select login as username,password,true as enabled " +
                                    "from admin.users where login=?"
                    )
                    .authoritiesByUsernameQuery(
                            "select login as username, role " +
                                    "from admin.users where login=?"
                    );
            /*auth
                .inMemoryAuthentication()
                .withUser("user").password("user").roles("USER").and()
                .withUser("admin").password("admin").roles("USER", "ADMIN").and()
                .withUser("projman").password("projman").roles("USER", "MANAGER");*/
    }
}
