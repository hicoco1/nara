<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src='<c:url value="/resources/js/jquery-1.11.0.min.js"/>' ></script>
<script src='<c:url value="/resources/js/jquery-ui.min.js"/>' ></script>

<script type="text/javascript">
$(document).ready(function() {


    $("#category").change(function() {
    	
    	document.getElementById('OPERATOR').style.display="none";
    	document.getElementById('OPERATOR_I').style.display="none";
    	document.getElementById('OPERATOR_U').style.display="none";
    	document.getElementById('OPERATOR_D').style.display="none";
    	document.getElementById('OPERATOR_O').style.display="none";

    	document.getElementById('OPERATOR_AUTH').style.display="none";
    	document.getElementById('OPERATOR_AUTH_I').style.display="none";
    	document.getElementById('OPERATOR_AUTH_U').style.display="none";
    	document.getElementById('OPERATOR_AUTH_D').style.display="none";
    	document.getElementById('OPERATOR_AUTH_O').style.display="none";

    	document.getElementById('OPERATOR_LOG').style.display="none";

		var data = document.getElementById($(this).val());
    	data.style.display="block";

    });
    
	$("#goOPERATOR").click(function(){
		$("#f_OPERATOR").submit();
	});
	
	$("#goOPERATOR_D").click(function(){
			var OPERATORData = $("#f_OPERATOR_D").serialize();	
	       	$.ajax({
	       		url:"/nara/OPERATOR_D",
	       		dataType : "json",
	       		method : "POST",
	       		data	:OPERATORData,
	       		success : function(result) {
	       	
	       	    	if( result != -1) {
						alert("정상적으로 삭제 되었습니다.");
	       	    	} else {
	       	    		alert("서버의 문제가 발생하였습니다.");
	       	    		return false;
	       	    	}
	       	    		
	       		}
	       	});
	});
	
	$("#goOPERATOR_U").click(function(){

		var OPERATORData = $("#f_OPERATOR_U").serialize();	
       	$.ajax({
       		url:"/nara/OPERATOR_U",
       		dataType : "json",
       		method : "POST",
       		data	:OPERATORData,
       		success : function(result) {
       	
       	    	if( result != -1) {
					alert("정상적으로 변경 되었습니다.");
       	    	} else {
       	    		alert("서버의 문제가 발생하였습니다.");
       	    		return false;
       	    	}
       	    		
       		}
       	});
	});


	$("#goOPERATOR_I").click(function(){
		var OPERATORData = $("#f_OPERATOR_I").serialize();	
       	$.ajax({
       		url:"/nara/OPERATOR_I",
       		dataType : "json",
       		method : "POST",
       		data	:OPERATORData,
       		success : function(result) {
       	
       	    	if( result != -1) {
					alert("정상적으로 등록 되었습니다.");
       	    	} else {
       	    		alert("서버의 문제가 발생하였습니다.");
       	    		return false;
       	    	}
       	    		
       		}
       	});
	});

	$("#goOPERATOR_O").click(function(){
		$("#f_OPERATOR_O").submit();
	});

	$("#goOPERATOR_AUTH").click(function(){
		$("#f_OPERATOR_AUTH").submit();
	});
	
	$("#goOPERATOR_AUTH_D").click(function(){
			var OPERATORData = $("#f_OPERATOR_AUTH_D").serialize();	
	       	$.ajax({
	       		url:"/nara/OPERATOR_AUTH_D",
	       		dataType : "json",
	       		method : "POST",
	       		data	:OPERATORData,
	       		success : function(result) {
	       	
	       	    	if( result != -1) {
						alert("정상적으로 삭제 되었습니다.");
	       	    	} else {
	       	    		alert("서버의 문제가 발생하였습니다.");
	       	    		return false;
	       	    	}
	       	    		
	       		}
	       	});
	});
	
	$("#goOPERATOR_AUTH_U").click(function(){

		var OPERATORData = $("#f_OPERATOR_AUTH_U").serialize();	
       	$.ajax({
       		url:"/nara/OPERATOR_AUTH_U",
       		dataType : "json",
       		method : "POST",
       		data	:OPERATORData,
       		success : function(result) {
       	
       	    	if( result != -1) {
					alert("정상적으로 변경 되었습니다.");
       	    	} else {
       	    		alert("서버의 문제가 발생하였습니다.");
       	    		return false;
       	    	}
       	    		
       		}
       	});
	});


	$("#goOPERATOR_AUTH_I").click(function(){
		var OPERATORData = $("#f_OPERATOR_AUTH_I").serialize();	
       	$.ajax({
       		url:"/nara/OPERATOR_AUTH_I",
       		dataType : "json",
       		method : "POST",
       		data	:OPERATORData,
       		success : function(result) {
       	
       	    	if( result != -1) {
					alert("정상적으로 등록 되었습니다.");
       	    	} else {
       	    		alert("서버의 문제가 발생하였습니다.");
       	    		return false;
       	    	}
       	    		
       		}
       	});
	});

	$("#goOPERATOR_AUTH_O").click(function(){
		$("#f_OPERATOR_AUTH_O").submit();
	});

	
	$("#goOPERATOR_LOG").click(function(){
		$("#f_OPERATOR_LOG").submit();
	});
	
});
</script>

</head>
<body>
	<h3>운영자 관리</h3>	
		
	<div>
		<select style="width:165px; height:23px;" id="category">
			<option>Select</option>
			<option value="OPERATOR">OPERATOR</option>
			<option value="OPERATOR_I">OPERATOR_I</option>
			<option value="OPERATOR_U">OPERATOR_U</option>
			<option value="OPERATOR_D">OPERATOR_D</option>
			<option value="OPERATOR_O">OPERATOR_O</option>
			<option value="OPERATOR_AUTH">OPERATOR_AUTH</option>
			<option value="OPERATOR_AUTH_I">OPERATOR_AUTH_I</option>
			<option value="OPERATOR_AUTH_U">OPERATOR_AUTH_U</option>
			<option value="OPERATOR_AUTH_D">OPERATOR_AUTH_D</option>
			<option value="OPERATOR_AUTH_O">OPERATOR_AUTH_O</option>
			<option value="OPERATOR_LOG">OPERATOR_LOG</option>
		</select>
	</div>

	<br>
	
	<form id="f_OPERATOR" action="<c:url value='/OPERATOR' />" method='POST'>
		<div id="OPERATOR" style="display:none;">
			<div style="float:left; width:15%;">OP_ID</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_ID" name="OP_ID">
			</div>
			<div style="float:left; width:15%;">OP_NAME</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_NAME" name="OP_NAME" >
			</div>
			<div style="float:left; width:15%;">OP_PHONE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_PHONE" name="OP_PHONE" >
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goOPERATOR">Request</button>
			</div>
		</div>
	</form>
	

	<form id="f_OPERATOR_D" action="<c:url value='/OPERATOR_D' />" method='POST'>
		<div id="OPERATOR_D" style="display:none;">
			<div style="float:left; width:15%;">OP_ID</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_ID" name="OP_ID">
			</div>
			<div style="float:left; width:15%;">OP_PWD</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_PWD" name="OP_PWD">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goOPERATOR_D">Request</button>
			</div>
		</div>
	</form>
	
	<form id="f_OPERATOR_U" action="<c:url value='/OPERATOR_U' />" method='POST'>
		<div id="OPERATOR_U" style="display:none;">
			<div style="float:left; width:15%;">OP_ID</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_ID" name="OP_ID">
			</div>
			<div style="float:left; width:15%;">OP_PWD</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_PWD" name="OP_PWD">
			</div>
			<div style="float:left; width:15%;">OP_NAME</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_NAME" name="OP_NAME">
			</div>
			<div style="float:left; width:15%;">OP_EMAIL</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_EMAIL" name="OP_EMAIL">
			</div>
			<div style="float:left; width:15%;">OP_PHONE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_PHONE" name="OP_PHONE">
			</div>
			<div style="float:left; width:15%;">OP_HP</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_HP" name="OP_HP">
			</div>
			<div style="float:left; width:15%;">OP_IP</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_IP" name="OP_IP">
			</div>
			<div style="float:left; width:15%;">DUPLICATE_LOGIN</div>
			<div style="float:left; width:85%;">
				<input type='text' id="DUPLICATE_LOGIN" name="DUPLICATE_LOGIN">
			</div>
			<div style="float:left; width:15%;">LOGIN_YN</div>
			<div style="float:left; width:85%;">
				<input type='text' id="LOGIN_YN" name="LOGIN_YN" value="0">
			</div>
			<div style="float:left; width:15%;">KICK_OUT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="KICK_OUT" name="KICK_OUT" value="0">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goOPERATOR_U">Request</button>
			</div>
			
		</div>
	</form>

	<form id="f_OPERATOR_O" action="<c:url value='/OPERATOR_O' />" method='POST'>
		<div id="OPERATOR_O" style="display:none;">
			<div style="float:left; width:15%;">OP_ID</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_ID" name="OP_ID">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goOPERATOR_O">Request</button>
			</div>
		</div>
	</form>
	

	
	<form id="f_OPERATOR_I" action="<c:url value='/OPERATOR_I' />" method='POST'>
		<div id="OPERATOR_I" style="display:none;">
						<div style="float:left; width:15%;">OP_ID</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_ID" name="OP_ID">
			</div>
			<div style="float:left; width:15%;">OP_PWD</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_PWD" name="OP_PWD">
			</div>
			<div style="float:left; width:15%;">OP_NAME</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_NAME" name="OP_NAME">
			</div>
			<div style="float:left; width:15%;">OP_EMAIL</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_EMAIL" name="OP_EMAIL">
			</div>
			<div style="float:left; width:15%;">OP_PHONE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_PHONE" name="OP_PHONE">
			</div>
			<div style="float:left; width:15%;">OP_HP</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_HP" name="OP_HP">
			</div>
			<div style="float:left; width:15%;">OP_IP</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_IP" name="OP_IP">
			</div>
			<div style="float:left; width:15%;">DUPLICATE_LOGIN</div>
			<div style="float:left; width:85%;">
				<input type='text' id="DUPLICATE_LOGIN" name="DUPLICATE_LOGIN">
			</div>
			<div style="float:left; width:15%;">LOGIN_YN</div>
			<div style="float:left; width:85%;">
				<input type='text' id="LOGIN_YN" name="LOGIN_YN" value="0">
			</div>
			<div style="float:left; width:15%;">KICK_OUT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="KICK_OUT" name="KICK_OUT" value="0">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goOPERATOR_I">Request</button>
			</div>
		</div>
	</form>

		
	<form id="f_OPERATOR_AUTH" action="<c:url value='/OPERATOR_AUTH' />" method='POST'>
		<div id="OPERATOR_AUTH" style="display:none;">
			<div style="float:left; width:15%;">OP_ID</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_ID" name="OP_ID">
			</div>
			<div style="float:left; width:15%;">OP_LEVEL</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_LEVEL" name="OP_LEVEL">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goOPERATOR_AUTH">Request</button>
			</div>
		</div>
	</form>

	<form id="f_OPERATOR_AUTH_D" action="<c:url value='/OPERATOR_AUTH_D' />" method='POST'>
		<div id="OPERATOR_AUTH_D" style="display:none;">
			<div style="float:left; width:15%;">OP_ID</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_ID" name="OP_ID">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goOPERATOR_AUTH_D">Request</button>
			</div>
		</div>
	</form>

	<form id="f_OPERATOR_AUTH_U" action="<c:url value='/OPERATOR_AUTH_U' />" method='POST'>
		<div id="OPERATOR_AUTH_U" style="display:none;">
			<div style="float:left; width:15%;">OP_ID</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_ID" name="OP_ID">
			</div>
			<div style="float:left; width:15%;">OP_LEVEL</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_LEVEL" name="OP_LEVEL">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goOPERATOR_AUTH_U">Request</button>
			</div>
		</div>
	</form>

	<form id="f_OPERATOR_AUTH_O" action="<c:url value='/OPERATOR_AUTH_O' />" method='POST'>
		<div id="OPERATOR_AUTH_O" style="display:none;">
			<div style="float:left; width:15%;">OP_ID</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_ID" name="OP_ID">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goOPERATOR_AUTH_O">Request</button>
			</div>
		</div>
	</form>
	
	<form id="f_OPERATOR_AUTH_I" action="<c:url value='/OPERATOR_AUTH_I' />" method='POST'>
		<div id="OPERATOR_AUTH_I" style="display:none;">
			<div style="float:left; width:15%;">OP_ID</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_ID" name="OP_ID">
			</div>
			<div style="float:left; width:15%;">OP_LEVEL</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_LEVEL" name="OP_LEVEL">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goOPERATOR_AUTH_I">Request</button>
			</div>
		</div>
	</form>
	
	<form id="f_OPERATOR_LOG" action="<c:url value='OPERATOR_LOG' />" method='POST'>
		<div id="OPERATOR_LOG" style="display:none;">
			<div style="float:left; width:15%;">OP_ID</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_ID" name="OP_ID">
			</div>
			<div style="float:left; width:15%;">OP_IP</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OP_IP" name="OP_IP">
			</div>
			<div style="float:left; width:15%;">KEYWORD</div>
			<div style="float:left; width:85%;">
				<input type='text' id="KEYWORD" name="KEYWORD">
			</div>
			<div style="float:left; width:15%;">COMMAND</div>
			<div style="float:left; width:85%;">
				<input type='text' id="COMMAND" name="COMMAND">
			</div>
			<div style="float:left; width:15%;">COMMENTS</div>
			<div style="float:left; width:85%;">
				<input type='text' id="COMMENTS" name="COMMENTS">
			</div>
			<div style="float:left; width:15%;">RESULT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="RESULT" name="RESULT">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goOPERATOR_LOG">Request</button>
			</div>
		</div>
	</form>
	
		<table border ='1'>
		<c:forEach items="${OPERATOR_LIST}" var="OPERATOR_LIST">
			<tr>
				<td>${OPERATOR_LIST.OP_ID}</td>
				<td>${OPERATOR_LIST.OP_NAME}</td>
				<td>${OPERATOR_LIST.OP_PHONE}</td>
				<td>${OPERATOR_LIST.DUPLICATE_LOGIN}</td>
				<td>${OPERATOR_LIST.LOGIN_YN}</td>
				<td>${OPERATOR_LIST.LOGIN_TIME}</td>
				<td>${OPERATOR_LIST.LOGOUT_TIME}</td>
				<td>${OPERATOR_LIST.KICK_OUT}</td>
				<td>${OPERATOR_LIST.INSERT_ID}</td>
				<td>${OPERATOR_LIST.UPDATE_ID}</td>
			</tr>
			
		</c:forEach>
		
		<c:forEach items="${OPERATOR_ONE}" var="OPERATOR_ONE">
			<tr>
				<td>${OPERATOR_ONE.OP_ID}</td>
				<td>${OPERATOR_ONE.OP_NAME}</td>
				<td>${OPERATOR_ONE.OP_EMAIL}</td>
				<td>${OPERATOR_ONE.OP_PHONE}</td>
				<td>${OPERATOR_ONE.OP_HP}</td>
				<td>${OPERATOR_ONE.OP_IP}</td>
				<td>${OPERATOR_ONE.DUPLICATE_LOGIN}</td>
				<td>${OPERATOR_ONE.LOGIN_YN}</td>
				<td>${OPERATOR_ONE.LOGIN_TIME}</td>
				<td>${OPERATOR_ONE.LOGOUT_TIME}</td>
				<td>${OPERATOR_ONE.SESSION_ID}</td>
				<td>${OPERATOR_ONE.KICK_OUT}</td>
				<td>${OPERATOR_ONE.INSERT_ID}</td>
				<td>${OPERATOR_ONE.UPDATE_ID}</td>
				<td>${OPERATOR_ONE.INSERT_DATE}</td>
				<td>${OPERATOR_ONE.UPDATE_DATE}</td>
			</tr>
			
		</c:forEach>
		
		<c:forEach items="${OPERATOR_AUTH_LIST}" var="OPERATOR_AUTH_LIST">
			<tr>
				<td>${OPERATOR_AUTH_LIST.OP_ID}</td>
				<td>${OPERATOR_AUTH_LIST.OP_LEVEL}</td>
				<td>${OPERATOR_AUTH_LIST.UPDATE_DATE}</td>
				<td>${OPERATOR_AUTH_LIST.INSERT_DATE}</td>
			</tr>
			
		</c:forEach>
		
		<c:forEach items="${OPERATOR_AUTH_ONE}" var="OPERATOR_AUTH_ONE">
			<tr>
				<td>${OPERATOR_AUTH_ONE.OP_ID}</td>
				<td>${OPERATOR_AUTH_ONE.OP_LEVEL}</td>
				<td>${OPERATOR_AUTH_ONE.UPDATE_DATE}</td>
				<td>${OPERATOR_AUTH_ONE.INSERT_DATE}</td>
			</tr>
		</c:forEach>
		
		
		<c:forEach items="${OPERATOR_LOG_LIST}" var="OPERATOR_LOG_LIST">
			<tr>
				<td>${OPERATOR_LOG_LIST.LOG_DATE}</td>
				<td>${OPERATOR_LOG_LIST.OP_ID}</td>
				<td>${OPERATOR_LOG_LIST.OP_IP}</td>
				<td>${OPERATOR_LOG_LIST.KEYWORD}</td>
				<td>${OPERATOR_LOG_LIST.COMMAND}</td>
				<td>${OPERATOR_LOG_LIST.COMMENTS}</td>
				<td>${OPERATOR_LOG_LIST.RESULT}</td>
				<td>${OPERATOR_LOG_LIST.UPDATE_DATE}</td>
				<td>${OPERATOR_LOG_LIST.INSERT_DATE}</td>
			</tr>
		</c:forEach>
	</table>	 
</body>
</html>