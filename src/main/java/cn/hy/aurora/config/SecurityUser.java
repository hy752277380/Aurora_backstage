package cn.hy.aurora.config;

import cn.hy.aurora.domain.AurSysUser;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author hy
 * @version 1.0
 * @date 2019/8/23 10:34
 */
public class SecurityUser implements UserDetails {

    private AurSysUser userInfo;
    private Logger logger = LoggerFactory.getLogger(getClass());

    private static final long serialVersionUID = 1L;

    public SecurityUser(AurSysUser aurSysUser) { this.userInfo = aurSysUser; }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        String role = this.userInfo.getUserRole();
        if (role != null) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }

    @Override
    @JsonIgnore
    public String getPassword() { return null; }

    @Override
    @JsonIgnore
    public String getUsername() { return userInfo.getUserAuthCode(); }

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

    public AurSysUser getUserInfo() { return userInfo; }
}
