<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>随机匹配测试</title>
</head>
<body>
	<%	
		request.setCharacterEncoding("UTF-8");
		String arrt=request.getParameter("sttt");
		int b=Integer.parseInt(request.getParameter("snum"));//每个组的人数
		String arr[]=arrt.split(",");
		String str;
		int a=arr.length-1;
		int c=arr.length/b;//分成的组数
		int count=0;
		int count1=0;
		out.println("<h4>输入匹配的数据:</h4>");
		out.println(arrt);
		out.println("<h4>输入每组的人数:</h4>");
		out.println(b);
		out.println("<hr>");
		for(int i=0;i<arr.length;i++){
			int e=(int) Math.round(a*Math.random());
			str=arr[e];
			arr[e]=arr[a];
			arr[a]=str;
		}	
		out.println("<table border=\"1\" width=\"50%\" ");
		for(int j=0;j<a+1;j++){
			count++;
			if(count%b==1){
				out.print("<tr>"+"<td>"+" 第"+(count/b+1)+"组: "+"</td>");
			}
			out.print("<td>"+arr[j]+ "</td>");
			if(count%b==0){
				out.print("</tr>");
				out.print("</br>");
			}
		}
		out.println("</table>");			
	%>
</body>
</html>