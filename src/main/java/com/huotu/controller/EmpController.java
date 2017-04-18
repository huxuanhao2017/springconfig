package com.huotu.controller;

import com.huotu.entity.Emp;
import com.huotu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by huxuanhao on 2017-04-14.
 */
@RequestMapping("/emp")
@Controller
public class EmpController {

    @Autowired
    private EmpService empService;
    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping("/add")
    public ModelAndView addEmp() {
        ModelAndView m = new ModelAndView("/addEmp");
        return m;
    }

    /**
     * 添加员工信息
     * @param emp
     * @return
     */
    @RequestMapping("/addEmp")
    public String add(Emp emp,Integer departmentId){
        empService.addEmp(emp,departmentId);
        return "redirect:/emp/login";
    }

    /**
     * 删除员工信息
     * @param id
     * @return
     */
    @RequestMapping("/del")
    public String delEmp(Integer id){
        empService.delEmp(id);
        return "redirect:/emp/login";
    }

    /**
     * 显示所有员工信息
     * @return
     */
    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView m = new ModelAndView("/show");
        m.addObject("emps",empService.findAll());
        return m;
    }

    /**
     * 跳转到修改页面
     * @param id
     * @return
     */
    @RequestMapping("/update")
    public ModelAndView update(Integer id){
        ModelAndView m = new ModelAndView("/update");
        m.addObject("emp",empService.getEmp(id));
        return m;
    }

    /**
     * 修改员工信息
     * @param emp
     * @return
     */
    @RequestMapping("/modify")
    public String modify(Emp emp,Integer departmentId){
      empService.addEmp(emp,departmentId);
        return "redirect:/emp/login";
    }

    /**
     * 根据姓名查询员工
     * @param name
     * @return
     */
    @RequestMapping("/select")
    public ModelAndView select(String name){
        ModelAndView m = new ModelAndView("/show");
        m.addObject("emps",empService.findByName(name));
        return m;
    }
}
