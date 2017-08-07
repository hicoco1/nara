<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- jquery -->

<script src='<c:url value="/resources/js/jquery-1.11.0.min.js"/>' ></script>
<script src='<c:url value="/resources/js/jquery-ui.min.js"/>' ></script>
<link href='<c:url value="/resources/css/jquery-ui.css"/>'  rel="stylesheet" type="text/css">
<!-- bootstrap -->
<script src='<c:url value="/resources/js/bootstrap.min.js"/>' ></script>
<link href='<c:url value="/resources/css/bootstrap.min.css"/>'  rel="stylesheet" type="text/css">



<script type="text/javascript">
$(function() {
	
	$("#loginBtn").click(function(){

		
		$("#loginForm").submit();
	});
	

	

});

</script>
<style type="text/css">
#container { 
	height:100%;
    width:100%;
    text-align:center;
}
#block { 
    margin: 0;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
}

.panel {text-align: left;}
</style>
</head>
<body>
<div id="container">
	<div id="block">
		<h2>나라사랑 포탈 웹</h2>
		<hr>
		<form name='f' id="loginForm" action="<c:url value='/login' />" method='POST'>
		    <div class="panel panel-primary" style="width:500px;">
			  <div class="panel-heading">로그인</div>
			  <div class="panel-body">
			    <div class="form-group">
				  <label class="control-label" for="userId">아이디</label>
				  <input class="form-control" id="userId" name="userId" type="text" placeholder="아이디를 입력하세요.">
				</div>
				<div class="form-group">
				  <label class="control-label" for="userPassword">비밀번호</label>
				  <input class="form-control" id="userPassword" name="userPassword" type="password" placeholder="비밀번호를 입력하세요.">
				</div>
		          <label>
		          	<input name="hosturl" id="hosturl" type="hidden">
		            <input id="remember" type="checkbox"> 아이디저장
		          </label>
		        <span class="pull-right">
		        <!-- <button type="button" class="btn btn-default" id="cancleBtn">취소</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -->
				<button type="button" class="btn btn-success" id="loginBtn">로그인</button>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				</span>			
			  </div>
			</div>
		</form>
	</div>
</div>
</body>
</html>