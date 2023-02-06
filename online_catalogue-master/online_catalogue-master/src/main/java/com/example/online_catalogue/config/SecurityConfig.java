package com.example.online_catalogue.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
      PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth.jdbcAuthentication().dataSource(dataSource)
        .authoritiesByUsernameQuery("select username, password, enabled"
                + "from users"
                + "where username=?")
        .authoritiesByUsernameQuery("select username, authority"
                + " from authorities"
                + " where username=?");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/userPage").hasRole("USER")
                .antMatchers("/adminPage").hasRole("ADMIN")
                .antMatchers("/index").hasAnyRole("ADMIN","USER")
                .antMatchers("/grades").hasAnyRole("ADMIN","USER")
                .antMatchers("/courses").hasAnyRole("ADMIN","USER")
                .antMatchers("/exams").hasAnyRole("ADMIN","USER")
                .antMatchers("/logare").hasAnyRole("USER","ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin();
    }

    @Bean
    public PasswordEncoder getPass(){
        return NoOpPasswordEncoder.getInstance();
    }

}
