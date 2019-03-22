package com.xw;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class JUnit5Tests {

//	@Test
//	void firstTest() {
//		assertEquals(2, 1 + 1);
//	}
	
	@BeforeAll
	static void initAll() {
	}
	
	@BeforeEach
	void init() {
	}
	
	@Test
	@DisplayName("成功案例")
	void succeedingTest() {
	}
	
	@Test
	@DisplayName("失败案例") //金金对于采用IDE 或图形化方式展示测试运行结果的场景有效
	void failingTest() {
		fail("a failing test");
	}
	
	@Test
	@AfterEach
	void tearDown() {
	}
	
	@AfterAll
	static void tearDownAll() {
	}
}
