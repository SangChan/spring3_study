package com.spring.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import scala.annotation.meta.getter;

import com.spring.web.model.RequestModel;

@Controller
public class HelloWorld {
	@RequestMapping("/helloWorld")
	public String helloWorld() {
		System.out.println("HelloWorld 콘솔콘솔");
		return "helloWorld";
	}
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	@RequestMapping("/request")
	public void request(RequestModel model) {
		System.out.println("제목:"+model.getTitle());
		System.out.println("내용:"+model.getContent());
	}
	@RequestMapping("/response")
	public String response(Model model) {
		model.addAttribute("value1", "값넘기기1");
		model.addAttribute("value2", "값넘기기2");
		return "response";
	}
	@RequestMapping("/formFile")
	public String formFile() {
		return "formFile";
	}
	@RequestMapping("/requestFile")
	public void requestFile(RequestModel model) {
		System.out.println("파일명:"+model.getFile().getOriginalFilename());
		System.out.println("파일사이:"+model.getFile().getSize());
	}
}
