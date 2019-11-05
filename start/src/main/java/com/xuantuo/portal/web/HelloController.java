package com.xuantuo.portal.web;

import com.xuantuo.portal.result.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/5
 **/
@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    @ResponseBody
    public JsonResult sayHi(String query){
        JsonResult jsonResult = JsonResult.newResult();
        jsonResult.setData("haha");
        return jsonResult;
    }
}
