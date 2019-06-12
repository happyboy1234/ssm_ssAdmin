package com.imust.dao;

import com.imust.domain.PageBeanUI;
import com.imust.domain.Room;

import java.util.List;

public interface IRoomDao {
    /**
     * 查询所有宿舍
     * @param pageBeanUI
     * @return
     */
    List<Room> findRoomList(PageBeanUI pageBeanUI);

    /**
     * 添加宿舍信息
     * @param room
     */
    void addRoom(Room room);
}