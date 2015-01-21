package org.mine.cd.resource;

import javax.annotation.Resource;

public class SomeBean {

	@Resource(name="other12")
	private OtherBean1 other1;
	
	@Resource
	private OtherBean2 other2;

	@Override
	public String toString() {
		return "SomeBean [other1=" + other1 + ", other2=" + other2 + "]";
	}
	
	
	
}
