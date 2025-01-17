/**
 * @author AbsolutelySaurabh
 */
package io.squadstack.parkinglot.service;

import io.squadstack.parkinglot.model.Vehicle;

public interface ParkingService {

    public void createParkingLot(int capacity);

    public int park(Vehicle vehicle);

    public void unPark(int slotNo);

    public void getRegNosForAge(int age);

    public void getSlotNosForAge(int age);

    public void getSlotNoForRegNo(String regNo);

    public void flush();
}
