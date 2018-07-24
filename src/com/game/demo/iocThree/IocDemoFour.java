package com.game.demo.iocThree;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Autowired 接口注入 如果@Autowired 属性的类型是接口，这个接口被多个类实现，就会有一个问题，到底改注入哪个类呢？
 * @author wangyongguo
 *
 */
@Controller
public class IocDemoFour
{

	@Autowired
	@Qualifier("benz")
	private Car myCar;

	@RequestMapping("/iocDemoFour")
	public void index(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setHeader("content-type", "text/html;charset=UTF-8");
		String c = myCar.getCarName();
		response.getWriter().append("I am Demo Four!");
		response.getWriter().append(c);
	}

}
