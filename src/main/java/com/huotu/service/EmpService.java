package com.huotu.service;

import com.huotu.entity.Emp;

import java.util.List;

/**
 * Created by huxuanhao on 2017-04-14.
 */
public interface EmpService {
    public List<Emp> findAll();
    public void addEmp(Emp emp,Integer departmentId);
    public Emp getEmp(Integer id);
    public void delEmp(Integer id);
    public List<Emp> findByName(String name);
}
