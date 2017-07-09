package cn.zhouyafeng.summerstudy.controller;

import cn.zhouyafeng.summer.framework.annotation.Action;
import cn.zhouyafeng.summer.framework.annotation.Controller;
import cn.zhouyafeng.summer.framework.bean.Param;
import cn.zhouyafeng.summer.framework.bean.View;

/**
 * @author https://github.com/yaphone
 * @version 1.0
 * @date 2017/7/9 22:01
 */
@Controller
public class HelloController {

    @Action("get:/hello")
    public View helloWorld(Param param){
        System.out.println("HelloController");
        return null;
    }
}
