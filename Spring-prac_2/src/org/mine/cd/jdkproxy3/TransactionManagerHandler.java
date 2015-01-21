package org.mine.cd.jdkproxy3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionManagerHandler implements InvocationHandler {

	private TransactionManager txManager;

	private Object target;

	public Object getProxyObject() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		txManager.begin();
		Object ret = null;
		try {
			ret = method.invoke(target, args);
			txManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
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
