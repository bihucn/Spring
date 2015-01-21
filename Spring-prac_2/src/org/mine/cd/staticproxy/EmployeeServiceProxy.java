package org.mine.cd.staticproxy;

import org.springframework.beans.factory.annotation.Autowired;


//IEmployeeService的代理类
public class EmployeeServiceProxy implements IEmployeeService {

	@Autowired
	private IEmployeeService target;
	@Autowired
	private TransactionManager tm;
	
	
//	public void setTarget(IEmployeeService target) {
//		this.target = target;
//	}
//	public void setTransactionManager(TransactionManager transactionManager) {
//		this.transactionManager = transactionManager;
//	}
	public void save() {
		
		try {
			System.out.println(tm);
			tm.beginTransaction();
//			target.save();
			tm.commit();
		} catch (Exception e) {
//			tm.rollback();
		}
		
	}

	public void update() {
		
//		try {
//			transactionManager.beginTransaction();
////			target.update();
//			transactionManager.commit();
//
//		} catch (Exception e) {
//
//			transactionManager.rollback();
//		} finally {
//
//		}
//		
	}

}
