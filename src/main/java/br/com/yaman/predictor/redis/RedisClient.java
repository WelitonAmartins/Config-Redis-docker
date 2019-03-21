package br.com.yaman.predictor.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

public class RedisClient {
	
	
	private static final  String valorToken = "eyJhbGciOiJIUzUxMiJ9eyJzdWIiOiIxIiwibG9naW4iOiJhZG1pbiIsImxpc3RhTm9tZVBlcmZpbCI6WyJBRE1JTklTVFJBRE9SIl0sImV4cCI6MTU0MzQwODY0NH0B3L92JKpUMYjNFeK7qWxQ3FZhgV63bm3VLG9ei2M41UwHqaEdw2OQ2sU5zsFR05P9GHv_LWcPbgprA1kUNrl0w";
	
	public static void main(String[] args) {

		JedisShardInfo sharInfo = new JedisShardInfo("192.168.153.130", 6379);
//		sharInfo.setPassword(); - chave de acesso do azure ou aws e etc ..
		Jedis jedis = new Jedis(sharInfo);
		jedis.set("token", valorToken);		
		jedis.expire("token", 60);
		String valor = jedis.get("token");
		System.out.println(valor);
		
	}
}
