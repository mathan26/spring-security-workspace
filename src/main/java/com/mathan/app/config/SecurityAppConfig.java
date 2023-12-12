package com.mathan.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;


@Configuration
@EnableWebSecurity(debug = true)
public class SecurityAppConfig {
    @Bean
    public InMemoryUserDetailsManager setupUser(){

        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("admin"));
        authorities.add(new SimpleGrantedAuthority("user"));

        UserDetails mathanUser = new User("mathan","test",authorities);
        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager();
        inMemoryUserDetailsManager.createUser(mathanUser);
        return inMemoryUserDetailsManager;
    }

    @Bean
    public  PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
