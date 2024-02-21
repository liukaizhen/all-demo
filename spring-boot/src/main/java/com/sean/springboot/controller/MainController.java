package com.sean.springboot.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.sean.springboot.annotation.ReturnToken;
import com.sean.springboot.bean.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author sean
 */
@RestController
public class MainController {
    @Autowired
    private RestTemplate restTemplate;

    @NacosInjected
    private NamingService namingService;

    @GetMapping("/hello")
    public String hello(HttpServletResponse response){
        return restTemplate.getForObject("https://www.baidu.com", String.class);
    }

    @GetMapping( "/get")
    public List<Instance> get(@RequestParam String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }

    @GetMapping("/token")
    @ReturnToken
    public Result<String> token(){
        return Result.ok("hello","成功");
    }

    @GetMapping("/token2")
    @ReturnToken
    public String token2(){
        return "success";
    }
}
