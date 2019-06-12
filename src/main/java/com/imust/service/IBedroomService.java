package com.imust.service;

import com.imust.domain.BedRoom;
import com.imust.domain.Room;

public interface IBedroomService {

    /**
     * 添加6个床位
     * @param room
     * @param bedRoom
     */
    void addBedroom(Room room, BedRoom bedRoom);
}