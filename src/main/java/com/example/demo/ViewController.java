package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {
   @RequestMapping(value = "hello")
   @ResponseBody
   public String name() {
	   Map map=new HashMap<>();
	    map.put("adrrss", "中国");
	   return "callbackfunction({\"name\":\"wwwwwwwwwwww\"});";
}
   
    @RequestMapping("ceshi")
    @ResponseBody
    public String getceshi() {
    	return "cesshi";
    }
   
   
    
   
}
