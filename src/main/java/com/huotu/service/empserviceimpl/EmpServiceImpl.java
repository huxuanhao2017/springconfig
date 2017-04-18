package com.huotu.service.empserviceimpl;

import com.huotu.entity.Department;
import com.huotu.entity.Emp;
import com.huotu.repository.DepartmentDao;
import com.huotu.repository.EmpDao;
import com.huotu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by huxuanhao on 2017-04-14.
 */
@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;
    @Autowired
    private DepartmentDao departmentDao;
    /**
     * 查询所有的员工信息
     * @return
     */
    public List<Emp> findAll(){
        return empDao.findAll();
    };

    /**
     * 添加员工信息
     * @param emp
     */
    public void addEmp(Emp emp,Integer departmentId){
        Department d = departmentDao.findOne(departmentId);
        emp.setDepartment(d);
        empDao.save(emp);
    }

    /**
     * 根据id(主键)查询员工
     * @param id
     * @return
     */
    public Emp getEmp(Integer id){
        return empDao.findOne(id);
    }

    /**
     * 根据id(主键)删除员工
     * @param id
     */
    public void delEmp(Integer id){
        empDao.delete(id);
    }

    /**
     * 根据员工姓名查询
     * @param name
     * @return
     */
    public List<Emp> findByName(String name){
        return empDao.findByName(name);
    }
}
