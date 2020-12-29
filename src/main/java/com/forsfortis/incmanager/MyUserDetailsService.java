package com.forsfortis.incmanager;

import java.util.Optional;

import com.forsfortis.incmanager.model.User;
import com.forsfortis.incmanager.repository.UserRepository;
import com.forsfortis.incmanager.security.MyUserDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;  

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user= userRepository.findByEmail(username);
        user.orElseThrow(()->new UsernameNotFoundException("user not found"));
        return user.map(MyUserDetail::new).get();

    }

}
