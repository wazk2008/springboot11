package com.baizhi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class Manager {
    @Excel(name = "董事长",needMerge = true)
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public Manager() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
