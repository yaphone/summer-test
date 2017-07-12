package cn.zhouyafeng.summer.framework.proxy;

import java.lang.reflect.Method;
import java.util.List;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 代理管理器
 * 
 * @author https://github.com/yaphone
 * @date 创建时间：2017年7月12日 下午10:54:54
 * @version 1.0
 *
 */
public class ProxyManager {

	@SuppressWarnings("unchecked")
	public static <T> T createProxy(final Class<?> targetClass, final List<Proxy> proxyList) {
		return (T) Enhancer.create(targetClass, new MethodInterceptor() {

			@Override
			public Object intercept(Object targetObject, Method targetMethod, Object[] methodParams,
					MethodProxy methodProxy) throws Throwable {
				return new ProxyChain(targetClass, targetObject, targetMethod, methodProxy, methodParams, proxyList);
			}
		});
	}
}
