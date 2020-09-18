package com.sxt.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler{
	private Object target;
	/**
	 * proxy是代理类
	 * method是代理类的调用处理程序 是方法对象
	 */
	public void setTarget(Object target) {
		this.target = target;
	}
	/**
	 * 生成代理类
	 */
	public Object getProxy() {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	} 
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (args==null) {
			log(method.getName(),null);
		}
		else {
			log(method.getName(),args);
		}
		
		Object result = method.invoke(target, args);
		return result;
	}
	
	public void log(String methodName,Object[] args) {
		System.out.println("正则执行"+methodName+"方法");
		System.out.println("参数为：");
		if (args==null) {
			System.out.print("null");
			System.out.println();
		}
		else {
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i]);
			}
			System.out.println();
		}
		
	}

}
