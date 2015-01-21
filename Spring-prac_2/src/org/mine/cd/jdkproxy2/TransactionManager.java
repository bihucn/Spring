package org.mine.cd.jdkproxy2;

//事务管理器:包括了事务的基本操作,增强代码
public class TransactionManager {
	public void beginTransaction() {
		System.out.println("开启事务");
	}
	public void commit() {
		System.out.println("提交事务");
	}
	public void rollback() {
		System.out.println("回滚事务");
	}
}
