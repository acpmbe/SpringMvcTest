package com.game.demo.scofi;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 通过XML文件配置依赖注入 构造器注入DEMO
 * 
 * @author wangyongguo
 *
 */
@Controller
public class IocDemoTwo
{

	private Axe myAxe;

	// 构造函数注入
	public IocDemoTwo(Axe axe)
	{
		this.myAxe = axe;
	}

	// 通过@RequestMapping为控制器指定哪些需要的请求
	@RequestMapping("/iocDemoTwo")
	public void index(HttpServletRequest request, HttpServletResponse response) throws IOException
	{

		response.setHeader("content-type", "text/html;charset=UTF-8");
		String c = myAxe.useAxe();
		response.getWriter().append("I am Demo two!");
		response.getWriter().append(c);
	}

	// 通过@RequestMapping为控制器指定哪些需要的请求
//	@RequestMapping("/iocDemoTwo_3")
//	public void index_3(HttpServletRequest request, HttpServletResponse response) throws IOException
//	{
//
//		response.setHeader("content-type", "text/html;charset=UTF-8");
//		String c = myAxe.useAxe();
//		response.getWriter().append("I am Demo two_3!");
//		response.getWriter().append(c);
//	}

}
