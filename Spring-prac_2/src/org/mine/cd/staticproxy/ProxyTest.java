package org.mine.cd.staticproxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ProxyTest {

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private EmployeeServiceProxy proxy;
	
	@Test
	public void testSave() throws Exception {
		System.out.println(proxy);
		
		proxy.save();
	}
	@Test
	public void testUpdate() throws Exception {
//		proxy.update();
	}
}
