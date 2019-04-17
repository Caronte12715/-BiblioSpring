package com.BiblioSpring.controllers;

import java.util.Map;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;

@EnableCaching
public class CacheController {
	
	private CacheManager cacheManager;
	
	public Map<Object, Object> getCacheContent(){
		ConcurrentMapCacheManager cacheMgr = (ConcurrentMapCacheManager) cacheManager;
		ConcurrentMapCache cache = (ConcurrentMapCache) cacheMgr.getCache("BiblioSpring");
		return cache.getNativeCache();
	}
}
