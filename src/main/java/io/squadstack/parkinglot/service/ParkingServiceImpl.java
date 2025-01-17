/**
 * @author AbsolutelySaurabh
 */
package io.squadstack.parkinglot.service;

import io.squadstack.parkinglot.constants.Constant;
import io.squadstack.parkinglot.manager.ParkingManager;
import io.squadstack.parkinglot.manager.ParkingManagerImpl;
import io.squadstack.parkinglot.model.Vehicle;

import java.util.List;

public class ParkingServiceImpl implements ParkingService {

    private ParkingManager parkingDataManager;

    public void createParkingLot(int capacity) {
        if (parkingDataManager != null) {
            //paring already exisst;
            return;
        }
        this.parkingDataManager = ParkingManagerImpl.getInstance(capacity);
        System.out.println("Created parking of " + capacity + " slots");
    }

    public int park(Vehicle vehicle) {
        if (parkingDataManager == null) {
            return Constant.NOT_AVAILABLE;
        }
        int parkedSlot = parkingDataManager.parkCar(vehicle);
        System.out.println("Car with vehicle registration number " + '"' + vehicle.getRegistrationNo() + '"' + " has been parked at slot number " + parkedSlot);
        return parkedSlot;
    }

    public void unPark(int slotNo) {
        if (parkingDataManager == null) {
            return;
        }
        Vehicle vehicle = parkingDataManager.leaveCar(slotNo);
        if(vehicle == null){
            System.out.println(Constant.NULL);
            return;
        }
        System.out.println("Slot number 2 vacated, the car with vehicle registration number " + '"' + vehicle.getRegistrationNo() + '"' + " left the space, the driver of the car was of age " + vehicle.getDriverAge());

    }

    public void getRegNosForAge(int age) {
        if (parkingDataManager == null) {
            return;
        }
        List<String> regNos = parkingDataManager.getRegNosForAge(age);
        if (regNos.size() == 0) {
            System.out.println(Constant.NULL);
            return;
        }
        for (int i = 0; i < regNos.size(); i++) {
            if (i == regNos.size() - 1) {
                System.out.print(regNos.get(i));
            } else {
                System.out.print(regNos.get(i) + ",");

            }
        }
    }

    public void getSlotNosForAge(int age) {
        if (parkingDataManager == null) {
            return;
        }
        List<Integer> slots = parkingDataManager.getSlotNosForAge(age);
        if (slots.size() == 0) {
            System.out.println(Constant.NULL);
            return;
        }
        for (int i = 0; i < slots.size(); i++) {
            if (i == slots.size() - 1) {
                System.out.print(slots.get(i));
            } else {
                System.out.print(slots.get(i) + ",");

            }
        }
        System.out.println();
    }

    public void getSlotNoForRegNo(String regNo) {
        if (parkingDataManager == null) {
            return;
        }
        int slotNo = parkingDataManager.getSlotNoForRegNo(regNo);
        if(slotNo == Constant.NOT_FOUND){
            System.out.println("Car with Registration Number " + regNo + " Not found.");
        }else {
            System.out.println(slotNo);
        }
    }

    public void flush() {
        if (parkingDataManager == null) {
            return;
        }
        parkingDataManager.flush();
    }
}
