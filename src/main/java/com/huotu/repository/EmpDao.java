package com.huotu.repository;

import com.huotu.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by huxuanhao on 2017-04-14.
 */
public interface EmpDao extends JpaRepository<Emp,Integer>{
    public List<Emp> findByName(String name);
}
