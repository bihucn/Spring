package org.mine.cd.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Person {

	public Person() {
		System.out.println("构造器");
	}
	
	@PostConstruct
	public void init(){
		System.out.println("初始化");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("销毁");
	}
}
