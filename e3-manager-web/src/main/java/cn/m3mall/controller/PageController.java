package cn.m3mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	// 进入后台页面
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}

	// 点击进入相应的页面
	@RequestMapping("/{Page}")
	public String showPage(@PathVariable String Page) {
		return Page;
	}

}
