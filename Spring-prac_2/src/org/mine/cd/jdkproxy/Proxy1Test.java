package org.mine.cd.jdkproxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class Proxy1Test {

	@Autowired
	private TransactionManagerHandler handler;

	@Autowired
	
	@Test
	public void testSave() throws Exception {
		IEmployeeService service = (IEmployeeService) handler.getProxyObject();
//		System.out.println(service);
		service.save();
	}
}
