package com.cos.demo.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BlogControllerTest {
	@GetMapping("/test/Hello")
	public String Hello() {
		return "<h1>hello</h1>";
	}
}
