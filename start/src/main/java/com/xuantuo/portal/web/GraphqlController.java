package com.xuantuo.portal.web;

import com.xuantuo.portal.result.JsonResult;
import graphql.ExecutionResult;
import graphql.GraphQL;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/5/14
 **/
@Controller
@RequestMapping("/graphql")
public class GraphqlController {

    @Resource
    GraphQL graphQL;

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult test1(String query) {

        ExecutionResult execute = graphQL.execute("{\n" +
                "  bookById(id: \"book-1\"){\n" +
                "    id\n" +
                "    name\n" +
                "    pageCount\n" +
                "    author {\n" +
                "      firstName\n" +
                "      lastName\n" +
                "    }\n" +
                "  }\n" +
                "}");

        JsonResult jsonResult = JsonResult.newResult();
        jsonResult.setData(execute.getData());

        return jsonResult;
    }


    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult test2(String query) {

        ExecutionResult execute = graphQL.execute("{\n" +
                "  bookById(id: \"book-2\"){\n" +
                "    id\n" +
                "    name\n" +
                "    author {\n" +
                "      firstName\n" +
                "      lastName\n" +
                "    }\n" +
                "  }\n" +
                "}");

        JsonResult jsonResult = JsonResult.newResult();
        jsonResult.setData(execute.getData());

        return jsonResult;
    }

    @RequestMapping(value = "/test3", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult test3(String query) {

        ExecutionResult execute = graphQL.execute("{\n" +
                "  bookById(id: \"book-3\"){\n" +
                "    id\n" +
                "    name\n" +
                "  }\n" +
                "}");

        JsonResult jsonResult = JsonResult.newResult();
        jsonResult.setData(execute.getData());

        return jsonResult;
    }

}
