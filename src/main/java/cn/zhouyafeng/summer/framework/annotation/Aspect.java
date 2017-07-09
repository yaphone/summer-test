package cn.zhouyafeng.summer.framework.annotation;

import java.lang.annotation.*;

/**
 * 切面注解
 * 
 * @author https://github.com/yaphone
 * @date 创建时间：2017年7月5日 下午11:00:12
 * @version 1.0
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

	Class<? extends Annotation> value();

}
