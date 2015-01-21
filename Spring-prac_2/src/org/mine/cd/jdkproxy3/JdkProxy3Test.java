package org.mine.cd.jdkproxy3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//注册过程的模拟
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class JdkProxy3Test {

	@Autowired
	private TransactionManagerHandler handler;
	@Test
	public void testSave() throws Exception {
		IEmployeeService service = (IEmployeeService) handler.getProxyObject();
		System.out.println(service);
		System.out.println(service.getClass());
		service.save();
	}

	@Test
	public void testUpdate() throws Exception {
		//IEmployeeService proxyObject = (IEmployeeService) new TransactionManagerHandler(target, txManager).getProxyObject();
		//proxyObject.update();
	}
}
