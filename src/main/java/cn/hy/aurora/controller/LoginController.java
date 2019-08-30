package cn.hy.aurora.controller;

import cn.hy.aurora.config.JwtUserDetailsServiceImpl;
import cn.hy.aurora.config.SecurityUser;
import cn.hy.aurora.util.BaseResponse;
import cn.hy.aurora.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hy
 * @version 1.0
 * @date 2019/8/27 13:21
 */
@RestController("/api/sys")
public class LoginController {

    @Autowired
    private JwtUserDetailsServiceImpl userDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/login.set")
    public String login(String authCode) {
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authCode);
        final String token = jwtTokenUtil.generateToken(userDetails);
        return token;
    }

    @GetMapping("/login.info")
    public BaseResponse login(@AuthenticationPrincipal SecurityUser aurSysUser) {
        return BaseResponse.buildSuccess(aurSysUser);
    }
}
