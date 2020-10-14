package com.configs;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//类似于<beans></beans>，标记该类是一个配置类
@Configuration
public class MyBatisPlusConfig {
    @Bean
    public OptimisticLockerInterceptor  optimisticLockerInterceptor(){
        return new OptimisticLockerInterceptor();
    }
}
