package com.neo.cache;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisClient {
	private static JedisPool pool;
    private static String host = "192.168.152.128";
    private static int port = 6379;
    private static int timeout = 60 * 1000;

    private static int maxActive = 100;
    private static int maxIdle = 20;
    private static long maxWait = 1000000;

    public static final int EXPIRE_TIME = 86400;

    private static org.slf4j.Logger logger_ = org.slf4j.LoggerFactory
            .getLogger(RedisClient.class.getName());

    public static void initPool() {
        logger_.info("Init Redis Pool [{}]:[{}]", host, port);
        JedisPoolConfig config = new JedisPoolConfig();
        //config.setMaxActive(maxActive);
        config.setMaxTotal(maxActive);
        config.setMaxIdle(maxIdle);
        //config.setMaxWait(maxWait);
        config.setMaxWaitMillis(maxWait);
        config.setTestOnBorrow(false);
        pool = new JedisPool(config, host, port, timeout);// 线程数量限制，IP地址，端口，超时时间
    }

    public static Jedis getJedis() {
        if (pool == null)
            initPool();
        return pool.getResource();
    }
    
    public static void returnJedis(Jedis jedis) {
        if (jedis != null)
            pool.returnResource(jedis);
    }
    
    public static void main(String[] args) {
    	Jedis jedis = RedisClient.getJedis();
    	System.out.println(jedis);
	}
}
