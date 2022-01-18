package com.mehmetpekdemir.librarymanagementsystem.service;

import com.mehmetpekdemir.librarymanagementsystem.entity.Login;
import com.mehmetpekdemir.librarymanagementsystem.entity.Otherlogin;
import com.mehmetpekdemir.librarymanagementsystem.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OtherloginService implements UserDetailsService {
    @Autowired
    private LoginRepository loginRepository;

    @Override
    public UserDetails loadUserByUsername(String uemail) throws UsernameNotFoundException {
        Optional<Login>login = loginRepository.findByUemail(uemail);
        login.orElseThrow(() -> new UsernameNotFoundException("User name does not exist :"+uemail));
        return login.map(Otherlogin::new).get();
    }
}
