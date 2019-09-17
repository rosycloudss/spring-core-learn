package com.lw.bean;

import org.springframework.stereotype.Component;

/**
 * @author liwei-4
 * @description:
 * @date 2019-09-16
 */
@Component
public class User {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
