package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class HelloController {
	
    @RequestMapping("/")
    public String index() {
        HashMap<String, String> dataMap = new HashMap<String, String>();
        dataMap.put("No.1", "女帝");
        dataMap.put("No.2", "罗宾");
        dataMap.put("No.3", "娜美");

        LinkedHashSet<String> dataSet = new LinkedHashSet<>();
        dataSet.add("海贼王");
        dataSet.add("火影忍者");
        dataSet.add("斗罗大陆");
        dataSet.add("吞噬星空");

        System.out.println(dataSet.toString());

        TreeSet<Integer> intSet = new TreeSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(4);
        intSet.add(8);

        System.out.println(intSet.toString());

        ConcurrentHashMap<String, String> comicMap = new ConcurrentHashMap<>();
        comicMap.put("No.1", "海贼王");
        comicMap.put("No.2", "火影忍者");
        comicMap.put("No.3", "斗罗大陆");
        comicMap.put("No.4", "吞噬星空");
        
        return dataMap.toString();
    }
}