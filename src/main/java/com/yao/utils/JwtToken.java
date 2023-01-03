package com.yao.utils;
/*
 * @author Jack
 * @date 2023/1/2
 * */

import com.yao.model.User;
import io.jsonwebtoken.*;

import javax.security.auth.message.AuthException;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtToken implements Serializable {
    private static final long EXPIRATION_TIME = 1 * 3600 * 1000;
    private static final String SECRET = "learntodanceintherainyyyyyyyyy";

    public String generateToken(User user){
        Map<String, Object> claims = new HashMap<>();
        claims.put("user", user);

        return Jwts.builder()
                .setClaims(claims)
//                .setExpiration(new Date(Instant.now().toEpochMilli() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
    }

    public void validateToken(String token) throws AuthException{
        try {
            Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token);
        }catch (SignatureException e){
            throw new AuthException("Invalid JWT signature.");
        }
        catch (MalformedJwtException e) {
            throw new AuthException("Invalid JWT token.");
        }
        catch (ExpiredJwtException e) {
            throw new AuthException("Expired JWT token");
        }
        catch (UnsupportedJwtException e) {
            throw new AuthException("Unsupported JWT token");
        }
        catch (IllegalArgumentException e) {
            throw new AuthException("JWT token compact of handler are invalid");
        }
    }
}