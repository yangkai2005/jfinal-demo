package net.jee.core.interceptors;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;

/**
 * 后台管理拦截器。
 * 
 * @author kai
 *
 */
public class AdminInterceptor implements Interceptor {

	@Override
	public void intercept(ActionInvocation ai) {
		// TODO Auto-generated method stub
		ai.invoke();
	}

}
