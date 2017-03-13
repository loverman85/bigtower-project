<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/hospital/views/module/top.jsp" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
</head>
<script>
	$( document ).ready(function() {
		$("#hoReceivePurpose").focus();
		
		$("#submitBtn").click(function(){
			if($("#hoReceivePurpose").val()===""){
				alert("접수목적을 입력해주세요");
				$("#hoReceivePurpose").focus();
				return;
			}
			if($("#hoTreatSubjectCode option:selected").val()===""){
				alert("진료과목을 선택해주세요");
				return;
			}
			$("#receiveForm").submit();
		});
	});
</script>

	<h1>receive.jsp</h1>
	<h2>환자접수</h2>
	주민번호
	<input id="hoCitizenIdSearch" type="text" value="${hoCitizenId}" placeholder="주민번호" readonly="readonly">
	<form id="receiveForm" action="<c:url value="/hospital/receive"/>" method="post">	
		<input id="hoCitizenId" type="hidden" name="hoCitizenId" value="${hoCitizenId}">	
		<input id="hoPatientCode" type="hidden" name="hoPatientCode" value="${hoPatientCode}">
		<div>
			병원코드 : 
			<input id="hoHospitalCode" type="text" name="hoHospitalCode" value="${HOSPITALCODE}" readonly="readonly">
		</div>
		<div>
			환자명 : 
			<input id="hoPatientName" type="text" name="hoPatientName" placeholder="이름" value="${hoPatientName}" readonly="readonly">
		</div>
		<div>
			연락처 : 
			<input id="hoPatientPhone" type="text" name="hoPatientPhone" placeholder="전화번호" value="${hoPatientPhone}" readonly="readonly">
		</div>
		<div>
			주소 : 
			<input type="text" value="${hoPatientAddress} ${hoPatientDetailAddress}" size="70" readonly="readonly">
		</div>
		<div>
			우편번호 : 
			<input type="text" value="${hoZipCode}" readonly="readonly">
		</div>
		<div>
			접수목적 :
			<input id="hoReceivePurpose" type="text" name="hoReceivePurpose" value="감기몸살">ex)골절상
		</div>
		<div>
			진료과목 :
			<select id="hoTreatSubjectCode" name="hoTreatSubjectCode">
				<option value="">:::선택하세요:::</option>
				<c:forEach items="${treatSubjectList}" var="treatSubjectList">
					<option value="${treatSubjectList.hoTreatSubjectCode}">${treatSubjectList.hoTreatSubjectName}</option>
				</c:forEach>
			</select>
		</div>
		<input id="submitBtn" type="button" value="접수">
	</form>
<%@ include file="/WEB-INF/views/hospital/views/module/bottom.jsp" %>
