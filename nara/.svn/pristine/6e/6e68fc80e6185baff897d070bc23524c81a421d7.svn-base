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
    	
    	document.getElementById('NR_Question_S').style.display="none";
    	document.getElementById('NR_Question_I').style.display="none";
    	document.getElementById('NR_Question_U').style.display="none";
    	document.getElementById('NR_Question_D').style.display="none";
    	document.getElementById('NR_Notice_S').style.display="none";
    	document.getElementById('NR_Notice_I').style.display="none";
    	document.getElementById('NR_Notice_U').style.display="none";
    	document.getElementById('NR_Notice_D').style.display="none";
    	document.getElementById('NR_TalkHistory_S').style.display="none";
    	document.getElementById('NR_TalkHistory_I').style.display="none";
    	document.getElementById('NR_TalkHistory_U').style.display="none";
    	document.getElementById('NR_TalkHistory_D').style.display="none";

		var data = document.getElementById($(this).val());
    	data.style.display="block";

    });
    
	$("#goQuestion_S").click(function(){
		$("#f_Question_S").submit();
	});
	$("#goQuestion_I").click(function(){
		$("#f_Question_I").submit();
	});
	$("#goQuestion_U").click(function(){
		$("#f_Question_U").submit();
	});
	$("#goQuestion_D").click(function(){
		$("#f_Question_D").submit();
	});
	$("#goNotice_S").click(function(){
		$("#f_Notice_S").submit();
	});
	$("#goNotice_I").click(function(){
		$("#f_Notice_I").submit();
	});
	$("#goNotice_U").click(function(){
		$("#f_Notice_U").submit();
	});
	$("#goNotice_D").click(function(){
		$("#f_Notice_D").submit();
	});
	$("#goTalkHistory_S").click(function(){
		$("#f_TalkHistory_S").submit();
	});
	$("#goTalkHistory_I").click(function(){
		$("#f_TalkHistory_I").submit();
	});
	$("#goTalkHistory_U").click(function(){
		$("#f_TalkHistory_U").submit();
	});
	$("#goTalkHistory_D").click(function(){
		$("#f_TalkHistory_D").submit();
	});

});
</script>

</head>
<body>

	<c:choose>
		<c:when test="${result == 0}">Fail</c:when>
		<c:when test="${result == 1}">Success</c:when>
	</c:choose>

	<table border="0">
		<c:forEach items="${rep_question}" var="rep_question">
			<tr>
				<td width="200px">${rep_question.QUESTIONNO}</td>
				<td width="200px">${rep_question.QUESTION}</td>
				<td width="200px">${rep_question.ANSWER}</td>
				<td width="200px">${rep_question.CLASSIFY_CODE}</td>
				<td width="200px">${rep_question.INSERTDATE}</td>
				<td width="200px">${rep_question.UPDATEDATE}</td>
			</tr>
		</c:forEach>
	</table>

	<table border="0">
		<c:forEach items="${rep_notice}" var="rep_notice">
			<tr>
				<td width="200px">${rep_notice.NOTICENO}</td>
				<td width="200px">${rep_notice.NOTICE}</td>
				<td width="200px">${rep_notice.CLASSIFY_CODE}</td>
				<td width="200px">${rep_notice.INSERTDATE}</td>
				<td width="200px">${rep_notice.UPDATEDATE}</td>
			</tr>
		</c:forEach>
	</table>

	<table border="0">
		<c:forEach items="${rep_talkhistory}" var="rep_talkhistory">
			<tr>
				<td width="200px">${rep_talkhistory.TALKNO}</td>
				<td width="200px">${rep_talkhistory.USER_ID}</td>
				<td width="200px">${rep_talkhistory.TALKABOUT}</td>
				<td width="200px">${rep_talkhistory.CLASSIFY_CODE}</td>
				<td width="200px">${rep_talkhistory.ORG_TALKNO}</td>
				<td width="200px">${rep_talkhistory.INSERTDATE}</td>
				<td width="200px">${rep_talkhistory.UPDATEDATE}</td>
			</tr>
		</c:forEach>
	</table>

	<div>
		<br>
		<select style="width:165px; height:23px;" id="category">
			<option>Select</option>
			<option value="NR_Question_S">NR_Question_S</option>
			<option value="NR_Question_I">NR_Question_I</option>
			<option value="NR_Question_U">NR_Question_U</option>
			<option value="NR_Question_D">NR_Question_D</option>
			<option value="NR_Notice_S">NR_Notice_S</option>
			<option value="NR_Notice_I">NR_Notice_I</option>
			<option value="NR_Notice_U">NR_Notice_U</option>
			<option value="NR_Notice_D">NR_Notice_D</option>
			<option value="NR_TalkHistory_S">NR_TalkHistory_S</option>
			<option value="NR_TalkHistory_I">NR_TalkHistory_I</option>
			<option value="NR_TalkHistory_U">NR_TalkHistory_U</option>
			<option value="NR_TalkHistory_D">NR_TalkHistory_D</option>
		</select>
	</div>

	<br>
	
	<form id="f_Question_S" action="NR_Question_S" method='POST' autocomplete="off">
		<div id="NR_Question_S" style="display:none;">
			<div style="float:left; width:15%;">CLASSIFY_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CLASSIFY_CODE" name="CLASSIFY_CODE">
			</div>
			<div style="float:left; width:15%;">QUESTION</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION" name="QUESTION">
			</div>
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goQuestion_S">Request</button>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
	</form>

	<form id="f_Question_I" action="<c:url value='/NR_Question_I' />" method='POST' autocomplete="off">
		<div id="NR_Question_I" style="display:none;">
			<div style="float:left; width:15%;">QUESTIONNO<font color="red">*</font></div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTIONNO" name="QUESTIONNO">
			</div>
			<div style="float:left; width:15%;">QUESTION</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION" name="QUESTION">
			</div>
			<div style="float:left; width:15%;">ANSWER</div>
			<div style="float:left; width:85%;">
				<input type='text' id="ANSWER" name="ANSWER">
			</div>
			<div style="float:left; width:15%;">CLASSIFY_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CLASSIFY_CODE" name="CLASSIFY_CODE">
			</div>
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goQuestion_I">Request</button>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
	</form>

	<form id="f_Question_U" action="<c:url value='/NR_Question_U' />" method='POST' autocomplete="off">
		<div id="NR_Question_U" style="display:none;">
			<div style="float:left; width:15%;">QUESTIONNO<font color="red">*</font></div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTIONNO" name="QUESTIONNO">
			</div>
			<div style="float:left; width:15%;">QUESTION</div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTION" name="QUESTION">
			</div>
			<div style="float:left; width:15%;">ANSWER</div>
			<div style="float:left; width:85%;">
				<input type='text' id="ANSWER" name="ANSWER">
			</div>
			<div style="float:left; width:15%;">CLASSIFY_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CLASSIFY_CODE" name="CLASSIFY_CODE">
			</div>
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goQuestion_U">Request</button>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
	</form>

	<form id="f_Question_D" action="<c:url value='/NR_Question_D' />" method='POST' autocomplete="off">
		<div id="NR_Question_D" style="display:none;">
			<div style="float:left; width:15%;">QUESTIONNO<font color="red">*</font></div>
			<div style="float:left; width:85%;">
				<input type='text' id="QUESTIONNO" name="QUESTIONNO">
			</div>
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goQuestion_D">Request</button>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
	</form>

	<form id="f_Notice_S" action="NR_Notice_S" method='POST' autocomplete="off">
		<div id="NR_Notice_S" style="display:none;">
			<div style="float:left; width:15%;">CLASSIFY_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CLASSIFY_CODE" name="CLASSIFY_CODE">
			</div>
			<div style="float:left; width:15%;">NOTICE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="NOTICE" name="NOTICE">
			</div>
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goNotice_S">Request</button>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
	</form>

	<form id="f_Notice_I" action="<c:url value='/NR_Notice_I' />" method='POST' autocomplete="off">
		<div id="NR_Notice_I" style="display:none;">
			<div style="float:left; width:15%;">NOTICENO<font color="red">*</font></div>
			<div style="float:left; width:85%;">
				<input type='text' id="NOTICENO" name="NOTICENO">
			</div>
			<div style="float:left; width:15%;">NOTICE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="NOTICE" name="NOTICE">
			</div>
			<div style="float:left; width:15%;">CLASSIFY_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CLASSIFY_CODE" name="CLASSIFY_CODE">
			</div>
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goNotice_I">Request</button>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
	</form>

	<form id="f_Notice_U" action="<c:url value='/NR_Notice_U' />" method='POST' autocomplete="off">
		<div id="NR_Notice_U" style="display:none;">
			<div style="float:left; width:15%;">NOTICENO<font color="red">*</font></div>
			<div style="float:left; width:85%;">
				<input type='text' id="NOTICENO" name="NOTICENO">
			</div>
			<div style="float:left; width:15%;">NOTICE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="NOTICE" name="NOTICE">
			</div>
			<div style="float:left; width:15%;">CLASSIFY_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CLASSIFY_CODE" name="CLASSIFY_CODE">
			</div>
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goNotice_U">Request</button>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
	</form>

	<form id="f_Notice_D" action="<c:url value='/NR_Notice_D' />" method='POST' autocomplete="off">
		<div id="NR_Notice_D" style="display:none;">
			<div style="float:left; width:15%;">NOTICENO<font color="red">*</font></div>
			<div style="float:left; width:85%;">
				<input type='text' id="NOTICENO" name="NOTICENO">
			</div>
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goNotice_D">Request</button>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
	</form>
	
	<form id="f_TalkHistory_S" action="NR_TalkHistory_S" method='POST' autocomplete="off">
		<div id="NR_TalkHistory_S" style="display:none;">
			<div style="float:left; width:15%;">TALKNO</div>
			<div style="float:left; width:85%;">
				<input type='text' id="TALKNO" name="TALKNO">
			</div>
			<div style="float:left; width:15%;">USER_ID</div>
			<div style="float:left; width:85%;">
				<input type='text' id="USER_ID" name="USER_ID">
			</div>
			<div style="float:left; width:15%;">CLASSIFY_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CLASSIFY_CODE" name="CLASSIFY_CODE">
			</div>
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goTalkHistory_S">Request</button>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
	</form>

	<form id="f_TalkHistory_I" action="<c:url value='/NR_TalkHistory_I' />" method='POST' autocomplete="off">
		<div id="NR_TalkHistory_I" style="display:none;">
			<input type='hidden' id="TALKNO" name="TALKNO">
			<div style="float:left; width:15%;">USER_ID<font color="red">*</font></div>
			<div style="float:left; width:85%;">
				<input type='text' id="USER_ID" name="USER_ID">
			</div>
			<div style="float:left; width:15%;">TALKABOUT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="TALKABOUT" name="TALKABOUT">
			</div>
			<div style="float:left; width:15%;">CLASSIFY_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CLASSIFY_CODE" name="CLASSIFY_CODE">
			</div>
			<div style="float:left; width:15%;">ORG_TALKNO</div>
			<div style="float:left; width:85%;">
				<input type='text' id="ORG_TALKNO" name="ORG_TALKNO">
			</div>
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goTalkHistory_I">Request</button>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
	</form>

	<form id="f_TalkHistory_U" action="<c:url value='/NR_TalkHistory_U' />" method='POST' autocomplete="off">
		<div id="NR_TalkHistory_U" style="display:none;">
			<div style="float:left; width:15%;">TALKNO<font color="red">*</font></div>
			<div style="float:left; width:85%;">
				<input type='text' id="TALKNO" name="TALKNO">
			</div>
			<div style="float:left; width:15%;">USER_ID<font color="red">*</font></div>
			<div style="float:left; width:85%;">
				<input type='text' id="USER_ID" name="USER_ID">
			</div>
			<div style="float:left; width:15%;">TALKABOUT</div>
			<div style="float:left; width:85%;">
				<input type='text' id="TALKABOUT" name="TALKABOUT">
			</div>
			<div style="float:left; width:15%;">CLASSIFY_CODE</div>
			<div style="float:left; width:85%;">
				<input type='text' id="CLASSIFY_CODE" name="CLASSIFY_CODE">
			</div>
			<div style="float:left; width:15%;">ORG_TALKNO</div>
			<div style="float:left; width:85%;">
				<input type='text' id="ORG_TALKNO" name="ORG_TALKNO">
			</div>>
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goTalkHistory_U">Request</button>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
	</form>

	<form id="f_TalkHistory_D" action="<c:url value='/NR_TalkHistory_D' />" method='POST' autocomplete="off">
		<div id="NR_TalkHistory_D" style="display:none;">
			<div style="float:left; width:15%;">TALKNO<font color="red">*</font></div>
			<div style="float:left; width:85%;">
				<input type='text' id="TALKNO" name="TALKNO">
			</div>
			<div style="float:left; width:15%;">USER_ID<font color="red">*</font></div>
			<div style="float:left; width:85%;">
				<input type='text' id="USER_ID" name="USER_ID">
			</div>>
			<div style="float:left; width:99%; margin-top:10px;">
				<button type="button" style="height:23px;" id="goTalkHistory_D">Request</button>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
	</form>


</body>
</html>