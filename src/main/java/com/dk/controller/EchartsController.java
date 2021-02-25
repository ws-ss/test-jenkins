package com.dk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Deacription TODO
 * @Author 王爽
 * @Date 2021/1/7 9:49
 * @Version 1.0
 **/
@Controller
@RequestMapping("echarts")
public class EchartsController {

    @RequestMapping("toEcharts")
    public String toEcharts(){
        return "echarts";
    }
    @RequestMapping("getData")
    @ResponseBody
    public Map<String,Object> getData(){
        Map<String,Object> map = new HashMap<>();
        String[] type = {"张三","李四","赵四","赵六","刘能"};
        int[] data = {20,15,45,35,25};
        int[] data2 = {23,12,43,34,64};
        map.put("type",type);
        map.put("data",data);
        map.put("data2",data2);
        return map;
    }
}
