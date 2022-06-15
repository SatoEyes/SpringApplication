package com.example.BulletinBoard.domain.Entity;

import java.io.Serializable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 掲示板情報
 * @author sato.hitomi
 *
 */
@Configuration
public class BBS implements Serializable {
	private static final long serialVersionUID = 1L;
	

	private int id;
	private String createDate;
	private String title;
	private String content;
	private String createUser;
	
	@Bean
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Bean
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	@Bean
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Bean
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Bean
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
}
