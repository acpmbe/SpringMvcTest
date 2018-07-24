package com.game.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Helloworld
{

	@RequestMapping("/helloworld") // 此处控制浏览器里访问路径 具体为：/SpringDemo/helloworld
	public void helloWorld(HttpServletRequest request, HttpServletResponse response) throws IOException
	{

		// 输出字符串

		String Content = "hello world" + "<br>" + "<h1>你好</h1>" + "<br>" + "hello world123";

		response.getWriter().append(Content);

	}

}
