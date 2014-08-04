package net.jee.core;

import net.jee.core.interceptors.AdminInterceptor;
import net.jee.core.interceptors.UserInterceptor;
import net.jee.core.routes.AdminRoutes;
import net.jee.core.routes.UserRoutes;
import net.jee.core.routes.WebRoutes;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

/**
 * 
 * API引导式配置。配置整个应用。
 * 
 * @version 1.0
 * @created 2014年8月3日
 * @author yangkai_2005@163.com
 */
public class ApplicationConfig extends JFinalConfig {
	
	/**
	 * 配置常量
	 */
	public void configConstant(Constants constants) {
		// 加载少量必要配置，随后可用getProperty(...)获取值
		loadPropertyFile("jdbc.properties");
		constants.setViewType(ViewType.JSP);
		constants.setDevMode(getPropertyToBoolean("devMode", false));
	}
	
	/**
	 * 配置路由
	 */
	public void configRoute(Routes routes) {
		routes.add(new WebRoutes()); // 前端路由
		routes.add(new AdminRoutes()); // 后台路由
		routes.add(new UserRoutes()); // 会员路由
	}
	
	/**
	 * 配置插件
	 */
	public void configPlugin(Plugins plugins) {
		// 配置C3p0数据库连接池插件
		C3p0Plugin c3p0Plugin = new C3p0Plugin(getProperty("jdbc.url"),
				getProperty("jdbc.username"), 
				getProperty("jdbc.password"));
		plugins.add(c3p0Plugin);
		
		// 配置ActiveRecord插件
		ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
		plugins.add(arp);
		
//		arp.addMapping("resource", Resource.class);	// 映射resource 表到 Resource模型
	}
	
	/**
	 * 配置全局拦截器
	 */
	public void configInterceptor(Interceptors interceptors) {
		interceptors.add(new UserInterceptor());
		interceptors.add(new AdminInterceptor());
	}
	
	/**
	 * 配置处理器
	 */
	public void configHandler(Handlers handlers) {
	}
	

}
