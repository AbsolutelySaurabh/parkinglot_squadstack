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
        if(parkingDataManager == null){
            return;
        }
        Vehicle vehicle = parkingDataManager.leaveCar(slotNo);
        System.out.println("Slot number 2 vacated, the car with vehicle registration number " + '"' + vehicle.getRegistrationNo() + '"' + " left the space, the driver of the car was of age " + vehicle.getDriverAge());

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
