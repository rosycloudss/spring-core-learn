package com.lw.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author liwei-4
 * @description:
 * @date 2019-09-16
 */
public class Student {
	@Value("1112121")
	private String stuno;
	@Value("李伟")
	private String name;

	public String getStuno() {
		return stuno;
	}

	public void setStuno(String stuno) {
		this.stuno = stuno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
