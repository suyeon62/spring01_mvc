package com.example.part01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
//https://www.json.org/json-en.html
//@ResponseBody : 자바객체를 JSON으로 변환해주는 역할
//@RequestBody : JSON을 자바객체로 변환해주는 역할

@Slf4j
//@Controller
@RestController	//@Controller+@ResponseBody
public class Hello {
	
	//http://localhost:8090/hello
	//@ResponseBody
	@GetMapping("/hello") //@RequestMapping("/hello")
	public String process() {
		log.info("info","hello world");
		return "hello world";
	}
}
