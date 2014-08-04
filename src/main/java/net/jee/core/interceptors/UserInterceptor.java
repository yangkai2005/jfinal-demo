
package net.jee.core.interceptors;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;

/**
 * 会员身份拦截器。
 * @version 1.0
 * @created 2014年8月3日
 * @author yangkai_2005@163.com
 */
public class UserInterceptor implements Interceptor {

	@Override
	public void intercept(ActionInvocation ai) {
		// TODO Auto-generated method stub
		ai.invoke();
		
	}

}
