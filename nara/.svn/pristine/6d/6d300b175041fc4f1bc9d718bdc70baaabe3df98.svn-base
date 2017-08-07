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
    	
    	document.getElementById('BANNEDTERMS').style.display="none";
    	document.getElementById('BANNEDTERMS_I').style.display="none";
    	document.getElementById('BANNEDTERMS_U').style.display="none";
    	document.getElementById('BANNEDTERMS_D').style.display="none";
    	document.getElementById('BANNEDTERMS_O').style.display="none";
		var data = document.getElementById($(this).val());
    	data.style.display="block";

    });
    
	$("#goBANNEDTERMS").click(function(){
		$("#f_BANNEDTERMS").submit();
	});
	
	$("#goBANNEDTERMS_D").click(function(){
			var BANNEDTERMSData = $("#f_BANNEDTERMS_D").serialize();	
	       	$.ajax({
	       		url:"/nara/BANNEDTERMS_D",
	       		dataType : "json",
	       		method : "POST",
	       		data	:BANNEDTERMSData,
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
	
	$("#goBANNEDTERMS_U").click(function(){

		var BANNEDTERMSData = $("#f_BANNEDTERMS_U").serialize();	
       	$.ajax({
       		url:"/nara/BANNEDTERMS_U",
       		dataType : "json",
       		method : "POST",
       		data	:BANNEDTERMSData,
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


	$("#goBANNEDTERMS_I").click(function(){
		var BANNEDTERMSData = $("#f_BANNEDTERMS_I").serialize();	
       	$.ajax({
       		url:"/nara/BANNEDTERMS_I",
       		dataType : "json",
       		method : "POST",
       		data	:BANNEDTERMSData,
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

	$("#goBANNEDTERMS_O").click(function(){
		$("#f_BANNEDTERMS_O").submit();
	});
	
});
</script>

</head>
<body>
	<h3>운영자 관리</h3>	
		
	<div>
		<select style="width:165px; height:23px;" id="category">
			<option>Select</option>
			<option value="BANNEDTERMS">BANNEDTERMS</option>
			<option value="BANNEDTERMS_I">BANNEDTERMS_I</option>
			<option value="BANNEDTERMS_U">BANNEDTERMS_U</option>
			<option value="BANNEDTERMS_D">BANNEDTERMS_D</option>
			<option value="BANNEDTERMS_O">BANNEDTERMS_O</option>
		</select>
	</div>

	<br>
	
	
	<form id="f_BANNEDTERMS" action="<c:url value='/BANNEDTERMS' />" method='POST'>
		<div id="BANNEDTERMS" style="display:none;">
			<div style="float:left; width:15%;">BT_SEQ</div>
			<div style="float:left; width:85%;">
				<input type='text' id="BT_SEQ" name="BT_SEQ">
			</div>
			<div style="float:left; width:15%;">BT_TEXT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="BT_TEXT" name="BT_TEXT" >
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goBANNEDTERMS">Request</button>
			</div>
		</div>
	</form>
	

	<form id="f_BANNEDTERMS_D" action="<c:url value='/BANNEDTERMS_D' />" method='POST'>
		<div id="BANNEDTERMS_D" style="display:none;">
			<div style="float:left; width:15%;">BT_SEQ</div>
			<div style="float:left; width:85%;">
				<input type='text' id="BT_SEQ" name="BT_SEQ">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goBANNEDTERMS_D">Request</button>
			</div>
		</div>
	</form>

	
	
	<form id="f_BANNEDTERMS_U" action="<c:url value='/BANNEDTERMS_U' />" method='POST'>
		<div id="BANNEDTERMS_U" style="display:none;">
			<div style="float:left; width:15%;">BT_SEQ</div>
			<div style="float:left; width:85%;">
				<input type='text' id="BT_SEQ" name="BT_SEQ">
			</div>
			<div style="float:left; width:15%;">BT_TEXT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="BT_TEXT" name="BT_TEXT">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goBANNEDTERMS_U">Request</button>
			</div>
		</div>
	</form>

	<form id="f_BANNEDTERMS_O" action="<c:url value='/BANNEDTERMS_O' />" method='POST'>
		<div id="BANNEDTERMS_O" style="display:none;">
			<div style="float:left; width:15%;">BT_SEQ</div>
			<div style="float:left; width:85%;">
				<input type='text' id="BT_SEQ" name="BT_SEQ">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goBANNEDTERMS_O">Request</button>
			</div>
		</div>
	</form>
	

	
	<form id="f_BANNEDTERMS_I" action="<c:url value='/BANNEDTERMS_I' />" method='POST'>
		<div id="BANNEDTERMS_I" style="display:none;">
			<div style="float:left; width:15%;">BT_SEQ</div>
			<div style="float:left; width:85%;">
				<input type='text' id="BT_SEQ" name="BT_SEQ">
			</div>
			<div style="float:left; width:15%;">BT_TEXT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="BT_TEXT" name="BT_TEXT">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goBANNEDTERMS_I">Request</button>
			</div>
		</div>
	</form>

	
	<table border ='1'>
		<c:forEach items="${BANNEDTERMS_LIST}" var="BANNEDTERMS_LIST">
			<tr>
				<td>${BANNEDTERMS_LIST.BT_SEQ}</td>
				<td>${BANNEDTERMS_LIST.BT_TEXT}</td>
				<td>${BANNEDTERMS_LIST.INSERT_DATE}</td>
			</tr>
			
		</c:forEach>
		
		<c:forEach items="${BANNEDTERMS_ONE}" var="BANNEDTERMS_ONE">
			<tr>
				<td>${BANNEDTERMS_ONE.BT_SEQ}</td>
				<td>${BANNEDTERMS_ONE.BT_TEXT}</td>
				<td>${BANNEDTERMS_ONE.INSERT_DATE}</td>
			</tr>			
		</c:forEach>
		

	</table>	 
</body>
</html>