package com.huotu.controller;

import com.huotu.entity.Emp;
import com.huotu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String addEmp() {
        return "addEmp";
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
     *
     * @param model
     * @return
     */
    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("emps",empService.findAll());
        return "show";
    }

    /**
     * 跳转到修改页面
     * @param id
     * @return
     */
    @RequestMapping("/update")
    public String update(Integer id, Model model){
        model.addAttribute("emp",empService.getEmp(id));
        return "update";
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
     *
     * @param name
     * @param model
     * @return
     */
    @RequestMapping("/select")
    public String select(String name,Model model){
        model.addAttribute("emps",empService.findByName(name));
        System.out.print("===");
        return "show";
    }
}
