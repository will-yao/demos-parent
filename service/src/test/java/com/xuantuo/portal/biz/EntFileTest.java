package com.xuantuo.portal.biz;

import org.junit.Test;

import javax.annotation.Resource;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/5
 **/
public class EntFileTest extends BaseTest {

    @Resource
    EntFileService entFileService;


    @Test
    public void test1() {
        System.out.println(entFileService.getStr());
    }

}
