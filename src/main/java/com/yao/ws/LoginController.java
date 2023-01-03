package com.yao.ws;
/*
 * @author Jack
 * @date 2023/1/2
 * */

import com.yao.model.User;
import com.yao.utils.JwtToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.message.AuthException;
import java.util.HashMap;
import java.util.logging.Logger;

@Slf4j
@RestController
@RequestMapping("/login")
public class LoginController {
    @PostMapping
    public ResponseEntity<?> login(@RequestBody User user){
        JwtToken jwtToken = new JwtToken();
        String token = jwtToken.generateToken(user);
        return ResponseEntity.status(HttpStatus.OK).body(token);
    }

    @GetMapping("/checktoken")
    public ResponseEntity<?> checkJWT(@RequestHeader String token) {
        Boolean result = true;
        JwtToken jwtToken = new JwtToken();
        try {
            jwtToken.validateToken(token);
        } catch (AuthException e) {
            result = false;
            log.error("", e);
            return ResponseEntity.status(HttpStatus.OK).body(result);
        }
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
