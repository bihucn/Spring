package org.mine.cd.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SomeBean {

	
	private OtherBean1 other11;
	
	@Autowired
	private OtherBean2 other2;

	@Autowired
	public void setOther11(OtherBean1 other11) {
		this.other11 = other11;
	}
	@Override
	public String toString() {
		return "SomeBean [other1=" + other11 + ", other2=" + other2 + "]";
	}
	
	
	
}
