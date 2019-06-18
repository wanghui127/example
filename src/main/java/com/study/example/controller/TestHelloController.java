package com.study.example.controller;

import com.study.example.utils.JsonResult;
import com.study.example.utils.JsonResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: example
 * @description: 启动测试
 * @author: Hui.Wang
 * @Time: $
 * @create: 2019-04-15 22:52
 **/
@Controller
public class TestHelloController  extends  JsonResultUtil{

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

    /**
     * model返回templates下的页面
     * @return
     */
    @RequestMapping(value = "/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/index.html");
        return mv;
    }

    /**
     * model返回templates下的页面
     * @return
     */
    @RequestMapping(value = "/index1")
    public String index1(){
        return "/index.html";
    }

    /**
     * model返回templates下的页面
     * @return
     */
    @RequestMapping(value = "/index2")
    public String index2(){
        return "index";
    }

    /**
     * model返回templates下的页面
     * @return
     */
    @RequestMapping(value = "/index3")
    @ResponseBody
    public JsonResult index3(){
        return this.successRender().message("jsonResult.succeed");
    }
}
