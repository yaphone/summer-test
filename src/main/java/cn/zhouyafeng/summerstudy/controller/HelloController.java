package cn.zhouyafeng.summerstudy.controller;

import cn.zhouyafeng.summer.framework.annotation.Action;
import cn.zhouyafeng.summer.framework.annotation.Controller;
import cn.zhouyafeng.summer.framework.annotation.Inject;
import cn.zhouyafeng.summer.framework.bean.Param;
import cn.zhouyafeng.summer.framework.bean.View;
import cn.zhouyafeng.summerstudy.service.face.HelloWorldServiceImpl;

/**
 * @author https://github.com/yaphone
 * @version 1.0
 * @date 2017/7/9 22:01
 */
@Controller
public class HelloController {

	@Inject
	private HelloWorldServiceImpl helloWorldService;

	@Action("get:/yaphone")
	public View helloWorld(Param param) {
		helloWorldService.sayHello();
		return null;
	}
}
