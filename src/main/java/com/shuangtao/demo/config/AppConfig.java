package com.shuangtao.demo.config;

import com.shuangtao.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //将方法的返回值添加到容器中
    @Bean
    public HelloService helloService(){
        System.out.println("配置类给容器中添加组件了");
            return new HelloService();
    }
}
