package com.mohannad.springsecurityall.authentication;

import com.mohannad.springsecurityall.model.UserEntity;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @author Mohannad Elmagharby
 * on 4/22/2020
 */
public class CustomUserDetails extends User {

    @Getter
    private UserEntity user;

    public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public CustomUserDetails(UserEntity user) {
        super(user.getUsername(), user.getPassword(), UserRole.USER.grantedAuthorities());
        this.user = user;
    }
}
