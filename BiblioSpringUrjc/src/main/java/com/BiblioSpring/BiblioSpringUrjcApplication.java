package com.BiblioSpring;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
//import com.hazelcast.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.session.hazelcast.config.annotation.web.http.EnableHazelcastHttpSession;

import com.hazelcast.config.Config;
import com.hazelcast.config.JoinConfig;

@SpringBootApplication
@EnableHazelcastHttpSession
@EnableCaching
public class BiblioSpringUrjcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiblioSpringUrjcApplication.class, args);
	}
	
	@Bean
	public Config config() {
		Config config = new Config();
		
		JoinConfig joinConfig = config.getNetworkConfig().getJoin();
		joinConfig.getMulticastConfig().setEnabled(false);
		joinConfig.getTcpIpConfig().setEnabled(true).setMembers(Collections.singletonList("127.0.0.1"));
		return config;
	}
	
	@Bean
	public CacheManager cacheManager() {
		 System.out.println("Activating cache..."); //habrá que meterlo en un archivo Log
		 return new ConcurrentMapCacheManager("BiblioSpring");
	}
}