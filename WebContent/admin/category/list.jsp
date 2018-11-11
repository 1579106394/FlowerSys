<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/Style1.css"
	rel="stylesheet" type="text/css" />
<script language="javascript"
	src="${pageContext.request.contextPath}/js/public.js"></script>
<script type="text/javascript">
	function addCategory() {
		window.location.href = "${pageContext.request.contextPath}/admin/category/add.jsp";
	}
</script>
</HEAD>
<body>
	<br>
	<table cellSpacing="1" cellPadding="0" width="100%" align="center"
		bgColor="#f5fafe" border="0">
		<TBODY>
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3"><strong>分类列表</strong>
				</TD>
			</tr>
			<tr>
				<td class="ta_01" align="right"><c:if
						test="${sessionScope.user.userFlag == 2 }">
						<button type="button" id="add" name="add" value="添加"
							class="button_add" onclick="addCategory()">
							&#28155;&#21152;</button>
					</c:if></td>
			</tr>
			<tr>
				<td class="ta_01" align="center" bgColor="#f5fafe">
					<table cellspacing="0" cellpadding="1" rules="all"
						bordercolor="gray" border="1" id="DataGrid1"
						style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
						<tr
							style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

							<td align="center" width="18%">编号</td>
							<td align="center" width="17%">品种名称</td>
							<td align="center" width="17%">数量</td>
							<c:if test="${sessionScope.user.userFlag == 2 }">
								<td width="7%" align="center">编辑</td>
								<td width="7%" align="center">删除</td>
							</c:if>
						</tr>
							<c:forEach items="${typeList }" var="type" varStatus="index">
						<tr onmouseover="this.style.backgroundColor = 'white'"
							onmouseout="this.style.backgroundColor = '#F5FAFE';">
								<td style="CURSOR: hand; HEIGHT: 22px" align="center"
									width="18%">${index.index+1 }</td>
								<td style="CURSOR: hand; HEIGHT: 22px" align="center"
									width="17%">${type.typeName }</td>
								<td style="CURSOR: hand; HEIGHT: 22px" align="center"
									width="17%">${type.typeNum }</td>

								<c:if test="${sessionScope.user.userFlag == 2 }">
									<td align="center" style="HEIGHT: 22px"><a
										href="${ pageContext.request.contextPath }/type/toEditType/${type.typeId }.html">
											<img
											src="${pageContext.request.contextPath}/images/i_edit.gif"
											border="0" style="CURSOR: hand">
									</a></td>

									<td align="center" style="HEIGHT: 22px"><a href="${pageContext.request.contextPath }/type/deleteType/${type.typeId}.html"> <img
											src="${pageContext.request.contextPath}/images/i_del.gif"
											width="16" height="16" border="0" style="CURSOR: hand">
									</a></td>
								</c:if>
						</tr>
							</c:forEach>
					</table>
				</td>
			</tr>
		</TBODY>
	</table>
</body>
</HTML>

