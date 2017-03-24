<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>随机匹配测试</title>
</head>
<body>
	<form action="request_2.jsp" method="post">
		<h4>请选择数据的路径:</h4>
		<input type="file" name="getfile">
		<h4>请输入每组的人数:</h4>
		<input type="text" style="width:500px" name="snum2">
		<input type="submit" value="匹配">
	</form>
	<hr>
	<form action="request_1.jsp" method="post">
		<h4>请输入匹配的数据:</h4>
		<textarea type="text" style="width:500px;height:200px" name="sttt">
		</textarea>
		<h4>请输入每组的人数:</h4>
		<input type="text" style="width:500px" name="snum">
		<input type="submit" value="匹配">
	</form>
	<hr>
</body>
</html>