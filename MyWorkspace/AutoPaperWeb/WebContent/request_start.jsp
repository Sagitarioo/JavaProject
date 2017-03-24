<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.io.BufferedReader,java.io.BufferedWriter,java.io.File,java.io.FileInputStream,java.io.FileWriter,java.io.InputStreamReader"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>答题系统</title>
</head>
<body>
<%
		int qxznum=Integer.parseInt(request.getParameter("xz_input"));//选择题数目
		int qpdnum=Integer.parseInt(request.getParameter("pd_input"));//判断题数目
		int qtknum=Integer.parseInt(request.getParameter("tk_input"));//填空题数目
		int qbcnum=Integer.parseInt(request.getParameter("bc_input"));//编程题数目
		//String aaaa=request.getParameter("1");
		//out.print(aaaa);
		
		int sum_xz=20;//选择题总数目
		int sum_pd=20;//判断题总数目
		int sum_tk=20;//填空题总数目
		int sum_bc=20;//编程题总数目
		String filestr="";
		String filestr1="";
		String bfile[]={""};
		String bfile1[]={""};
		String a[]={""};//保存选择题
		String b[]={""};//保存判断题
		String c[]={""};//保存填空题
		String d[]={""};//保存编程题
		String a1[]={""};//保存选择题
		String b1[]={""};//保存判断题
		String c1[]={""};//保存填空题
		String d1[]={""};//保存编程题
		int straa;
		int arrasum[]=new int[sum_xz];//存放随机生成的选择题
		int arrbsum[]=new int[sum_pd];//存放随机生成的判断题
		int arrcsum[]=new int[sum_tk];//存放随机生成的填空题
		int arrdsum[]=new int[sum_bc];//存放随机生成的编程题
		
		//生成随机排列的选择题
		for(int ia=0;ia<sum_xz;ia++){
			arrasum[ia]=ia+1;
		}
		for(int ia=0;ia<arrasum.length;ia++){
			int e=(int) Math.round((arrasum.length-1)*Math.random());
			straa=arrasum[e];
			arrasum[e]=arrasum[arrasum.length-1];
			arrasum[arrasum.length-1]=straa;
		}
		//生成随机排列的判断题
		for(int ia=0;ia<sum_xz;ia++){
			arrbsum[ia]=ia+1;
		}
		for(int ia=0;ia<arrbsum.length;ia++){
			int e=(int) Math.round((arrbsum.length-1)*Math.random());
			straa=arrbsum[e];
			arrbsum[e]=arrbsum[arrbsum.length-1];
			arrbsum[arrbsum.length-1]=straa;
		}
		//生成随机排列的填空题
		for(int ia=0;ia<sum_tk;ia++){
			arrcsum[ia]=ia+1;
		}
		for(int ia=0;ia<arrcsum.length;ia++){
			int e=(int) Math.round((arrcsum.length-1)*Math.random());
			straa=arrcsum[e];
			arrcsum[e]=arrcsum[arrcsum.length-1];
			arrcsum[arrcsum.length-1]=straa;
		}
		//生成随机排列的编程题
		for(int ia=0;ia<sum_xz;ia++){
			arrdsum[ia]=ia+1;
		}
		for(int ia=0;ia<arrdsum.length;ia++){
			int e=(int) Math.round((arrdsum.length-1)*Math.random());
			straa=arrdsum[e];
			arrdsum[e]=arrdsum[arrdsum.length-1];
			arrdsum[arrdsum.length-1]=straa;
		}
		//读取选择题
		out.println("<h2 style=\"text-align:center\">XX公司内部测试题</h2>"+"<br>");
		out.println("<h4>一、选择题</h4>"+"<br>");
		for(int i=0;i<qxznum;i++){
			String filePath = "D:/paper/question/xuanze/"+arrasum[i]+".txt";
		    String stra="";//保存题目
		    String filePath1 = "D:/paper/answer/xuanze/"+arrasum[i]+".txt";
		    String stra1="";//保存答案
		    try {
	        	String encoding="GBK";
	            File file=new File(filePath);
	            if(file.isFile() && file.exists()){ //判断文件是否存在
	                InputStreamReader read = new InputStreamReader(
	                new FileInputStream(file),encoding);//考虑到编码格式
	                BufferedReader bufferedReader = new BufferedReader(read);
	                String lineTxt = null;
	                while((lineTxt = bufferedReader.readLine()) != null){
	                	stra=stra+lineTxt+",";
	                }
	                read.close();
	                a=stra.split(",");
	                for(int m=0;m<a.length;m++){
	                	if(m%2==0){
	                		out.println(i+1+"."+a[m]+"<input type=\"radio\" name=\""+arrasum[i]+"\" value=\"aaa\">A"+
	                	"<input type=\"radio\" name=\""+arrasum[i]+"\" value=\"aaa\">B"+
	                		"<input type=\"radio\" name=\""+arrasum[i]+"\" value=\"aaa\">C"
	                				+"<input type=\"radio\" name=\""+arrasum[i]+"\" value=\"aaa\">D"+"<br>"+"<br>");
	                	}
	                	else{
	                		out.println(a[m]+"<br>"+"<br>");
	                	}
	                }
	            }
	            else{
		            System.out.println("找不到指定的文件");
		        }
	        } catch (Exception e) {
	            System.out.println("读取文件内容出错");
	            e.printStackTrace();
	        }
		    filestr=filestr+stra;
	        bfile=filestr.split(",");
		    
		    try {
	        	String encoding="GBK";
	            File file1=new File(filePath1);
	            if(file1.isFile() && file1.exists()){ //判断文件是否存在
	                InputStreamReader read = new InputStreamReader(
	                new FileInputStream(file1),encoding);//考虑到编码格式
	                BufferedReader bufferedReader1 = new BufferedReader(read);
	                String lineTxt1 = null;
	                while((lineTxt1 = bufferedReader1.readLine()) != null){
	                	stra1=stra1+lineTxt1+",";
	                }
	                read.close();
	                a1=stra1.split(",");
	                /*for(int m=0;m<a1.length;m++){
	                	System.out.println(a1[m]);
	                }*/
		        }
	            else{
		            System.out.println("找不到指定的文件");
		        }
	        } catch (Exception e) {
	            System.out.println("读取文件内容出错");
	            e.printStackTrace();
	        }
	        filestr1=filestr1+stra1;
	        bfile1=filestr1.split(",");
	        
		}
		//读取判断题
		out.println("<h4>二、判断题<h4>"+"<br>");
		for(int j=0;j<qpdnum;j++){
			String filePath = "D:/paper/question/panduan/"+arrbsum[j]+".txt";
		    String strb="";
		    String filePath1 = "D:/paper/answer/panduan/"+arrbsum[j]+".txt";
		    String strb1="";
		    try {
	        	String encoding="GBK";
	            File file=new File(filePath);
	            if(file.isFile() && file.exists()){ //判断文件是否存在
	                InputStreamReader read = new InputStreamReader(
	                new FileInputStream(file),encoding);//考虑到编码格式
	                BufferedReader bufferedReader = new BufferedReader(read);
	                String lineTxt = null;
	                while((lineTxt = bufferedReader.readLine()) != null){
	                	strb=strb+lineTxt+",";
	                }
	                read.close();
	                b=strb.split(",");
	                for(int m=0;m<b.length;m++){
	                	if(m%2==0){
	                		out.println(j+1+"."+b[m]+"<input type=\"radio\" name=\""+arrbsum[j]+"\" value=\"aaa\">T"+
	                	"<input type=\"radio\" name=\""+arrbsum[j]+"\" value=\"aaa\">F"+"<br>"+"<br>");
	                	}
	                	else{
	                		out.println(b[m]+"<br>"+"<br>");
	                	}
	                }
		        }
	            else{
		            System.out.println("找不到指定的文件");
		        }
	        } catch (Exception e) {
	            System.out.println("读取文件内容出错");
	            e.printStackTrace();
	        }
	        filestr=filestr+strb;
	        bfile=filestr.split(",");
	        try {
	        	String encoding="GBK";
	            File file1=new File(filePath1);
	            if(file1.isFile() && file1.exists()){ //判断文件是否存在
	                InputStreamReader read1 = new InputStreamReader(
	                new FileInputStream(file1),encoding);//考虑到编码格式
	                BufferedReader bufferedReader1 = new BufferedReader(read1);
	                String lineTxt1 = null;
	                while((lineTxt1 = bufferedReader1.readLine()) != null){
	                	strb1=strb1+lineTxt1+",";
	                }
	                read1.close();
	                b1=strb1.split(",");
	            }
	            else{
		            System.out.println("找不到指定的文件");
		        }
	        } catch (Exception e) {
	            System.out.println("读取文件内容出错");
	            e.printStackTrace();
	        }
	        filestr1=filestr1+strb1;
	        bfile1=filestr1.split(",");
	    }
		//读取填空题
		out.println("<h4>三、填空题</h4>"+"<br>");
		for(int u=0;u<qtknum;u++){
			String filePath = "D:/paper/question/tiankong/"+arrcsum[u]+".txt";
		    String strc="";
		    String filePath1 = "D:/paper/answer/tiankong/"+arrcsum[u]+".txt";
		    String strc1="";
		    try {
	        	String encoding="GBK";
	            File file=new File(filePath);
	            if(file.isFile() && file.exists()){ //判断文件是否存在
	                InputStreamReader read = new InputStreamReader(
	                new FileInputStream(file),encoding);//考虑到编码格式
	                BufferedReader bufferedReader = new BufferedReader(read);
	                String lineTxt = null;
	                while((lineTxt = bufferedReader.readLine()) != null){
	                	strc=strc+lineTxt+",";
	                }
	                read.close();
	                c=strc.split(",");
	                for(int m=0;m<c.length;m++){
	                	if(m%2==0){
	                		out.println(u+1+"."+c[m]+"请填入<input type=\"text\" name=\""+arrcsum[u]+"\" >"+"<br>"+"<br>");
	                	}
	                	else{
	                		out.println(c[m]+"<br>"+"<br>");
	                	}
	                }
		        }
	            else{
		            System.out.println("找不到指定的文件");
		        }
	        } catch (Exception e) {
	            System.out.println("读取文件内容出错");
	            e.printStackTrace();
	        }
	        filestr=filestr+strc;
	        bfile=filestr.split(",");
	        try {
	        	String encoding="GBK";
	            File file1=new File(filePath1);
	            if(file1.isFile() && file1.exists()){ //判断文件是否存在
	                InputStreamReader read1 = new InputStreamReader(
	                new FileInputStream(file1),encoding);//考虑到编码格式
	                BufferedReader bufferedReader1 = new BufferedReader(read1);
	                String lineTxt1 = null;
	                while((lineTxt1 = bufferedReader1.readLine()) != null){
	                	strc1=strc1+lineTxt1+",";
	                }
	                read1.close();
	                c1=strc1.split(",");
	            }
	            else{
		            System.out.println("找不到指定的文件");
		        }
	        } catch (Exception e) {
	            System.out.println("读取文件内容出错");
	            e.printStackTrace();
	        }
	        filestr1=filestr1+strc1;
	        bfile1=filestr1.split(",");
	    }
		//读取编程题
		out.println("<h4>四、编程题</h4>"+"<br>");
		for(int v=0;v<qbcnum;v++){
			String filePath = "D:/paper/question/biancheng/"+arrdsum[v]+".txt";
		    String strd="";
		    String filePath1 = "D:/paper/answer/biancheng/"+arrdsum[v]+".txt";
		    String strd1="";
		    try {
	        	String encoding="GBK";
	            File file=new File(filePath);
	            if(file.isFile() && file.exists()){ //判断文件是否存在
	                InputStreamReader read = new InputStreamReader(
	                new FileInputStream(file),encoding);//考虑到编码格式
	                BufferedReader bufferedReader = new BufferedReader(read);
	                String lineTxt = null;
	                while((lineTxt = bufferedReader.readLine()) != null){
	                	strd=strd+lineTxt+",";
	                }
	                read.close();
	                d=strd.split(",");
	                for(int m=0;m<d.length;m++){
	                	if(m%2==0){
	                		out.println(v+1+"."+d[m]+"<br>"+"<textarea type=\"text\" name=\""+arrdsum[v]+"\" style=\"width:500px;height:200px\" ></textarea>"+"<br>"+"<br>");
	                	}
	                	else{
	                		out.println(d[m]+"<br>"+"<br>");
	                	}
	                }
		        }
	            else{
		            System.out.println("找不到指定的文件");
		        }
	        } catch (Exception e) {
	            System.out.println("读取文件内容出错");
	            e.printStackTrace();
	        }
	        filestr=filestr+strd;
	        bfile=filestr.split(",");
	        try {
	        	String encoding="GBK";
	            File file1=new File(filePath1);
	            if(file1.isFile() && file1.exists()){ //判断文件是否存在
	                InputStreamReader read1 = new InputStreamReader(
	                new FileInputStream(file1),encoding);//考虑到编码格式
	                BufferedReader bufferedReader1 = new BufferedReader(read1);
	                String lineTxt1 = null;
	                while((lineTxt1 = bufferedReader1.readLine()) != null){
	                	strd1=strd1+lineTxt1+",";
	                }
	                read1.close();
	                d1=strd1.split(",");
	            }
	            else{
		            System.out.println("找不到指定的文件");
		        }
	        } catch (Exception e) {
	            System.out.println("读取文件内容出错");
	            e.printStackTrace();
	        }
	        filestr1=filestr1+strd1;
	        bfile1=filestr1.split(",");
	    }
		//文件写入
		File filew=new File("D:/work1.txt");
		File filew1=new File("D:/answer1.txt");
		try{
			FileWriter fw=new FileWriter(filew,true);
			BufferedWriter bufw=new BufferedWriter(fw);
			for(int k=0;k<bfile.length;k++){
				bufw.write(bfile[k]);
				bufw.newLine();
				bufw.newLine();
			}
			bufw.close();
			fw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			FileWriter fw1=new FileWriter(filew1,true);
			BufferedWriter bufw1=new BufferedWriter(fw1);
			for(int k=0;k<bfile1.length;k++){
				bufw1.write(bfile1[k]);
				bufw1.newLine();
				bufw1.newLine();
			}
			bufw1.close();
			fw1.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	




%>
</body>
</html>