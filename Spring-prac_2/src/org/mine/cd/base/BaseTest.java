package org.mine.cd.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class BaseTest {

	@Autowired
	private ApplicationContext ctx;
	
	@Test
	public void test() throws Exception {
		
//		ctx.getBean("employeeDao",EmployeeDao.class).save();
		
		EmployeeDao dao = new EmployeeDao();
		dao.setConn("heddd");
		dao.save();
	}
}
