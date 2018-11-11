package com.flower.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flower.pojo.User;
import com.flower.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 登录
	 * @param user
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("user/login.html")
	public String login(User user, Model model, HttpSession session) {
		
		User u = userService.getUserByUsername(user);
		
		if(u != null) {
			if(u.getPassword().equals(user.getPassword())) {
				// 登陆成功
				session.setAttribute("user", u);
				return "home";
			}else {
				model.addAttribute("error", "用户名或密码错误！");
				return "index";
			}
		}else {
			model.addAttribute("error", "用户名或密码错误！");
			return "index";
		}
		
	}
	
	/**
	 * 注销登录（没有使用）
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("user/logout.html")
	public String logout(Model model, HttpSession session) {
		
		session.removeAttribute("user");
		
		return "index";
	}
	
	/**
	 * 注册
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping("user/register.html")
	public String register(User user, Model model) {
		
		User u = userService.getUserByUsername(user);
		
		if(u != null) {
			// 存在
			model.addAttribute("error", "该用户已存在！");
			return "register";
		}
		
		userService.insertUser(user);
		model.addAttribute("error", "注册成功！请登录");
		
		return "index";
	}
	
}
