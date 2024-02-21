package com.sean.springboot;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Slf4j
@Component
public class JwtHelper {

    @Autowired
    private Algorithm algorithm;

    private Long expiration = 3600L;

    public String sign(String username) {
        Date expiresAt = Date.from(Instant.now().plusSeconds(this.expiration));
        String jti = UUID.randomUUID().toString();
        String sign = JWT.create()
                .withIssuer("gitee-cloud-ide")
                .withJWTId(jti)
                .withSubject(username)
                .withClaim("UID", 11)
                .withClaim("UTOKEN", 22)
                .withExpiresAt(expiresAt)
                .sign(algorithm);
        return sign;
    }

}
