package br.com.yaman.predictor.redis;

import redis.clients.jedis.Jedis;

public class RedisClient {
	
	
	private static final  String valorToken = "eyJhbGciOiJIUzUxMiJ9eyJzdWIiOiIxIiwibG9naW4iOiJhZG1pbiIsImxpc3RhTm9tZVBlcmZpbCI6WyJBRE1JTklTVFJBRE9SIl0sImV4cCI6MTU0MzQwODY0NH0B3L92JKpUMYjNFeK7qWxQ3FZhgV63bm3VLG9ei2M41UwHqaEdw2OQ2sU5zsFR05P9GHv_LWcPbgprA1kUNrl0w";
	
	public static void main(String[] args) {
		
		Jedis jedis = new Jedis("192.168.153.130", 6379);
		jedis.set("token", valorToken);		
		jedis.expire("token", 60);
		String value = jedis.get("token");
		System.out.println(value);
		
	}
}
