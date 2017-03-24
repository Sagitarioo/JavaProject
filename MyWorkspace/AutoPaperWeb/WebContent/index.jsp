<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>随机出题系统</title>
</head>
<body>
	<h2>AutoPaperWebTest</h2>
	<form action="request_start.jsp" method="post">
		<h4>请输入选择题数量:<input type="text" style="width:50px" name="xz_input">
		</h4>
		<h4>请输入判断题数量:<input type="text" style="width:50px" name="pd_input">
		</h4>
		<h4>请输入填空题数量:<input type="text" style="width:50px" name="tk_input">
		</h4>
		<h4>请输入编程题数量:<input type="text" style="width:50px" name="bc_input">
		</h4>
		<input type="submit" value="提交">
	</form>
	<hr>
	<p>这是一段说明文字</p>
	
</body>
</html>