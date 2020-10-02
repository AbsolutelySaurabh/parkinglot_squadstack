/**
 * @author AbsolutelySaurabh
 */
package service;

import constants.Constant;
import manager.ParkingManager;
import manager.ParkingManagerImpl;
import model.Vehicle;

public class ParkingServiceImpl implements ParkingService {

    private ParkingManager parkingDataManager;

    public void createParkingLot(int capacity) {
        if(parkingDataManager == null){
            //paring already exisst;
            return;
        }
        this.parkingDataManager = new ParkingManagerImpl(capacity);
        System.out.println("Created parking of " + capacity + " slots");
    }

    public int park(Vehicle vehicle) {
        if(parkingDataManager == null){
            return -1;
        }
        int parkedSlot = parkingDataManager.parkCar(vehicle);
        System.out.println("Car with vehicle registration number " + '"' +  vehicle.getRegistrationNo() + '"' + " has been parked at slot number " + parkedSlot);
        return 0;
    }

    public void unPark(int slotNo) {

    }

    public void getRegNosForAge(int age) {

    }

    public void getSlotNosForAge(int age) {

    }

    public void getSlotNoForRegNo(int regNo) {

    }

    public int getAvlSlotsCount() {
        return 0;
    }

    public void flush() {

    }
}
