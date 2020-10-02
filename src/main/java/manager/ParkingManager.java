/**
 * @author AbsolutelySaurabh
 */
package manager;

import model.Vehicle;

import java.util.List;

public interface ParkingManager {

    public int parkCar(Vehicle vehicle);
    public boolean leaveCar(int slotNo);
    public List<String> getRegNosForAge(int age);
    public List<String> getSlotNosForAge(int age);
    public int getSlotNoForRegNo(int regNo);
    public int getAvlSlotsCount();
    public void flush();

}
