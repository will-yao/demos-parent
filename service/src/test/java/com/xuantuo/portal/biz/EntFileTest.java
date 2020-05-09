package com.xuantuo.portal.biz;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/5
 **/
public class EntFileTest extends BaseTest {

    @Resource
    EntFileService entFileService;


    @Test
    public void test1() {
        //System.out.println(entFileService.getStr());
        Map map = Maps.newHashMap();
        map.put("1","1");
        map.put("2","1");
        System.out.println(JSON.toJSONString(map));
    }

}
