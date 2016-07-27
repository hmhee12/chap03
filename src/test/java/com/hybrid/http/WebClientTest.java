package com.hybrid.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.Scanner;

public class WebClientTest {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
//		GET();
		POST();
	}
		
	
	static void POST() throws UnknownHostException, IOException{
		System.out.println("START....");
		
		Socket sok = new Socket("localhost", 8080);
		PrintWriter requset = new PrintWriter(sok.getOutputStream());
		Scanner response = new Scanner(sok.getInputStream());
		
		/*
		 * Request 전문 송신
		 */
		String body ="name=" + URLEncoder.encode("홍길동","utf-8") + " &addr=" + URLEncoder.encode("서울 마포구","utf-8");
		System.out.println(body);
		System.out.println(body.length());
		
		requset.println("POST /Hello.jsp HTTP/1.1");
		requset.println("HOST:localhost:8080");
		requset.println("Content-type:application/x-www-form-urlencoded");
		requset.println("Content-Length:"+body.length());
		requset.println();
		requset.println(body);
		requset.flush();
		// flush - 서버로 날라감
		/*
		 * Response 전문 수신
		 */
		while(response.hasNextLine()){
			String line = response.nextLine();
			System.out.println(line);
			if(line.toLowerCase().lastIndexOf("</html>") != -1) {
				break;
			}
		}
		
		sok.close();
		
		
		
		System.out.println("END....");
		
	}
	
	static void GET() throws UnknownHostException, IOException{
	
		System.out.println("Start...");
		
		Socket sok = new Socket("localhost",8080);
		InputStream in= sok.getInputStream();
		OutputStream out = sok.getOutputStream();
		
		PrintWriter request = new PrintWriter(out);
		Scanner response = new Scanner(in);
		
		//전문
		String name = "홍 길동";
		// 스페이스 특수문자 encoding 해야함 
		name = URLEncoder.encode(name);
		System.out.println("name = " +name);
		
		request.println("GET /Hello.jsp?name="+name+"addr=서울 HTTP/1.1");
		request.println("HOST:localhost:8080");
		request.println();
		request.println();
		request.flush();
		//전문 끝
		while(response.hasNextLine()){
			String line = response.nextLine();
			System.out.println(line);
			if(line.toLowerCase().lastIndexOf("</html>") != -1) {
				break;
			}
		}
		
		sok.close();
		
		System.out.println("END....");
		
		
		
	}
	
}
		
