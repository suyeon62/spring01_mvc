package com.example.part02;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

//http://localhost:8090/hellomodel

//{"num":1, "name":"홍길동", "age":30, "loc":"서울"}

@Slf4j
@RestController
public class HelloPostController {
	@PostMapping("/hellomodel")
	public MemDTO postExecute(@RequestBody MemDTO dto) {
		log.info("dto {}",dto);
		return dto;
	}
}
