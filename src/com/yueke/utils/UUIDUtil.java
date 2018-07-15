package com.yueke.utils;

import java.util.UUID;

/**
 * UUID
 * @author luck_nhb
 */
public class UUIDUtil {
	/**
	 * 随机生成id
	 * @return
	 */
	public static String getId(){
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}
	
	/**
	 * 生成随机码
	 * @return
	 */
	public static String getCode(){
		return getId();
	}
	
}
