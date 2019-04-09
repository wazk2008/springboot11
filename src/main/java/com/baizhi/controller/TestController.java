package com.baizhi.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.baizhi.entity.Company;
import com.baizhi.entity.Group;
import com.baizhi.entity.Manager;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("test")
@RestController
public class TestController{

    @RequestMapping("test")
    public void test(HttpServletResponse response, HttpServletRequest request){
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition","attachment;fileName=company.xls");

        List<Company> list = new ArrayList<>();

        String realPath = request.getSession().getServletContext().getRealPath("/");

        for (int i = 0; i <10 ; i++) {
            Company company = new Company(i + "", "公司" + i, "北京市",new Date(),realPath+"1.png");
            list.add(company);
        }

        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("公司集合", "测试"), Company.class, list);
        try {
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("test1")
    public void test1(HttpServletRequest request,HttpServletResponse response){
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition","attachment;fileName=company.xls");
        String realPath = request.getSession().getServletContext().getRealPath("/");

        List<Group> list = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            Group group = new Group();
            group.setId(i+"");
            group.setName("恒大集团"+i);
            List<Company> companies = new ArrayList<>();
            for (int j = 0; j <3 ; j++) {
                Company company = new Company(j + "", "公司" + j, "北京市",new Date(),realPath+"1.png");
                companies.add(company);
            }
            group.setCompanies(companies);
            Manager manager = new Manager("许家印");
            group.setManager(manager);
            list.add(group);
        }
        System.out.println("-----------");
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("所有集团", "测试"), Group.class, list);
        try {
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
