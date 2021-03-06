package com.xuantuo.portal.web;

import com.xuantuo.log.SystemControllerLog;
import com.xuantuo.log.SystemLogAspect;
import com.xuantuo.portal.biz.EntFileService;
import com.xuantuo.portal.dto.BaseContentDTO;
import com.xuantuo.portal.result.JsonResult;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/5
 **/
@Controller
@RequestMapping("/")
public class HelloController {

    @Resource
    EntFileService entFileService;

    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    @ResponseBody
    @SystemControllerLog
    public JsonResult sayHi(String query) {
        LOG.info("HelloController#sayHi");
        JsonResult jsonResult = JsonResult.newResult();
        jsonResult.setData(query);
        jsonResult.setErrMsg(entFileService.getStr());
        return jsonResult;
    }

    @RequestMapping("/getContent/{appKey}/{contentId}")
    @ResponseBody
    @SystemControllerLog
    public JsonResult<BaseContentDTO> getContent(@PathVariable(value = "contentId") long contentId, @PathVariable(value = "appKey") String appKey) {
        LOG.info("HelloController#getContent");
        JsonResult<BaseContentDTO> r = new JsonResult<>();
        r.setErrCode(String.valueOf(contentId) );
        r.setErrMsg(appKey);
        r.setSuccess(true);

        return r;
    }


    @RequestMapping("/view1/{key1}/{key2}")
    public ModelAndView view1(@PathVariable(value = "key1") String key1, @PathVariable(value = "key2") String key2) {

        ModelAndView modelAndView = new ModelAndView("view1");

        modelAndView.addObject("key1",key1);
        modelAndView.addObject("key2",key2);

        return modelAndView;
    }


}
