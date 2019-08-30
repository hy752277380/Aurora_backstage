package cn.hy.aurora.config;

import cn.hy.aurora.domain.AurSysUser;
import cn.hy.aurora.service.SettingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author hy
 * @version 1.0
 * @date 2019/8/26 22:29
 */
@Component
public class JwtUserDetailsServiceImpl implements UserDetailsService {
    private static final Logger logger = LoggerFactory.getLogger(JwtUserDetailsServiceImpl.class);
    @Autowired
    private SettingService settingService;

    @Override
    public UserDetails loadUserByUsername(String authCode) throws UsernameNotFoundException {
        AurSysUser user = settingService.findByAuthCode(authCode);
        if (user == null) {
            throw new UsernameNotFoundException("Username " + authCode + " not found");
        }
        return new SecurityUser(user);
    }
}
