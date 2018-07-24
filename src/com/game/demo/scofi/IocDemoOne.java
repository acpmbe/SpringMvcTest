package com.game.demo.scofi;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 通过XML文件配置依赖注入
 * SET方法注入demo
 * @author wangyongguo
 *
 */
@Controller
public class IocDemoOne
{

	private Axe myAxe;

	// 通过@RequestMapping为控制器指定哪些需要的请求
	@RequestMapping("/iocDemoOne")
	public void index(HttpServletRequest request, HttpServletResponse response) throws IOException
	{

		response.setHeader("content-type", "text/html;charset=UTF-8");
		String c = myAxe.useAxe();
		response.getWriter().append("I am Demo one!");
		response.getWriter().append(c);
	}

	public void setAxe(Axe axe)
	{
		this.myAxe = axe;
	}

}
