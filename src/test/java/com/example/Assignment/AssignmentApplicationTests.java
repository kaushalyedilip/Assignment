package com.example.Assignment;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AssignmentApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void printStatement() {
		StringBuilder sb = new StringBuilder();
		for (int i=1; i <= 10; i++) {
			sb.append(i+",");
		}
		System.out.println(sb.substring(0, sb.length()-1));
	}

	@Test
	void areaOfTriangle() {
		float b=4,h =13,area ;
		area = ( b * h ) / 2 ;
		System.out.println("Area of Triangle is: "+area);
	}
}
