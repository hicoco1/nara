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
    	
    	document.getElementById('EVENT').style.display="none";
    	document.getElementById('EVENT_I').style.display="none";
    	document.getElementById('EVENT_U').style.display="none";
    	document.getElementById('EVENT_D').style.display="none";
    	document.getElementById('EVENT_O').style.display="none";

    	document.getElementById('EVENT_QUESTION').style.display="none";
    	document.getElementById('EVENT_QUESTION_I').style.display="none";
    	document.getElementById('EVENT_QUESTION_U').style.display="none";
    	document.getElementById('EVENT_QUESTION_D').style.display="none";
    	document.getElementById('EVENT_QUESTION_O').style.display="none";

    	document.getElementById('EVENT_ANSWER_I').style.display="none";
    	document.getElementById('EVENT_ANSWER_O').style.display="none";

		var data = document.getElementById($(this).val());
    	data.style.display="block";

    });
    
	$("#goEVENT").click(function(){
		$("#f_EVENT").submit();
	});
	
	$("#goEVENT_D").click(function(){
			var eventData = $("#f_EVENT_D").serialize();	
	       	$.ajax({
	       		url:"/nara/EVENT_D",
	       		dataType : "json",
	       		method : "POST",
	       		data	:eventData,
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
	
	$("#goEVENT_U").click(function(){

		var eventData = $("#f_EVENT_U").serialize();	
       	$.ajax({
       		url:"/nara/EVENT_U",
       		dataType : "json",
       		method : "POST",
       		data	:eventData,
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


	$("#goEVENT_I").click(function(){
		var eventData = $("#f_EVENT_I").serialize();	
       	$.ajax({
       		url:"/nara/EVENT_I",
       		dataType : "json",
       		method : "POST",
       		data	:eventData,
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

	$("#goEVENT_O").click(function(){
		$("#f_EVENT_O").submit();
	});

	$("#goEVENT_QUESTION").click(function(){
		$("#f_EVENT_QUESTION").submit();
	});
	
	$("#goEVENT_QUESTION_D").click(function(){
			var eventData = $("#f_EVENT_QUESTION_D").serialize();	
	       	$.ajax({
	       		url:"/nara/EVENT_QUESTION_D",
	       		dataType : "json",
	       		method : "POST",
	       		data	:eventData,
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
	
	$("#goEVENT_QUESTION_U").click(function(){

		var eventData = $("#f_EVENT_QUESTION_U").serialize();	
       	$.ajax({
       		url:"/nara/EVENT_QUESTION_U",
       		dataType : "json",
       		method : "POST",
       		data	:eventData,
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


	$("#goEVENT_QUESTION_I").click(function(){
		var eventData = $("#f_EVENT_QUESTION_I").serialize();	
       	$.ajax({
       		url:"/nara/EVENT_QUESTION_I",
       		dataType : "json",
       		method : "POST",
       		data	:eventData,
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

	$("#goEVENT_QUESTION_O").click(function(){
		$("#f_EVENT_QUESTION_O").submit();
	});


	$("#goEVENT_ANSWER_I").click(function(){
		var eventData = $("#f_EVENT_ANSWER_I").serialize();	
       	$.ajax({
       		url:"/nara/EVENT_ANSWER_I",
       		dataType : "json",
       		method : "POST",
       		data	:eventData,
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
	
	$("#goEVENT_ANSWER_O").click(function(){
		$("#f_EVENT_ANSWER_O").submit();
	});
	
	
	
});
</script>

</head>
<body>
	<h3>이벤트 관리</h3>	
		
	<div>
		<select style="width:165px; height:23px;" id="category">
			<option>Select</option>
			<option value="EVENT">EVENT</option>
			<option value="EVENT_I">EVENT_I</option>
			<option value="EVENT_U">EVENT_U</option>
			<option value="EVENT_D">EVENT_D</option>
			<option value="EVENT_O">EVENT_O</option>
			<option value="EVENT_QUESTION">EVENT_QUESTION</option>
			<option value="EVENT_QUESTION_I">EVENT_QUESTION_I</option>
			<option value="EVENT_QUESTION_U">EVENT_QUESTION_U</option>
			<option value="EVENT_QUESTION_D">EVENT_QUESTION_D</option>
			<option value="EVENT_QUESTION_O">EVENT_QUESTION_O</option>
			<option value="EVENT_ANSWER_I">EVENT_ANSWER_I</option>
			<option value="EVENT_ANSWER_O">EVENT_ANSWER_O</option>			
		</select>
	</div>

	<br>
	
	<form id="f_EVENT" action="<c:url value='/EVENT' />" method='POST'>
		<div id="EVENT" style="display:none;">
			<div style="float:left; width:15%;">EVENT_KIND</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_KIND" name="EVENT_KIND">
			</div>
			<div style="float:left; width:15%;">EVENT_STATUS</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_STATUS" name="EVENT_STATUS" value="1" readonly>
			</div>
			<div style="float:left; width:15%;">EVENT_TITLE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_TITLE" name="EVENT_TITLE" >
			</div>
			<div style="float:left; width:15%;">EVENT_TEXT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_TEXT" name="EVENT_TEXT">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goEVENT">Request</button>
			</div>
		</div>
	</form>
	

	<form id="f_EVENT_D" action="<c:url value='/EVENT_D' />" method='POST'>
		<div id="EVENT_D" style="display:none;">
			<div style="float:left; width:15%;">EVENT_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_CODE" name="EVENT_CODE">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goEVENT_D">Request</button>
			</div>
		</div>
	</form>
	
	<form id="f_EVENT_U" action="<c:url value='/EVENT_U' />" method='POST'>
		<div id="EVENT_U" style="display:none;">
			<div style="float:left; width:15%;">EVENT_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_CODE" name="EVENT_CODE">
			</div>
			<div style="float:left; width:15%;">EVENT_KIND</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_KIND" name="EVENT_KIND">
			</div>
			<div style="float:left; width:15%;">EVENT_STATUS</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_STATUS" name="EVENT_STATUS">
			</div>
			<div style="float:left; width:15%;">EVENT_TITLE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_TITLE" name="EVENT_TITLE">
			</div>
			<div style="float:left; width:15%;">EVENT_TEXT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_TEXT" name="EVENT_TEXT">
			</div>
			<div style="float:left; width:15%;">QUESTION_CNT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_CNT" name="QUESTION_CNT">
			</div>
			<div style="float:left; width:15%;">EVENT_FILE_NAME</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_FILE_NAME" name="EVENT_FILE_NAME">
			</div>
			<div style="float:left; width:15%;">EVENT_SDATE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_SDATE" name="EVENT_SDATE">
			</div>
			<div style="float:left; width:15%;">EVENT_FILE_NAME</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_EDATE" name="EVENT_EDATE">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goEVENT_U">Request</button>
			</div>
			
		</div>
	</form>

	<form id="f_EVENT_O" action="<c:url value='/EVENT_O' />" method='POST'>
		<div id="EVENT_O" style="display:none;">
			<div style="float:left; width:15%;">EVENT_code</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_CODE" name="EVENT_CODE">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goEVENT_O">Request</button>
			</div>
		</div>
	</form>
	

	
	<form id="f_EVENT_I" action="<c:url value='/EVENT_I' />" method='POST'>
		<div id="EVENT_I" style="display:none;">
			<div style="float:left; width:15%;">EVENT_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_CODE" name="EVENT_CODE">
			</div>
			<div style="float:left; width:15%;">EVENT_KIND</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_KIND" name="EVENT_KIND">
			</div>
			<div style="float:left; width:15%;">EVENT_STATUS</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_STATUS" name="EVENT_STATUS" value="1" readonly>
			</div>
			<div style="float:left; width:15%;">EVENT_TITLE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_TITLE" name="EVENT_TITLE" >
			</div>
			<div style="float:left; width:15%;">EVENT_TEXT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_TEXT" name="EVENT_TEXT">
			</div>
			<div style="float:left; width:15%;">QUESTION_CNT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_CNT" name="QUESTION_CNT">
			</div>
			<div style="float:left; width:15%;">EVENT_FILE_NAME</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_FILE_NAME" name="EVENT_FILE_NAME">
			</div>
			<div style="float:left; width:15%;">EVENT_SDATE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_SDATE" name="EVENT_SDATE">
			</div>
			<div style="float:left; width:15%;">EVENT_EDATE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_EDATE" name="EVENT_EDATE">
			</div>
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goEVENT_I">Request</button>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
	</form>

		
	<form id="f_EVENT_QUESTION" action="<c:url value='/EVENT_QUESTION' />" method='POST'>
		<div id="EVENT_QUESTION" style="display:none;">
			<div style="float:left; width:15%;">QUESTION_TYPE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_TYPE" name="QUESTION_TYPE">
			</div>
			<div style="float:left; width:15%;">QUESTION_TEXT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_TEXT" name="QUESTION_TEXT">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goEVENT_QUESTION">Request</button>
			</div>
		</div>
	</form>

	<form id="f_EVENT_QUESTION_D" action="<c:url value='/EVENT_QUESTION_D' />" method='POST'>
		<div id="EVENT_QUESTION_D" style="display:none;">
			<div style="float:left; width:15%;">EVENT_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_CODE" name="EVENT_CODE">
			</div>
			<div style="float:left; width:15%;">QUESTION_NO</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_NO" name="QUESTION_NO">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goEVENT_QUESTION_D">Request</button>
			</div>
		</div>
	</form>

	<form id="f_EVENT_QUESTION_U" action="<c:url value='/EVENT_QUESTION_U' />" method='POST'>
		<div id="EVENT_QUESTION_U" style="display:none;">
			<div style="float:left; width:15%;">EVENT_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_CODE" name="EVENT_CODE">
			</div>
			<div style="float:left; width:15%;">QUESTION_NO</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_NO" name="QUESTION_NO">
			</div>
			<div style="float:left; width:15%;">QUESTION_TYPE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_TYPE" name="QUESTION_TYPE" value="1" readonly>
			</div>
			<div style="float:left; width:15%;">QUESTION_TEXT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_TEXT" name="QUESTION_TEXT" >
			</div>
			<div style="float:left; width:15%;">CHOICE_CNT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CHOICE_CNT" name="CHOICE_CNT">
			</div>
			<div style="float:left; width:15%;">CHOICE_1</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CHOICE_1" name="CHOICE_1">
			</div>
			<div style="float:left; width:15%;">CHOICE_2</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CHOICE_2" name="CHOICE_2">
			</div>
			<div style="float:left; width:15%;">CHOICE_3</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CHOICE_3" name="CHOICE_3">
			</div>
			<div style="float:left; width:15%;">CHOICE_4</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CHOICE_4" name="CHOICE_4">
			</div>
			<div style="float:left; width:15%;">CHOICE_5</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CHOICE_5" name="CHOICE_5">
			</div>
			<div style="float:left; width:15%;">CHOICE_6</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CHOICE_6" name="CHOICE_6">
			</div>
			<div style="float:left; width:15%;">OBJECTIVE_CORRECT_ANSWER</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OBJECTIVE_CORRECT_ANSWER" name="OBJECTIVE_CORRECT_ANSWER">
			</div>
			<div style="float:left; width:15%;">SUBJECTIVE_CORRECT_ANSWER</div>
			<div style="float:left; width:85%;">
				<input type='text' id="SUBJECTIVE_CORRECT_ANSWER" name="SUBJECTIVE_CORRECT_ANSWER">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goEVENT_QUESTION_U">Request</button>
			</div>
		</div>
	</form>

	<form id="f_EVENT_QUESTION_O" action="<c:url value='/EVENT_QUESTION_O' />" method='POST'>
		<div id="EVENT_QUESTION_O" style="display:none;">
			<div style="float:left; width:15%;">EVENT_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_CODE" name="EVENT_CODE">
			</div>
			<div style="float:left; width:15%;">QUESTION_NO</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_NO" name="QUESTION_NO">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goEVENT_QUESTION_O">Request</button>
			</div>
		</div>
	</form>
	
	<form id="f_EVENT_QUESTION_I" action="<c:url value='/EVENT_QUESTION_I' />" method='POST'>
		<div id="EVENT_QUESTION_I" style="display:none;">
			<div style="float:left; width:15%;">EVENT_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_CODE" name="EVENT_CODE">
			</div>
			<div style="float:left; width:15%;">QUESTION_NO</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_NO" name="QUESTION_NO">
			</div>
			<div style="float:left; width:15%;">QUESTION_TYPE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_TYPE" name="QUESTION_TYPE" value="1" readonly>
			</div>
			<div style="float:left; width:15%;">QUESTION_TEXT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_TEXT" name="QUESTION_TEXT" >
			</div>
			<div style="float:left; width:15%;">CHOICE_CNT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CHOICE_CNT" name="CHOICE_CNT">
			</div>
			<div style="float:left; width:15%;">CHOICE_1</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CHOICE_1" name="CHOICE_1">
			</div>
			<div style="float:left; width:15%;">CHOICE_2</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CHOICE_2" name="CHOICE_2">
			</div>
			<div style="float:left; width:15%;">CHOICE_3</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CHOICE_3" name="CHOICE_3">
			</div>
			<div style="float:left; width:15%;">CHOICE_4</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CHOICE_4" name="CHOICE_4">
			</div>
			<div style="float:left; width:15%;">CHOICE_5</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CHOICE_5" name="CHOICE_5">
			</div>
			<div style="float:left; width:15%;">CHOICE_6</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CHOICE_6" name="CHOICE_6">
			</div>
			<div style="float:left; width:15%;">OBJECTIVE_CORRECT_ANSWER</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OBJECTIVE_CORRECT_ANSWER" name="OBJECTIVE_CORRECT_ANSWER">
			</div>
			<div style="float:left; width:15%;">SUBJECTIVE_CORRECT_ANSWER</div>
			<div style="float:left; width:85%;">
				<input type='text' id="SUBJECTIVE_CORRECT_ANSWER" name="SUBJECTIVE_CORRECT_ANSWER">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goEVENT_QUESTION_I">Request</button>
			</div>
		</div>
	</form>
	
	<form id="f_EVENT_ANSWER_O" action="<c:url value='/EVENT_ANSWER_O' />" method='POST'>
		<div id="EVENT_ANSWER_O" style="display:none;">
			<div style="float:left; width:15%;">USER_ID</div>
			<div style="float:left; width:85%;">
				<input type='text' id="USER_ID" name="USER_ID">
			</div>
			<div style="float:left; width:15%;">EVENT_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_CODE" name="EVENT_CODE">
			</div>
			<div style="float:left; width:15%;">QUESTION_NO</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_NO" name=QUESTION_NO>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goEVENT_ANSWER_O">Request</button>
			</div>
		</div>
	</form>
	
	
	<form id="f_EVENT_ANSWER_I" action="<c:url value='/EVENT_ANSWER_I' />" method='POST'>
		<div id="EVENT_ANSWER_I" style="display:none;">
			<div style="float:left; width:15%;">USER_ID</div>
			<div style="float:left; width:85%;">
				<input type='text' id="USER_ID" name="USER_ID">
			</div>
			<div style="float:left; width:15%;">EVENT_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="EVENT_CODE" name="EVENT_CODE">
			</div>
			<div style="float:left; width:15%;">QUESTION_NO</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_NO" name="QUESTION_NO" maxlength="2">
			</div>
			<div style="float:left; width:15%;">QUESTION_TYPE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION_TYPE" name="QUESTION_TYPE" maxlength="1">
			</div>
			<div style="float:left; width:15%;">OBJECTIVE_ANSWER</div>
			<div style="float:left; width:85%;">
				<input type='text' id="OBJECTIVE_ANSWER" name="OBJECTIVE_ANSWER" maxlength="1">
			</div>
			<div style="float:left; width:15%;">SUBJECTIVE_ANSWER</div>
			<div style="float:left; width:85%;">
				<input type='text' id="SUBJECTIVE_ANSWER" name="SUBJECTIVE_ANSWER">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goEVENT_ANSWER_I">Request</button>
			</div>
		</div>
	</form>
	
		<table border ='1'>
		<c:forEach items="${EVENT_LIST}" var="EVENT_LIST">
			<tr>
			
				<td>${EVENT_LIST.EVENT_CODE}</td>
				<td>${EVENT_LIST.EVENT_TITLE}</td>
				<td>${EVENT_LIST.EVENT_SDATE}</td>
				<td>${EVENT_LIST.EVENT_EDATE}</td>
				<td>${EVENT_LIST.INSERTDATE}</td>
			</tr>
			
		</c:forEach>
		
		<c:forEach items="${EVENT_QUESTION_LIST}" var="EVENT_QUESTION_LIST">
			<tr>
				<td>${EVENT_QUESTION_LIST.EVENT_CODE}</td>
				<td>${EVENT_QUESTION_LIST.QUESTION_NO}</td>
				<td>${EVENT_QUESTION_LIST.QUESTION_TYPE}</td>
				<td>${EVENT_QUESTION_LIST.QUESTION_TEXT}</td>
				<td>${EVENT_QUESTION_LIST.OPERATOR}</td>
				<td>${EVENT_QUESTION_LIST.INSERTDATE}</td>
				<td>${EVENT_QUESTION_LIST.UPDATEDATE}</td>
			</tr>
			
		</c:forEach>
		
		<c:forEach items="${EVENT_QUESTION_ONE}" var="EVENT_QUESTION_ONE">
			<tr>
				<td>${EVENT_QUESTION_ONE.EVENT_CODE}</td>
				<td>${EVENT_QUESTION_ONE.QUESTION_NO}</td>
				<td>${EVENT_QUESTION_ONE.QUESTION_TYPE}</td>
				<td>${EVENT_QUESTION_ONE.QUESTION_TEXT}</td>
				<td>${EVENT_QUESTION_ONE.CHOICE_1}</td>
				<td>${EVENT_QUESTION_ONE.CHOICE_2}</td>
				<td>${EVENT_QUESTION_ONE.CHOICE_3}</td>
				<td>${EVENT_QUESTION_ONE.CHOICE_4}</td>
				<td>${EVENT_QUESTION_ONE.CHOICE_5}</td>
				<td>${EVENT_QUESTION_ONE.CHOICE_6}</td>
				<td>${EVENT_QUESTION_ONE.OBJECTIVE_CORRECT_ANSWER}</td>
				<td>${EVENT_QUESTION_ONE.SUBJECTIVE_CORRECT_ANSWER}</td>
				<td>${EVENT_QUESTION_ONE.OPERATOR}</td>
				<td>${EVENT_QUESTION_ONE.INSERTDATE}</td>
				<td>${EVENT_QUESTION_ONE.UPDATEDATE}</td>
			</tr>
			
		</c:forEach>
		
		<c:forEach items="${EVENT_ONE}" var="EVENT_ONE">
			<tr>
			
				<td>${EVENT_ONE.EVENT_CODE}</td>
				<td>${EVENT_ONE.EVENT_KIND}</td>
				<td>${EVENT_ONE.EVENT_STATUS}</td>
				<td>${EVENT_ONE.EVENT_TITLE}</td>
				<td>${EVENT_ONE.EVENT_TEXT}</td>
				<td>${EVENT_ONE.QUESTION_CNT}</td>
				<td>${EVENT_ONE.EVENT_FILE_NAME}</td>
				<td>${EVENT_ONE.EVENT_SDATE}</td>
				<td>${EVENT_ONE.EVENT_EDATE}</td>
				<td>${EVENT_ONE.OPERATOR}</td>
				<td>${EVENT_ONE.INSERTDATE}</td>
				<td>${EVENT_ONE.UPDATEDATE}</td>
			</tr>
			
		</c:forEach>
		
		<c:forEach items="${EVENT_ANSWER_ONE}" var="EVENT_ANSWER_ONE">
			<tr>
				<td>${EVENT_ANSWER_ONE.USER_ID}</td>
				<td>${EVENT_ANSWER_ONE.EVENT_CODE}</td>
				<td>${EVENT_ANSWER_ONE.QUESTION_NO}</td>
				<td>${EVENT_ANSWER_ONE.QUESTION_TYPE}</td>
				<td>${EVENT_ANSWER_ONE.OBJECTIVE_ANSWER}</td>
				<td>${EVENT_ANSWER_ONE.SUBJECTIVE_ANSWER}</td>
				<td>${EVENT_ANSWER_ONE.CORRECT_FLAG}</td>
				<td>${EVENT_ANSWER_ONE.EVENT_WIN_FLAG}</td>
				<td>${EVENT_ANSWER_ONE.OPERATOR}</td>
				<td>${EVENT_ANSWER_ONE.INSERTDATE}</td>
				<td>${EVENT_ANSWER_ONE.UPDATEDATE}</td>
			</tr>
			
		</c:forEach>
		<c:forEach items="${EVENT_e_s}" var="EVENT_e_s">
			<tr>
			
				<td>${EVENT_e_s.EVENT_CODE}</td>
				<td>${EVENT_e_s.EVENT_TITLE}</td>
				<td>${EVENT_e_s.EVENT_SDATE}</td>
				<td>${EVENT_e_s.EVENT_EDATE}</td>
				<td>${EVENT_e_s.INSERTDATE}</td>
			</tr>
			
		</c:forEach>
    <c:forEach items="${EVENT_e_d}" var="EVENT_e_d">
			<tr>
			
				<td>${EVENT_e_d.EVENT_CODE}</td>
				<td>${EVENT_e_d.EVENT_KIND}</td>
				<td>${EVENT_e_d.EVENT_STATUS}</td>
				<td>${EVENT_e_d.EVENT_TITLE}</td>
				<td>${EVENT_e_d.EVENT_TEXT}</td>
				
				<td>${EVENT_e_d.QUESTION_CNT}</td>
				<td>${EVENT_e_d.EVENT_FILE_NAME}</td>
				<td>${EVENT_e_d.EVENT_SDATE}</td>
				<td>${EVENT_e_d.EVENT_EDATE}</td>
				<td>${EVENT_e_d.OPERATOR}</td>
				<td>${EVENT_e_d.INSERTDATE}</td>
				<td>${EVENT_e_d.UPDATEDATE}</td>
			</tr>
		</c:forEach>
	</table>	
    <c:choose>
		<c:when test="${result == 0}">Fail</c:when>
		<c:when test="${result == 1}">Success</c:when>
	</c:choose>  
</body>
</html>