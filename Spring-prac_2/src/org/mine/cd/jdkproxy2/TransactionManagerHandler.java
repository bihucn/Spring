package org.mine.cd.jdkproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//事务增强的处理器
public class TransactionManagerHandler implements InvocationHandler {
	private Object target;//真实对象(EmployeeServiceImpl)
	private TransactionManager txManager;//需要增加的代码
	
	//创建代理对象
	public Object getProxyObject() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target
				.getClass().getInterfaces(), this);
	}
	//方法职责：负责集中处理动态代理类上的所有方法调用
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		txManager.beginTransaction();
		Object ret = null;//底层真实方法的返回结果
		try {
			//具体的操作
			ret = method.invoke(target, args);
			txManager.commit();
		} catch (Exception e) {
			txManager.rollback();
		}
		return ret;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	public void setTxManager(TransactionManager txManager) {
		this.txManager = txManager;
	}
	
}
