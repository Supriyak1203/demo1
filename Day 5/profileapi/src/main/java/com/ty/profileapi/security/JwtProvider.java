package com.ty.profileapi.security;


import java.security.Key;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtProvider {


    private final Key key;

    
    @Value("${jwt.expiration:3600000}")
    private long jwtExpirationInMs;

    public JwtProvider(@Value("${jwt.secret:}") String secret) {
        if (secret == null || secret.isEmpty()) {
            
            this.key = Keys.secretKeyFor(SignatureAlgorithm.HS512);
        } else {
            
            this.key = Keys.hmacShaKeyFor(secret.getBytes());
        }
    }

    
    public String generateToken(String username) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + jwtExpirationInMs);

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(key, SignatureAlgorithm.HS512)
                .compact();
    }


    public String getUsernameFromJwt(String token) {
        return parseClaims(token).getSubject();
    }

    
    public Date getExpiration(String token) {
        return parseClaims(token).getExpiration();
    }

    
    public boolean validateToken(String token) {
        try {
            parseClaims(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            
            System.err.println("JWT validation error: " + e.getMessage());
        }
        return false;
    }


    private Claims parseClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
}


