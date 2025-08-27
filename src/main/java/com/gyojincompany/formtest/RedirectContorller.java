package com.gyojincompany.formtest;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RedirectContorller {
	
	@RequestMapping(value = "/studentInput")
	public String studentInput() {
		return "studentInput";
	}
	
	@RequestMapping(value = "/studentCheck")
	public String studentCheck(@RequestParam("sid") String sid, Model model, HttpServletResponse response) {
		
		if(sid.endsWith("tiger")) { //tiger 아이디이면 학생으로 간주
			//학생이면->studentGood, 아니면 studentNg
			return "redirect:studentGo";
			//return "studentGood";
		} else {
			return "redirect:studentNg"; //redirect: 다음에 나오는 문자열은 요청이지 jsp파일의 이름이 아님!
			//return "studentNg";
		}
		
	}
	
	@RequestMapping(value = "/studentGo")
	public String studentGood(Model model) {
		model.addAttribute("sid", "tiger");
		
		return "studentGood";
	}
	
	@RequestMapping(value = "/studentNg")
	public String studentNg(Model model) {
		model.addAttribute("sid", "tiger");
		
		return "studentNg";
	}
	
	

}
