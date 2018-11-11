<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<HTML>
	<HEAD>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="${pageContext.request.contextPath}/css/Style1.css" rel="stylesheet" type="text/css" />
		<script language="javascript" src="${pageContext.request.contextPath}/js/public.js"></script>
		

	</HEAD>
	<body>
	
		<form id="Form1" name="Form1" action="${pageContext.request.contextPath}/user/list.jsp" method="post">
			<table cellSpacing="1" cellPadding="0" width="100%" align="center" bgColor="#f5fafe" border="0">
				<TBODY>
					<tr>
						<td class="ta_01" align="center" bgColor="#afd1f3">
							<strong>订单列表</strong>
						</TD>
					</tr>
					
					<tr>
						<td class="ta_01" align="center" bgColor="#f5fafe">
							<table cellspacing="0" cellpadding="1" rules="all"
								bordercolor="gray" border="1" id="DataGrid1"
								style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
								<tr
									style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

									<td align="center" width="25%">
										订单编号
									</td>
									<td align="center" width="15%">
										订单金额
									</td>
									<td align="center" width="15%">
										所属用户
									</td>
									<td align="center" width="25%">
										创建时间
									</td>
									<td align="center" width="10%">
										花卉列表
									</td>
									<td align="center" width="10%">
										删除订单
									</td>
								</tr>
								
								<c:forEach items="${orderList }" var="order" varStatus="index">
								
									<tr onmouseover="this.style.backgroundColor = 'white'"
										onmouseout="this.style.backgroundColor = '#F5FAFE';">
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="25%">
											${index.index+1 }
										</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="15%">
											${order.orderPrice } 元
										</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="15%">
											${order.user.username }
										</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="25%">
											${order.orderCreatedTime }
										</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="10%">
											<a class="clickedElement" href="${pageContext.request.contextPath }/order/getFlowerList/${order.orderId }.html">
												<img
												src="${pageContext.request.contextPath}/images/i_edit.gif"
												border="0" style="CURSOR: hand">
											</a>
										</td>
										<td align="center" style="HEIGHT: 22px">
											<a href="${pageContext.request.contextPath }/order/deleteOrder/${order.orderId }.html">
												<img
												src="${pageContext.request.contextPath}/images/i_del.gif"
												width="16" height="16" border="0" style="CURSOR: hand">
										</a>
										</td>
						
									</tr>
								
								</c:forEach>
								
								
								
							</table>
						</td>
					</tr>
					
				</TBODY>
			</table>
		</form>

	</body>
</HTML>

