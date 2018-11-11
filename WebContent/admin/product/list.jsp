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
	function addProduct() {
		window.location.href = "${pageContext.request.contextPath}/flower/toAdd.html";
	}
</script>
</HEAD>
<body>
	<br>

	<table cellSpacing="1" cellPadding="0" width="100%" align="center"
		bgColor="#f5fafe" border="0">
		<TBODY>
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3"><strong>花卉列表</strong>
				</TD>
			</tr>
			<tr>

				<td class="ta_01" align="right">

					<form id="Form1" name="Form1"
						action="${pageContext.request.contextPath}/flower/flowerList.html"
						method="post">
						<table border="0" id="DataGrid1">
							<tr>
								<td align="center" bgColor="#f5fafe" class="">花卉名称：</td>
								<td><input type="text" name="flwName"
									value="${flower.flwName }" /></td>
								<td align="center" bgColor="#f5fafe" class="ta_01">花卉价格：</td>
								<td><input type="text" name="flwPrice"
									value="${flower.flwPrice }" /></td>
								<td align="center" bgColor="#f5fafe" class="ta_01">花卉数量：</td>
								<td><input type="text" name="flwNum"
									value="${flower.flwNum }" /></td>
								<td align="center" bgColor="#f5fafe" class="ta_01">花卉品种：</td>
								<td><select name="type.typeId">
										<option value="">全部</option>

										<c:forEach items="${typeList }" var="type">
											<c:if test="${flower.type.typeId == type.typeId }">
												<option selected="selected" value="${type.typeId }">${type.typeName }</option>
											</c:if>
											<c:if test="${flower.type.typeId != type.typeId }">
												<option value="${type.typeId }">${type.typeName }</option>
											</c:if>
										</c:forEach>
								</select></td>
								<td>
									<button type="submit">搜索</button>
								</td>
								<td><c:if test="${sessionScope.user.userFlag == 2 }">
										<button type="button" id="add" name="add" value="添加"
											class="button_add" onclick="addProduct()">
											&#28155;&#21152;</button>
									</c:if></td>


							</tr>
						</table>
					</form>
			</tr>
			<tr>
				<td class="ta_01" bgColor="#f5fafe">
					<form id="Form2" name="Form2"
						action="${pageContext.request.contextPath}/order/addOrderList.html"
						method="post">
						<table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
							<tr
								style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">
								<c:if test="${sessionScope.user.userFlag == 1 }">
									<td align="center" width="2%"></td>
								</c:if>
								<td align="center" width="24%">编号</td>
								<td align="center" width="17%">花卉名称</td>
								<td align="center" width="14%">花卉价格</td>
								<td align="center" width="17%">花卉类型</td>
								<td align="center" width="14%">花卉数量</td>
								<c:if test="${sessionScope.user.userFlag == 2 }">
									<td width="4.3%" align="center">编辑</td>
									<td width="4.3%" align="center">删除</td>
								</c:if>
								<c:if test="${sessionScope.user.userFlag == 1 }">
									<td width="4.3%" align="center">下单</td>
								</c:if>
							</tr>
							<c:forEach items="${flowerList }" var="flower" varStatus="index">
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<c:if test="${sessionScope.user.userFlag == 1 }">
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="2%"><input name="ids" type="checkbox"
											value="${flower.flwId }" /></td>
									</c:if>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="24%">${index.index+1 }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${flower.flwName }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="14%">${flower.flwPrice }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${flower.type.typeName }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="14%">${flower.flwNum }</td>
									<c:if test="${sessionScope.user.userFlag == 2 }">
										<td align="center" style="HEIGHT: 22px"><a
											href="${pageContext.request.contextPath }/flower/toEditFlower/${flower.flwId }.html">
												<img
												src="${pageContext.request.contextPath}/images/i_edit.gif"
												border="0" style="CURSOR: hand">
										</a></td>

										<td align="center" style="HEIGHT: 22px"><a
											href="${pageContext.request.contextPath }/flower/deleteFlower/${flower.flwId }.html">
												<img
												src="${pageContext.request.contextPath}/images/i_del.gif"
												width="16" height="16" border="0" style="CURSOR: hand">
										</a></td>
									</c:if>
									<c:if test="${sessionScope.user.userFlag == 1 }">
										<td align="center" style="HEIGHT: 22px"><a
											href="${pageContext.request.contextPath }/order/addOrder/${flower.flwId }.html">
												<img
												src="${pageContext.request.contextPath}/images/cart1.gif"
												width="16" height="16" border="0" style="CURSOR: hand">
										</a></td>
									</c:if>
								</tr>
							</c:forEach>
						</table>
						<c:if test="${sessionScope.user.userFlag == 1 }">
							<button type="submit">批量下单</button>
						</c:if>
					</form>
				</td>
			</tr>

		</TBODY>
	</table>

</body>
</HTML>

