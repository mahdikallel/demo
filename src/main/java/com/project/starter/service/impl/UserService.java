package com.project.starter.service.impl;

import com.project.starter.entities.Authority;
import com.project.starter.entities.Role;
import com.project.starter.entities.User;
import com.project.starter.repository.UserRepository;
import com.project.starter.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Created by Mahdi on 22/10/2018.
 */
@Service("localUserDetailsService")
public class UserService implements IUserService, UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            UserDetails userDetails = new UserDetails() {
                private Collection<? extends GrantedAuthority> getAuthorities(Collection<Role> roles) {
                    List<GrantedAuthority> authorities = new ArrayList<>();
                    for (Role role : roles) {
                        authorities.add(new SimpleGrantedAuthority(role.getDesignation()));
                        role.getAuthorities().stream()
                                .map(p -> new SimpleGrantedAuthority(p.getDesignation()))
                                .forEach(authorities::add);
                    }

                    return authorities;
                }

                @Override
                public Collection<? extends GrantedAuthority> getAuthorities() {
                    return getAuthorities(user.getRoles());
                }

                @Override
                public String getPassword() {
                    return user.getPassword();
                }

                @Override
                public String getUsername() {
                    return user.getUsername();
                }

                @Override
                public boolean isAccountNonExpired() {
                    return user.isEnabled();
                }

                @Override
                public boolean isAccountNonLocked() {
                    return user.isEnabled();
                }

                @Override
                public boolean isCredentialsNonExpired() {
                    return user.isEnabled();
                }

                @Override
                public boolean isEnabled() {
                    return user.isEnabled();
                }
            };
            return userDetails;

        }

        throw new UsernameNotFoundException(username);
    }
}
