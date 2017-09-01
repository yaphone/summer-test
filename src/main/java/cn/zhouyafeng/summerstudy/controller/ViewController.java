package cn.zhouyafeng.summerstudy.controller;

import cn.zhouyafeng.summer.framework.annotation.Action;
import cn.zhouyafeng.summer.framework.annotation.Controller;
import cn.zhouyafeng.summer.framework.bean.Param;
import cn.zhouyafeng.summer.framework.bean.View;

@Controller
public class ViewController {

    @Action("get:/customer")
    public View index(Param param){
        return new View("customer.jsp");
    }
}
