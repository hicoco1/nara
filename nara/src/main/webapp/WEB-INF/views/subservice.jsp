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
    	
    	document.getElementById('SUBSERVICE').style.display="none";
    	document.getElementById('SUBSERVICE_I').style.display="none";
    	document.getElementById('SUBSERVICE_U').style.display="none";
    	document.getElementById('SUBSERVICE_D').style.display="none";
    	document.getElementById('SUBSERVICE_O').style.display="none";
		var data = document.getElementById($(this).val());
    	data.style.display="block";

    });
    
	$("#goSUBSERVICE").click(function(){
		$("#f_SUBSERVICE").submit();
	});
	
	$("#goSUBSERVICE_D").click(function(){
			var SUBSERVICEData = $("#f_SUBSERVICE_D").serialize();	
	       	$.ajax({
	       		url:"/nara/SUBSERVICE_D",
	       		dataType : "json",
	       		method : "POST",
	       		data	:SUBSERVICEData,
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
	
	$("#goSUBSERVICE_U").click(function(){

		var SUBSERVICEData = $("#f_SUBSERVICE_U").serialize();	
       	$.ajax({
       		url:"/nara/SUBSERVICE_U",
       		dataType : "json",
       		method : "POST",
       		data	:SUBSERVICEData,
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


	$("#goSUBSERVICE_I").click(function(){
		var SUBSERVICEData = $("#f_SUBSERVICE_I").serialize();	
       	$.ajax({
       		url:"/nara/SUBSERVICE_I",
       		dataType : "json",
       		method : "POST",
       		data	:SUBSERVICEData,
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

	$("#goSUBSERVICE_O").click(function(){
		$("#f_SUBSERVICE_O").submit();
	});
	
});
</script>

</head>
<body>
	<h3>운영자 관리</h3>	
		
	<div>
		<select style="width:165px; height:23px;" id="category">
			<option>Select</option>
			<option value="SUBSERVICE">SUBSERVICE</option>
			<option value="SUBSERVICE_I">SUBSERVICE_I</option>
			<option value="SUBSERVICE_U">SUBSERVICE_U</option>
			<option value="SUBSERVICE_D">SUBSERVICE_D</option>
			<option value="SUBSERVICE_O">SUBSERVICE_O</option>
		</select>
	</div>

	<br>
	
	
	<form id="f_SUBSERVICE" action="<c:url value='/SUBSERVICE' />" method='POST'>
		<div id="SUBSERVICE" style="display:none;">
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
				<button type="button" style="height:23px;" id="goSUBSERVICE">Request</button>
			</div>
		</div>
	</form>
	

	<form id="f_SUBSERVICE_D" action="<c:url value='/SUBSERVICE_D' />" method='POST'>
		<div id="SUBSERVICE_D" style="display:none;">
			<div style="float:left; width:15%;">BT_SEQ</div>
			<div style="float:left; width:85%;">
				<input type='text' id="BT_SEQ" name="BT_SEQ">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goSUBSERVICE_D">Request</button>
			</div>
		</div>
	</form>

	
	
	<form id="f_SUBSERVICE_U" action="<c:url value='/SUBSERVICE_U' />" method='POST'>
		<div id="SUBSERVICE_U" style="display:none;">
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
				<button type="button" style="height:23px;" id="goSUBSERVICE_U">Request</button>
			</div>
		</div>
	</form>

	<form id="f_SUBSERVICE_O" action="<c:url value='/SUBSERVICE_O' />" method='POST'>
		<div id="SUBSERVICE_O" style="display:none;">
			<div style="float:left; width:15%;">BT_SEQ</div>
			<div style="float:left; width:85%;">
				<input type='text' id="BT_SEQ" name="BT_SEQ">
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goSUBSERVICE_O">Request</button>
			</div>
		</div>
	</form>
	

	
	<form id="f_SUBSERVICE_I" action="<c:url value='/SUBSERVICE_I' />" method='POST'>
		<div id="SUBSERVICE_I" style="display:none;">
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
				<button type="button" style="height:23px;" id="goSUBSERVICE_I">Request</button>
			</div>
		</div>
	</form>

	
	<table border ='1'>
		<c:forEach items="${SUBSERVICE_LIST}" var="SUBSERVICE_LIST">
			<tr>
				<td>${SUBSERVICE_LIST.BT_SEQ}</td>
				<td>${SUBSERVICE_LIST.BT_TEXT}</td>
				<td>${SUBSERVICE_LIST.INSERT_DATE}</td>
			</tr>
			
		</c:forEach>
		
		<c:forEach items="${SUBSERVICE_ONE}" var="SUBSERVICE_ONE">
			<tr>
				<td>${SUBSERVICE_ONE.BT_SEQ}</td>
				<td>${SUBSERVICE_ONE.BT_TEXT}</td>
				<td>${SUBSERVICE_ONE.INSERT_DATE}</td>
			</tr>			
		</c:forEach>
		

	</table>	 
</body>
</html>