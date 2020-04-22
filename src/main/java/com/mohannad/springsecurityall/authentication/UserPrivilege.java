package com.mohannad.springsecurityall.authentication;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum UserPrivilege {
    USER,
    ADMIN;

    public GrantedAuthority grantedAuthority(){
        return new SimpleGrantedAuthority(name());
    }
}
