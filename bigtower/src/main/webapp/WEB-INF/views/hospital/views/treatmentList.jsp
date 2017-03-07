<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>진료 대기자 목록</h1>
	<table border="1">
		<thead>
			<tr>
			<th>환자명</th>
			<th>진료과</th>
			<th>의사명</th>
			<th>접수일</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="treat" items="${treatList}">
			<tr>
				
					<td><a href="<c:url value='/hospital/treatView?hoTreatmentCode=${treat.hoTreatmentCode}'/>">${treat.hoPatientName }</a></td>
					<td>${treat.hoTreatSubjectName }</td>
					<td>${treat.hoDoctorName }</td>			
					<td>${treat.hoTreatmentWriteDate }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="<c:url value='/hospital/receiveList'/>">접수 현황</a>
	<a href="<c:url value='/hospital/acceptanceList'/>">수납 현황</a>
	<a href="<c:url value='/hospital/operationList'/>">수술 목록</a>
	<a href="<c:url value='/hospital/test'/>">검사</a>
</body>
</html>