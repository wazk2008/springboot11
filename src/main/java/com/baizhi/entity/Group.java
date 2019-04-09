package com.baizhi.entity;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelIgnore;

import java.util.List;

public class Group {

    @ExcelIgnore
    private String id;

    @Excel(name = "集团名称",needMerge = true)
    private String name;

    @ExcelCollection(name = "公司",orderNum = "4")
    private List<Company> companies;

    @ExcelEntity()
    private Manager manager;

    public Group() {
    }

    public Group(String id, String name, List<Company> companies, Manager manager) {
        this.id = id;
        this.name = name;
        this.companies = companies;
        this.manager = manager;
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

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
