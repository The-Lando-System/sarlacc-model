package com.mattvoget.sarlacc.models;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN, USER, DEMO;

    @Override
    public String getAuthority() {
        return name();
    }
}
