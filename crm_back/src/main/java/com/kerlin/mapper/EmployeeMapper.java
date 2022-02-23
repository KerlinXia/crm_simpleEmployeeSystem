package com.kerlin.mapper;

import com.kerlin.domain.Employee;

import java.util.List;

public interface EmployeeMapper {
    /**
     * 保存员工信息
     * @param employee
     */
    void insert(Employee employee);

    /**
     * 删除员工信息
     */

    void delete(Long id);
    /***
     * 更新员工信息
     * @param employee
     */
    void update(Employee employee);

    /**
     * 查询单个信息
     * @param id
     * @return
     */
    Employee selectById(Long id);

    /**
     *查询总条数
     * @param
     * @return
     */
    int queryCount();


    List<Employee> selectAll();
}
