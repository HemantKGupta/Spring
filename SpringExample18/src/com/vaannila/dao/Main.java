package com.vaannila.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaannila.domain.Forum;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ForumDAO forumDAO = (ForumDAO) context.getBean("forumDAO");
		Forum springForum = new Forum(1,"Spring Forum", "Discuss everything related to Spring");
		forumDAO.insertForum(springForum);		
		System.out.println(forumDAO.selectForum(1));
		ForumDAO anForumDAO = (ForumDAO) context.getBean("jdbcForumDAO");
		Forum anSpringForum = new Forum(2,"Another Spring Forum", "Discuss everything related to Spring");
		anForumDAO.insertForum(anSpringForum);		
		System.out.println(anForumDAO.selectForum(2));
		
	}
	
}
