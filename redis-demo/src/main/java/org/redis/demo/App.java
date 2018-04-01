package org.redis.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    private final static Logger logger = LoggerFactory.getLogger(App.class);
    
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Jedis jedis = new Jedis("47.95.3.38");
        jedis.auth("redis");
        logger.info("连接成功");
        //查看服务是否运行
        logger.warn("服务正在运行:{}",jedis.ping());
//        jedis.set("hostName", "ubuntuAliyun");
//        System.out.println(jedis.get("hostName"));
        jedis.del("hostName");
        System.out.println();
        logger.info(jedis.get("hostName"));
        jedis.close();
    }
}
