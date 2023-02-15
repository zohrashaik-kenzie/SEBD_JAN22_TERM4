package week28;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPooled;
import redis.clients.jedis.util.Pool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JedisDemo {

    public static void main(String args[]) {
     //   JedisPool pool = new JedisPool("localhost", 6379);
//        try (Jedis jedis = pool.getResource()) {
//            jedis.set("clientName", "Jedis");
//            String cachedClient = jedis.get("clientName");
//            System.out.println("Cached Client = " + cachedClient);
//        }

        JedisPooled jedis = new JedisPooled("localhost", 6379);
        jedis.sadd("planets", "Venus");
        String cachedPlanet = jedis.spop("planets");
        System.out.println("Cached Planet = " + cachedPlanet);
////
        //lists
        jedis.lpush("queue#tasks", "firstTask");
        jedis.lpush("queue#tasks", "secondTask");

        String task1 = jedis.rpop("queue#tasks");
        System.out.println("task = " + task1);

        String task2 = jedis.rpop("queue#tasks");
        System.out.println("task = " + task2);
////
//        //sets
        jedis.sadd("nicknames", "nickname#1");
        jedis.sadd("nicknames", "nickname#2");
        jedis.sadd("nicknames", "nickname#1");

        Set<String> nicknames = jedis.smembers("nicknames");
        System.out.println("nicknames = " + nicknames);
        boolean exists = jedis.sismember("nicknames", "nickname#1");
       System.out.println("nickname#1 exists = " + exists);
////
        //hashes
        jedis.hset("user#1", "name", "Jacobus");
        jedis.hset("user#1", "job", "Facilitator");
        jedis.hset("user#1", "term", "4");

        String name = jedis.hget("user#1", "name");
        System.out.println("Name = " + name);
        Map<String, String> fields = jedis.hgetAll("user#1");
        String job = fields.get("job");
        System.out.println("job = " + job);
        String term = fields.get("term");
        System.out.println("Term = " + term);
//////term
//        //sorted sets
        Map<String, Double> scores = new HashMap<>();

        scores.put("PlayerOne", 3000.0);
        scores.put("PlayerTwo", 1500.0);
        scores.put("PlayerThree", 8200.0);

        scores.entrySet().forEach(playerScore -> {
            jedis.zadd("ranking", playerScore.getValue(), playerScore.getKey());
        });

        String player = jedis.zrevrange("ranking", 1, 2).iterator().next();
        long rank = jedis.zrevrank("ranking", player);
        System.out.println("Player = " + player);
        System.out.println("Ranking = " + rank);

    }
}


