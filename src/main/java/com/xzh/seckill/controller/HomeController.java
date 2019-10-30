package com.xzh.seckill.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主页
 *
 * @author: 向振华
 * @date: 2019/10/30 10:38
 */
@RequestMapping("/home")
@RestController
public class HomeController {

	@GetMapping
	public String test() {
		return "success!";
	}
}
