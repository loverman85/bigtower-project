<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>혈액검사 결과조회</h1>
	<!-- BloodTestResult를 출력 -->
	<form action="<c:url value='/government/getOneBloodTestResultByTreatCode'/>" method="post">
		진료코드로 조회
		<input type="text" name="treatCode"/>
		<input type="submit" value="조회"/>
	</form>
	<br/>
	
	<!-- listBloodTestResult를 출력 -->
	<form action="<c:url value='/government/getListBloodTestResultByCitizenId'/>" method="post">
		주민번호로 조회
		<input type="text" name="citizenId"/>
		<input type="submit" value="조회"/>
	</form>
	
	<form action="<c:url value='/government/getListBloodTestResultByDoctorId'/>" method="post">
		의사코드로 조회(추후 세션에서 받아서 요청처리하도록 변경할예정)
		<input type="text" name="doctorId"/>
		<input type="submit" value="조회"/>
	</form>
</body>
</html>