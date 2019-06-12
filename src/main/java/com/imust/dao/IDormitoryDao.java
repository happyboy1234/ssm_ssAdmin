package com.imust.dao;

import com.imust.domain.Dormitory;

import java.util.List;

public interface IDormitoryDao {

    /**
     * 添加宿舍楼
     * @param dormitory
     */
    void addDormitory(Dormitory dormitory);


    /**
     * 查询所有宿舍楼
     * @return
     */
    List<Dormitory> findDormitoryList();

    /**
     * 根据id查询
     * @param dorId
     * @return
     */
    Dormitory findDormitoryListById(Integer dorId);

    /**
     * 更新宿舍楼信息
     * @param dormitory
     */
    void updateDormitory(Dormitory dormitory);

    /**
     * 根据id删除
     * @param i
     */
    void deleteDormitoryById(int i);
}
