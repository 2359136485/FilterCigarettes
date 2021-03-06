package com.tsx.controller;


import com.tsx.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sun.net.idn.Punycode;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: tsx
 * @Date: 2021/3/8 - 03 - 08 - 11:52 上午
 * @Description: com.tsx.controller
 * @version: 1.0
 */
@Controller
public class testContorller {
    @RequestMapping("hello")
    public String test(Model model){
        int a=10;
        model.addAttribute("a",a);
        return "hello";
    }
    @RequestMapping("index")
    public String test1(Model model){
        model.addAttribute("tsx","h<br>j<br>k<br>l");
        Map<String,Object> map=new HashMap<>();
        map.put("thText","th:text设置文本内容 <b>加粗</b>");
        map.put("thUText","th:utext 设置文本内容 <b>加粗</b>");
        map.put("thValue","thValue 设置当前元素的value值");
        map.put("thEach","Arrays.asList(\"th:each\", \"遍历列表\")");
        map.put("thIf","msg is not null");
        map.put("thObject",new Person("zhangsan",12,"男"));
       model.addAllAttributes(map);
        return "index";
    }
    @RequestMapping("method")
    public String test2(ModelMap map){
        map.put("Str", "Blog");
        map.put("Bool", true);
        map.put("Array", new Integer[]{1,2,3,4});
        map.put("List", Arrays.asList(1,3,2,4,0));
        Map hashMap = new HashMap();
        hashMap.put("thName", "${#...}");
        hashMap.put("desc", "变量表达式内置方法");
        map.put("Map", hashMap);
        map.put("Date", new Date());
        map.put("Num", 888.888D);
        return "method";
    }
    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
