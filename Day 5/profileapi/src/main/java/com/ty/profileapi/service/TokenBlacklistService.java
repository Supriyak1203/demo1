package com.ty.profileapi.service;

import java.util.concurrent.TimeUnit;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class TokenBlacklistService {
    private final RedisTemplate<String, Object> redisTemplate;
    public TokenBlacklistService(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void blacklistToken(String token, long ttlSeconds) {
        redisTemplate.opsForValue().set("bl_" + token, "blacklisted", ttlSeconds, TimeUnit.SECONDS);
    }

    public boolean isBlacklisted(String token) {
        return Boolean.TRUE.equals(redisTemplate.hasKey("bl_" + token));
    }
}
