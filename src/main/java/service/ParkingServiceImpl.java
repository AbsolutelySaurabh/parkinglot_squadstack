/**
 * @author AbsolutelySaurabh
 */
package service;

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
