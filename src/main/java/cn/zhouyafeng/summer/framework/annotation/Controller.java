package cn.zhouyafeng.summer.framework.annotation;

import cn.zhouyafeng.summer.framework.bean.Param;
import cn.zhouyafeng.summer.framework.bean.View;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 控制器注解
 * 
 * @author https://github.com/yaphone
 * @date 创建时间：2017年7月2日 下午11:30:59
 * @version 1.0
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {

}
