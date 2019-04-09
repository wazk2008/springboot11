package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp implements Serializable {
    private String id;
    private String name;
    private String sex;
    private String age;

//    将String类型转换为date
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    序列化，返回至前台
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date bir;
}
