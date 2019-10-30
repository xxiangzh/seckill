package com.xzh.seckill.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * redis服务
 *
 * @author 向振华
 * @date 2019/10/30 10:39
 */
@Service
public class RedisService {

    @Resource
    private RedisTemplate redisTemplate;

    /**
     * 获取缓存
     *
     * @param key   key
     * @param clazz 类型
     * @param <T>
     * @return
     */
    public <T> T get(String key, Class<T> clazz) {
        return (T) redisTemplate.opsForValue().get(key);
    }

    /**
     * 存储值
     *
     * @param key
     * @param value
     */
    public void set(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * 存储带有有效期的值
     *
     * @param key
     * @param value
     * @param time  秒
     */
    public void set(String key, Object value, Long time) {
        redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
    }

    /**
     * 删除
     *
     * @param key
     */
    public void delete(String key) {
        redisTemplate.delete(key);
    }

    /**
     * 批量删除
     *
     * @param keys
     */
    public void delete(Collection keys) {
        redisTemplate.delete(keys);
    }

    /**
     * 是否存在key
     *
     * @param key
     * @return
     */
    public Boolean exists(String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 修改key的value
     *
     * @param key
     * @param value
     * @param <V>
     * @return
     */
    public <V> V update(String key, Object value) {
        Long time = this.getExpire(key);
        V v = (V) redisTemplate.opsForValue().getAndSet(key, value);
        setExpire(key, time);
        return v;
    }

    /**
     * 查询key的有效期
     *
     * @param key
     * @return 秒
     */
    public Long getExpire(String key) {
        return redisTemplate.getExpire(key);
    }

    /**
     * 设置key的有效期
     *
     * @param key
     * @param time
     * @return
     */
    public Boolean setExpire(String key, Long time) {
        return redisTemplate.expire(key, time, TimeUnit.SECONDS);
    }

    /**
     * 查询所有的key
     *
     * @param key
     * @return
     */
    public Set<String> getKeys(String key) {
        return redisTemplate.keys(key);
    }
}
