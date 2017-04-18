package com.huotu.repository;

import com.huotu.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by huxuanhao on 2017-04-17.
 */
public interface DepartmentDao extends JpaRepository<Department,Integer> {
}
