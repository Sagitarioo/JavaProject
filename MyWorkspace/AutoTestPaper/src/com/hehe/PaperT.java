package com.hehe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class PaperT {
	static int qxznum;
	static int qpdnum;
	static int qtknum;
	static int qbcnum;
	public void PaperAutot(int qxz,int qpd,int qtk,int qbc){
		qxznum=qxz;//ѡ������Ŀ
		qpdnum=qpd;//�ж�����Ŀ
		qtknum=qtk;//�������Ŀ
		qbcnum=qbc;//�������Ŀ
		
		int sum_xz=20;//ѡ��������Ŀ
		int sum_pd=20;//�ж�������Ŀ
		int sum_tk=20;//���������Ŀ
		int sum_bc=20;//���������Ŀ
		String filestr="";
		String filestr1="";
		String bfile[]={""};
		String bfile1[]={""};
		String a[]={""};//����ѡ����
		String b[]={""};//�����ж���
		String c[]={""};//���������
		String d[]={""};//��������
		String a1[]={""};//����ѡ����
		String b1[]={""};//�����ж���
		String c1[]={""};//���������
		String d1[]={""};//��������
		int straa;
		int arrasum[]=new int[sum_xz];//���������ɵ�ѡ����
		int arrbsum[]=new int[sum_pd];//���������ɵ��ж���
		int arrcsum[]=new int[sum_tk];//���������ɵ������
		int arrdsum[]=new int[sum_bc];//���������ɵı����
		
		//����������е�ѡ����
		for(int ia=0;ia<sum_xz;ia++){
			arrasum[ia]=ia+1;
		}
		for(int ia=0;ia<arrasum.length;ia++){
			int e=(int) Math.round((arrasum.length-1)*Math.random());
			straa=arrasum[e];
			arrasum[e]=arrasum[arrasum.length-1];
			arrasum[arrasum.length-1]=straa;
		}
		//����������е��ж���
		for(int ia=0;ia<sum_xz;ia++){
			arrbsum[ia]=ia+1;
		}
		for(int ia=0;ia<arrbsum.length;ia++){
			int e=(int) Math.round((arrbsum.length-1)*Math.random());
			straa=arrbsum[e];
			arrbsum[e]=arrbsum[arrbsum.length-1];
			arrbsum[arrbsum.length-1]=straa;
		}
		//����������е������
		for(int ia=0;ia<sum_tk;ia++){
			arrcsum[ia]=ia+1;
		}
		for(int ia=0;ia<arrcsum.length;ia++){
			int e=(int) Math.round((arrcsum.length-1)*Math.random());
			straa=arrcsum[e];
			arrcsum[e]=arrcsum[arrcsum.length-1];
			arrcsum[arrcsum.length-1]=straa;
		}
		//����������еı����
		for(int ia=0;ia<sum_xz;ia++){
			arrdsum[ia]=ia+1;
		}
		for(int ia=0;ia<arrdsum.length;ia++){
			int e=(int) Math.round((arrdsum.length-1)*Math.random());
			straa=arrdsum[e];
			arrdsum[e]=arrdsum[arrdsum.length-1];
			arrdsum[arrdsum.length-1]=straa;
		}
		//��ȡѡ����
		for(int i=0;i<qxznum;i++){
			String filePath = "D:/paper/question/xuanze/"+arrasum[i]+".txt";
		    String stra="";//������Ŀ
		    String filePath1 = "D:/paper/answer/xuanze/"+arrasum[i]+".txt";
		    String stra1="";//�����
		    try {
	        	String encoding="GBK";
	            File file=new File(filePath);
	            if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
	                InputStreamReader read = new InputStreamReader(
	                new FileInputStream(file),encoding);//���ǵ������ʽ
	                BufferedReader bufferedReader = new BufferedReader(read);
	                String lineTxt = null;
	                while((lineTxt = bufferedReader.readLine()) != null){
	                	stra=stra+lineTxt+",";
	                }
	                read.close();
	                a=stra.split(",");
	                for(int m=0;m<a.length;m++){
	                	System.out.println(a[m]);
	                }
		        }
	            else{
		            System.out.println("�Ҳ���ָ�����ļ�");
		        }
	        } catch (Exception e) {
	            System.out.println("��ȡ�ļ����ݳ���");
	            e.printStackTrace();
	        }
		    filestr=filestr+stra;
	        bfile=filestr.split(",");
		    
		    try {
	        	String encoding="GBK";
	            File file1=new File(filePath1);
	            if(file1.isFile() && file1.exists()){ //�ж��ļ��Ƿ����
	                InputStreamReader read = new InputStreamReader(
	                new FileInputStream(file1),encoding);//���ǵ������ʽ
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
		            System.out.println("�Ҳ���ָ�����ļ�");
		        }
	        } catch (Exception e) {
	            System.out.println("��ȡ�ļ����ݳ���");
	            e.printStackTrace();
	        }
	        filestr1=filestr1+stra1;
	        bfile1=filestr1.split(",");
	        
		}
		//��ȡ�ж���
		for(int j=0;j<qpdnum;j++){
			String filePath = "D:/paper/question/panduan/"+arrbsum[j]+".txt";
		    String strb="";
		    String filePath1 = "D:/paper/answer/panduan/"+arrbsum[j]+".txt";
		    String strb1="";
		    try {
	        	String encoding="GBK";
	            File file=new File(filePath);
	            if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
	                InputStreamReader read = new InputStreamReader(
	                new FileInputStream(file),encoding);//���ǵ������ʽ
	                BufferedReader bufferedReader = new BufferedReader(read);
	                String lineTxt = null;
	                while((lineTxt = bufferedReader.readLine()) != null){
	                	strb=strb+lineTxt+",";
	                }
	                read.close();
	                b=strb.split(",");
	                for(int m=0;m<b.length;m++){
	                	System.out.println(b[m]);
	                }
		        }
	            else{
		            System.out.println("�Ҳ���ָ�����ļ�");
		        }
	        } catch (Exception e) {
	            System.out.println("��ȡ�ļ����ݳ���");
	            e.printStackTrace();
	        }
	        filestr=filestr+strb;
	        bfile=filestr.split(",");
	        try {
	        	String encoding="GBK";
	            File file1=new File(filePath1);
	            if(file1.isFile() && file1.exists()){ //�ж��ļ��Ƿ����
	                InputStreamReader read1 = new InputStreamReader(
	                new FileInputStream(file1),encoding);//���ǵ������ʽ
	                BufferedReader bufferedReader1 = new BufferedReader(read1);
	                String lineTxt1 = null;
	                while((lineTxt1 = bufferedReader1.readLine()) != null){
	                	strb1=strb1+lineTxt1+",";
	                }
	                read1.close();
	                b1=strb1.split(",");
	            }
	            else{
		            System.out.println("�Ҳ���ָ�����ļ�");
		        }
	        } catch (Exception e) {
	            System.out.println("��ȡ�ļ����ݳ���");
	            e.printStackTrace();
	        }
	        filestr1=filestr1+strb1;
	        bfile1=filestr1.split(",");
	    }
		//��ȡ�����
		for(int u=0;u<qtknum;u++){
			String filePath = "D:/paper/question/tiankong/"+arrcsum[u]+".txt";
		    String strc="";
		    String filePath1 = "D:/paper/answer/tiankong/"+arrcsum[u]+".txt";
		    String strc1="";
		    try {
	        	String encoding="GBK";
	            File file=new File(filePath);
	            if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
	                InputStreamReader read = new InputStreamReader(
	                new FileInputStream(file),encoding);//���ǵ������ʽ
	                BufferedReader bufferedReader = new BufferedReader(read);
	                String lineTxt = null;
	                while((lineTxt = bufferedReader.readLine()) != null){
	                	strc=strc+lineTxt+",";
	                }
	                read.close();
	                c=strc.split(",");
	                for(int m=0;m<c.length;m++){
	                	System.out.println(c[m]);
	                }
		        }
	            else{
		            System.out.println("�Ҳ���ָ�����ļ�");
		        }
	        } catch (Exception e) {
	            System.out.println("��ȡ�ļ����ݳ���");
	            e.printStackTrace();
	        }
	        filestr=filestr+strc;
	        bfile=filestr.split(",");
	        try {
	        	String encoding="GBK";
	            File file1=new File(filePath1);
	            if(file1.isFile() && file1.exists()){ //�ж��ļ��Ƿ����
	                InputStreamReader read1 = new InputStreamReader(
	                new FileInputStream(file1),encoding);//���ǵ������ʽ
	                BufferedReader bufferedReader1 = new BufferedReader(read1);
	                String lineTxt1 = null;
	                while((lineTxt1 = bufferedReader1.readLine()) != null){
	                	strc1=strc1+lineTxt1+",";
	                }
	                read1.close();
	                c1=strc1.split(",");
	            }
	            else{
		            System.out.println("�Ҳ���ָ�����ļ�");
		        }
	        } catch (Exception e) {
	            System.out.println("��ȡ�ļ����ݳ���");
	            e.printStackTrace();
	        }
	        filestr1=filestr1+strc1;
	        bfile1=filestr1.split(",");
	    }
		//��ȡ�����
		for(int v=0;v<qbcnum;v++){
			String filePath = "D:/paper/question/biancheng/"+arrdsum[v]+".txt";
		    String strd="";
		    String filePath1 = "D:/paper/answer/biancheng/"+arrdsum[v]+".txt";
		    String strd1="";
		    try {
	        	String encoding="GBK";
	            File file=new File(filePath);
	            if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
	                InputStreamReader read = new InputStreamReader(
	                new FileInputStream(file),encoding);//���ǵ������ʽ
	                BufferedReader bufferedReader = new BufferedReader(read);
	                String lineTxt = null;
	                while((lineTxt = bufferedReader.readLine()) != null){
	                	strd=strd+lineTxt+",";
	                }
	                read.close();
	                d=strd.split(",");
	                for(int m=0;m<d.length;m++){
	                	System.out.println(d[m]);
	                }
		        }
	            else{
		            System.out.println("�Ҳ���ָ�����ļ�");
		        }
	        } catch (Exception e) {
	            System.out.println("��ȡ�ļ����ݳ���");
	            e.printStackTrace();
	        }
	        filestr=filestr+strd;
	        bfile=filestr.split(",");
	        try {
	        	String encoding="GBK";
	            File file1=new File(filePath1);
	            if(file1.isFile() && file1.exists()){ //�ж��ļ��Ƿ����
	                InputStreamReader read1 = new InputStreamReader(
	                new FileInputStream(file1),encoding);//���ǵ������ʽ
	                BufferedReader bufferedReader1 = new BufferedReader(read1);
	                String lineTxt1 = null;
	                while((lineTxt1 = bufferedReader1.readLine()) != null){
	                	strd1=strd1+lineTxt1+",";
	                }
	                read1.close();
	                d1=strd1.split(",");
	            }
	            else{
		            System.out.println("�Ҳ���ָ�����ļ�");
		        }
	        } catch (Exception e) {
	            System.out.println("��ȡ�ļ����ݳ���");
	            e.printStackTrace();
	        }
	        filestr1=filestr1+strd1;
	        bfile1=filestr1.split(",");
	    }
		//�ļ�д��
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
	}

}

