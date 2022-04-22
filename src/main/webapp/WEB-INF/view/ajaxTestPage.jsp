<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 적용방법 3 -->
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	function jsonPOSTSend(){
		obj = {
				args1 : $("#args1").val(),
				args2 : $("#args2").val()
			}
			$.ajax({
				type : "POST",
				url : "/ajax",
				////////Content-Type 명시함
				headers : {
					'Content-Type' : 'application/json'
				},
				////////보낼 데이터를 JSON.stringify()로 감싸주어야 함
				data : JSON.stringify(obj),
				success : function(data) {
					console.log("성공 : ", data);
					$("#result").html(data);
				},
				error : function(e) {
					console.log("에러발생 : ", e);
					$("#result").html(e.responseText);
				}
			});
	};
</script>
</head>
<body>
ajax post 테스트<br>
<span id="result"></span>
<form method="post">
	<input type="text" id="args1">
	<input type="text" id="args2">
</form>
<br>
<button onclick="jsonPOSTSend()">POST 데이터 보내기</button>


</body>
</html>