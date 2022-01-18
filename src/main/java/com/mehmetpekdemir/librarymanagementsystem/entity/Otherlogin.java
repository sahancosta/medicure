package com.mehmetpekdemir.librarymanagementsystem.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Otherlogin implements UserDetails {

    private String uemail;
    private String upassword;

    private int ustatus;
    private List<GrantedAuthority>urole;

    public Otherlogin(Login login){
        this. uemail= login.getUemail();
        this. upassword= login.getUpassword();
        this. ustatus= login.getUstatus();
        this. urole= Arrays.stream(login.getUrole().split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
    public Otherlogin(){

    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
