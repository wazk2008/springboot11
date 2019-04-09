package com.baizhi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelIgnore;

import java.util.Date;

public class Company {

//    @Excel(name = "编号")
    @ExcelIgnore
    private String id;
    @Excel(name = "名称")
    private String name;
    @Excel(name = "地址")
    private String address;
    @Excel(name = "注册日期",exportFormat="yyyy-MM-dd HH:mm:ss",width = 30)
    private Date bir;
    @Excel(name = "logo",type = 2 ,width = 40 , height = 20,imageType = 1)
    private String logo;



    public Company() {
    }

    public Company(String id, String name, String address, Date bir, String logo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bir = bir;
        this.logo = logo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
