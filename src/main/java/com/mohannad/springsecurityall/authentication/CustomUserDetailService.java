package com.mohannad.springsecurityall.authentication;

import com.mohannad.springsecurityall.model.UserEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Mohannad Elmagharby
 * on 4/22/2020
 */
@Service
public class CustomUserDetailService implements UserDetailsService {

    private UserEntity userEntity = new UserEntity(1l,
            "mohannad","elmaghraby","admin","12345");

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (!username.equals(userEntity.getUsername()))
            throw new UsernameNotFoundException(username);
        else return new CustomUserDetails(userEntity);
    }
}
