package com.mohannad.springsecurityall.authentication;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum UserRole {
    USER(Arrays.asList(UserPrivilege.USER)),
    ADMIN(Arrays.asList(UserPrivilege.USER, UserPrivilege.ADMIN));

    private final List<UserPrivilege> privileges;

    UserRole(List<UserPrivilege> privileges) {
        this.privileges = privileges;
    }

    public GrantedAuthority grantedAuthority() {
        return new SimpleGrantedAuthority("ROLE_" + name());
    }

    public List<GrantedAuthority> grantedAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(this.grantedAuthority());
        privileges.stream()
                .map(p -> p.grantedAuthority())
                .forEach(authorities::add);
        return authorities;
    }
}
