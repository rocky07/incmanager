package com.forsfortis.incmanager.security;

import java.util.Collection;
import java.util.stream.Collectors;

import com.forsfortis.incmanager.model.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetail implements UserDetails {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private User user;
   

    public MyUserDetail(){

    }
    
    public MyUserDetail(final User user){
        this.user=user;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
    
       return user.getRole().stream()
        .map(role->{
            System.out.println(role.getRole());
            return new SimpleGrantedAuthority(role.getRole());
        })
        .collect(Collectors.toList());

        //return Arrays.asList(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getFirst_name();
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return user.getActive_status();
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.getActive_status();
    }

}
