package com.cn.ltt;

import com.cn.ltt.bean.Aliyun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Application {
//    @Value("${Aliyun.appKey}")
//    private String appKey;
//    @Value("${Aliyun.appSecret}")
//    private String appSecret;
//    @Value("${Aliyun.bucket}")
//    private String bucket;
//    @Value("${Aliyun.endPoint}")
//    private String endPoint;
//    @Bean
//    public Aliyun aliyun(){
//        return Aliyun.options().setAppKey(appKey).setAppSecret(appSecret).setBucket(bucket).setEndPoint(endPoint).build();
//    }
//    @Autowired
//    private Aliyun aliyun;
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
