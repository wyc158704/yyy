package com.beans;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "myuser")
public class MyUser {



    @TableId(value="id",type = IdType.ASSIGN_UUID)
    private Integer id;
    @TableField(value="username")
    private String username;
    private String userpwd;
    @TableField(exist=false)
    private int age;

    //该字段会在添加时被mybatis-plus填充
    @TableField(fill= FieldFill.INSERT)
    private Date createTime;
    //该字段会在添加和更新时被mybatis-plus填充
    @TableField(fill= FieldFill.INSERT_UPDATE)
    private Date updateTime;

   @Version
    private Integer version;



}
