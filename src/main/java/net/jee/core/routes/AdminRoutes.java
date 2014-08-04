package net.jee.core.routes;

import com.jfinal.config.Routes;

/**
 * 
 * 后台管理路由配置。
 * 
 * @version 1.0
 * @created 2014年8月3日
 * @author yangkai_2005@163.com
 */
public class AdminRoutes extends Routes {

	@Override
	public void config() {
		this.add("/admin", net.jee.app.controller.admin.IndexController.class, "/WEB-INF/pages/admin");
	}

}
