package com.gyojincompany.formtest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request, Model model) {
		return "login";
	}
	
	@RequestMapping(value = "/login2")
	public String login2(HttpServletRequest request, Model model) {
		return "login2";
	}
	
	@RequestMapping(value = "/loginOk")
	public String loginOk(HttpServletRequest request, Model model, HttpSession session, HttpServletResponse response) {
		
		String mid = request.getParameter("mid"); //클라이언트가 입력한 아이디값 불러오기
		String mpw = request.getParameter("mpw"); //클라이언트가 입력한 비밀번호값 불러오기
		model.addAttribute("mid", mid);
		if(mid.equals("tiger") && mpw.equals("12345")) { //참이면 로그인 성공
			session.setAttribute("sessionId", mid); //세션에 로그인한 아이디 올리기		
			return "loginOk";
		} else { //로그인 실패
		
			return "loginFail";
		}
	}
	
	@RequestMapping(value = "/loginOk2")
	public String loginOk2(@RequestParam("mid") String mid, @RequestParam("mpw") String mpw,  Model model, HttpSession session, HttpServletResponse response) {
		
//		String mid = request.getParameter("mid"); //클라이언트가 입력한 아이디값 불러오기
//		String mpw = request.getParameter("mpw"); //클라이언트가 입력한 비밀번호값 불러오기
		
		model.addAttribute("mid", mid);
		if(mid.equals("tiger") && mpw.equals("12345")) { //참이면 로그인 성공
			session.setAttribute("sessionId", mid); //세션에 로그인한 아이디 올리기		
			return "loginOk";
		} else { //로그인 실패
		
			return "loginFail";
		}
	}

}
