/**
 * @author AbsolutelySaurabh
 */
package manager;

import model.Vehicle;

import java.util.List;

public interface ParkingManager {

    public int parkCar(Vehicle vehicle);
    public Vehicle leaveCar(int slotNo);
    public List<String> getRegNosForAge(int age);
    public List<Integer> getSlotNosForAge(int age);
    public int getSlotNoForRegNo(int regNo);
    public void flush();

}
