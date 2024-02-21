package com.sean.springboot.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {

    @Bean
    public Algorithm algorithm()  {
        String secret = "123";
        return Algorithm.HMAC256(secret);
    }

    @Bean
    public JWTVerifier jwtVerifier() {
        return JWT.require(algorithm()).build();
    }

}
