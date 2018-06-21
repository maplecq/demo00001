package com.slsd.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexControoler {
	@RequestMapping("/index")
	public String index(Map<String, Object> map) {

		map.put("name", "首页");
		return "index";
	}

	@RequestMapping("/demo")
	@ResponseBody
	public String get() {
		return "success";
	}

}
