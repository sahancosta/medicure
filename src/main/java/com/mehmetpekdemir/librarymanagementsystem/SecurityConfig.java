package com.mehmetpekdemir.librarymanagementsystem;

import com.mehmetpekdemir.librarymanagementsystem.entity.Otherlogin;
import com.mehmetpekdemir.librarymanagementsystem.service.OtherloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private OtherloginService otherloginService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth
                .userDetailsService(otherloginService)
                .passwordEncoder(BCryptPasswordEncoder());
    }

    @Override
    protected  void configure(HttpSecurity http) throws Exception{
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("/").permitAll();
//        http.authorizeRequests()
//                .antMatchers("/PharmacistView").hasAnyRole("ADMIN","PHARMACIST")
//                .antMatchers("/AddPharmacist","/showUpdatePharmacist/**","deletePharmacist/**").hasAnyRole("ADMIN")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .permitAll()
//                .and()
//                .logout()
//                .invalidateHttpSession(true)
//                .permitAll()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .and()
//                .exceptionHandling().accessDeniedPage("/403");

    }
    @Bean
    public BCryptPasswordEncoder BCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
