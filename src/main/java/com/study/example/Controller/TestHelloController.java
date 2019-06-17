package com.study.example.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: example
 * @description: 启动测试
 * @author: Hui.Wang
 * @Time: $
 * @create: 2019-04-15 22:52
 **/
@RestController
public class TestHelloController {

    /**
    * @Description:  springBoot启动测试
    * @Param:  null
    * @return:  String
    * @Author: Hui.Wang
    * @Date: 2019/4/15 0015
    * @Time: 22:54
    */
    @RequestMapping(value = "/hi/{id}")
    public String sayHello(@PathVariable("id") String id){
        return "hello springBoot!"+id;
    }

    @RequestMapping(value = "/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/index.html");
        return mv;
    }
}
