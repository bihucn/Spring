package org.mine.cd.jdkproxy2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//注册过程的模拟
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class JdkProxyTest {

	@Autowired
	private TransactionManagerHandler handler;
	@Test
	public void testSave() throws Exception {
		IEmployeeService proxyObject = (IEmployeeService) handler.getProxyObject();
		//com.sun.proxy.$Proxy10
		System.out.println(proxyObject.getClass());//获取真实类型
		
		proxyObject.save();
	}

	@Test
	public void testUpdate() throws Exception {
		//IEmployeeService proxyObject = (IEmployeeService) new TransactionManagerHandler(target, txManager).getProxyObject();
		//proxyObject.update();
	}
}
