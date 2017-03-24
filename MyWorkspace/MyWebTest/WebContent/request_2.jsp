<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.io.BufferedReader,java.io.File,
java.io.FileInputStream,java.io.InputStreamReader;"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String arr[]=new String[1000];
	String str;
	int a=arr.length-1;
	int d=Integer.parseInt(request.getParameter("snum2"));//每组的人数
	int count=0;
	int len=0;
	String filep=request.getParameter("getfile");
	out.println("<h4>选择的文件:</h4>");
	out.println(filep);
	out.println("<h4>输入每组的人数:</h4>");
	out.println(d);
	out.println("<hr>");
	out.println("<h4>输入匹配的数据:</h4>");
	String filePath = "D:/"+filep;
    int s=0;
    try {
    	String encoding="GBK";
        File file=new File(filePath);
        if(file.isFile() && file.exists()){ //判断文件是否存在
            InputStreamReader read = new InputStreamReader(
            new FileInputStream(file),encoding);//考虑到编码格式
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            while((lineTxt = bufferedReader.readLine()) != null){
                arr[s]=lineTxt;
                s++; 
                out.println(arr[s-1]);
            }
            read.close();    
    	}
        else{
        	out.println("找不到指定的文件");
    	}
    } catch (Exception e) {
        out.println("读取文件内容出错");
        e.printStackTrace();
    }
    while(arr[ len]!=null){
    	len++;
    }
    int q=len;
    int w=q-1;
    out.print("<hr>");
    out.println("<h4>匹配结果:</h4>");
    for(int i=0;i<q;i++){
		int e=(int) Math.round(w*Math.random());
		str=arr[e];
		arr[e]=arr[w];
		arr[w]=str;
	}
    out.println("<table border=\"1\" width=\"50%\" ");
	for(int j=0;j<q;j++){
		count++;
		if(count%d==1){
			out.print("<tr>"+"<td>"+" 第"+(count/d+1)+"组: "+"</td>");
		}
		out.print("<td>"+arr[j]+ "</td>");
		if(count%d==0){
			out.print("</tr>");
			out.print("</br>");
		}
	}
	out.println("</table>");
	%>
</body>
</html>