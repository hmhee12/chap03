package com.hybrid.http;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

public class SpringWebClientTest {

	public static void main(String[] args) {
//		GET();
		POST();
	}
	
	static void POST() {
		System.out.println("START SPRING....");
		

		LinkedMultiValueMap<String, String> pramas = new LinkedMultiValueMap<>();
		pramas.add("name", "홍길덩");
		pramas.add("addr", "부산 부산..");
		
		RestTemplate rest = new RestTemplate();
		
		String body = rest.postForObject("http://localhost:8080/Hello.jsp", pramas, String.class);
		
		System.out.println(body);
		
		System.out.println("END SPRING");
	}
	
	static void GET() {
		System.out.println("START SPRING....");
		
		RestTemplate rest = new RestTemplate();
		String body = rest.getForObject("http://localhost:8080/Hello.jsp?name={name}&addr={addr}", String.class, "홍길동" ,"서울 마포구");
		System.out.println(body);
		
		System.out.println("END SPRING");
		
	}
}
