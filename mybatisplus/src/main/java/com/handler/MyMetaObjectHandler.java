package com.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;

@Configuration
public class MyMetaObjectHandler implements MetaObjectHandler{

    //metaObject就是添加/修改传递的那个对象
    @Override
    public void insertFill(MetaObject metaObject) {
        //为该对象的createTime属性赋值当前新系统日期
        this.setFieldValByName("createTime", new Date(), metaObject);
        //为该对象的updateTime属性赋值当前新系统日期
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}
