<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>后台管理</title>
<%@ include file="/WEB-INF/pages/inc/res.jsp"%>
<link rel="stylesheet" type="text/css" href="${ctx}/css/admin.css"/>
<script type="text/javascript" src="${ctx}/js/admin.js"></script>
<script type="text/javascript">
var _menus = {
	basic : [ {
		"menuid" : "20",
		"icon" : "icon-sys",
		"menuname" : "系统管理",
		"menus" : [ {
			"menuid" : "211",
			"menuname" : "注册用户管理",
			"icon" : "icon-nav",
			"url" : "${ctx}/member"
		}  , {
			"menuid" : "112",
			"menuname" : "角色管理",
			"icon" : "icon-nav",
			"url" : "${ctx}/admin/role"
		}  , {
			"menuid" : "212",
			"menuname" : "权限管理",
			"icon" : "icon-nav",
			"url" : "${ctx}/admin/resource"
		}
		]
	} ]
};
</script>
</head>
<body class="easyui-layout">
	<div data-options="region:'north'" style="height: 50px"></div>
	<div data-options="region:'south',split:true" style="height: 50px;"></div>
	<div data-options="region:'west',split:true" title="导航菜单" style="width: 250px;">
      		<div id="wnav" fit="true" class="easyui-accordion" border="false">
      			<!-- 导航内容 -->
      		</div>
	</div>
	<div data-options="region:'center'">
		<div id="center" class="easyui-tabs" data-options="fit:true,border:false,plain:true">
			<div title="首页" data-options="href:'_welcome.html'" style="padding: 10px"></div>
			<div title="DataGrid" style="padding: 5px">
				<table class="easyui-datagrid" data-options="url:'datagrid_data1.json',method:'get',singleSelect:true,fit:true,fitColumns:true">
					<thead>
						<tr>
							<th data-options="field:'itemid'" width="80">Item ID</th>
							<th data-options="field:'productid'" width="100">Product ID</th>
							<th data-options="field:'listprice',align:'right'" width="80">List Price</th>
							<th data-options="field:'unitcost',align:'right'" width="80">Unit Cost</th>
							<th data-options="field:'attr1'" width="150">Attribute</th>
							<th data-options="field:'status',align:'center'" width="50">Status</th>
						</tr>
					</thead>
				</table>
			</div>
		</div>
	</div>
</body>
</html>