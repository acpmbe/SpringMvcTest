package com.game.demo.iocTwo;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.game.demo.scofi.Axe;

@Controller
public class IocDemoThree
{

	@Autowired
	private Axe myAxe;

	@RequestMapping("/iocDemoThree")
	public void index(HttpServletRequest request, HttpServletResponse response) throws IOException
	{

		response.setHeader("content-type", "text/html;charset=UTF-8");
		String c = myAxe.useAxe();
		response.getWriter().append("I am Demo Three 123!");
		response.getWriter().append(c);
	}

}
