package org.mine.cd.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TransactionManager {

	
	public void begin(JoinPoint jp){
		
		System.out.println(jp.getThis().getClass());//代理对象
		System.out.println(jp.getSignature());//获取方法签名
		System.out.println(jp.getArgs());//当前方法的参数:new Object[]{}
		System.out.println("开启事务");
	}
	
	public void commit(){
		System.out.println("提交事务");
	}
	
	public void rollback(){
		System.out.println("回滚事务");
	}
	
	public Object allWork(ProceedingJoinPoint pjp){
		
		Object ret = null;
		begin(pjp);
		try {
			ret = pjp.proceed();
			commit();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			rollback();
		} 		
		return ret;
	}
}
