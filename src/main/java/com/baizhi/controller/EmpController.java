package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("emp")
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("selectAllEmp")
    public List<Emp> selectAllEmp(){
        System.out.println("empController");
        List<Emp> emps = empService.selectAllEmp();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
        return emps;
    }

}
