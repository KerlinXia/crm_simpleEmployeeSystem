package com.kerlin.service;

import com.kerlin.domain.Employee;

import java.util.List;

public interface IEmployeeService {
    /**
     * 增加
     * @param employee
     */
    void insert(Employee employee);

    /**
     * 删除
     * @param id
     */
    void delete(Long id);

    /**
     * 修改
     * @param employee
     */
    void update(Employee employee);

    Employee selectById(Long id);

    List<Employee> selectAll();
}
