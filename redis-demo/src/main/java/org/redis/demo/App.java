package org.redis.demo;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Jedis jedis = new Jedis("47.95.3.38");
        System.out.println("连接成功");
        jedis.auth("redis");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
//        jedis.set("hostName", "ubuntuAliyun");
//        System.out.println(jedis.get("hostName"));
        jedis.del("hostName");
        System.out.println(jedis.get("hostName"));
        jedis.close();
    }
}
