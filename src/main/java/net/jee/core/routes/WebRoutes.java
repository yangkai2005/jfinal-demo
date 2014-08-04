package net.jee.core.routes;

import com.jfinal.config.Routes;

/**
 * 
 * 前端路由，不需要经过任何拦截。
 * 
 * @version 1.0
 * @created 2014年8月3日
 * @author yangkai_2005@163.com
 */
public class WebRoutes extends Routes {

	@Override
	public void config() {
//		this.add("/", com.innfee.app.controller.IndexController.class, "/WEB-INF/pages/");
	}

}
