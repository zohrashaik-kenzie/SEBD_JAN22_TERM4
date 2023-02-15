package week28;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class InvalidateJedisDemo {
    public static void main(String[] args){
        JedisPool pool = new JedisPool("localhost", 6379);
        try (Jedis jedis = pool.getResource()) {
            jedis.set("clientName", "Jedis");
            String cachedClient = jedis.get("clientName");
            System.out.println("Cached Client = " + cachedClient);
        }
        try (Jedis jedis = pool.getResource()) {
            jedis.del("clientName");
            String cachedClient = jedis.get("clientName");
            System.out.println("Cached Client = " + cachedClient);
        }
    }
}
