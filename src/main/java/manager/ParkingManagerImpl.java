/**
 * @author AbsolutelySaurabh
 */
package manager;

import model.Vehicle;
import model.rule.NearestParkingRule;
import model.rule.ParkingRule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingManagerImpl implements ParkingManager {

    private static ParkingManagerImpl instance;
    private static int capacity;
    private static ParkingRule parkingRule;
    private static Map<Integer, Vehicle> slotVechileMap;

    public static ParkingManagerImpl getInstance(int capacity){
        if(instance == null){
            synchronized (ParkingManagerImpl.class){
                if(instance == null){
                    instance = new ParkingManagerImpl(capacity);
                }
            }
        }
        return instance;
    }

    public ParkingManagerImpl(int capacity){
        this.capacity = capacity;
        this.parkingRule = new NearestParkingRule();
        this.slotVechileMap = new HashMap<Integer, Vehicle>();
        for(int i = 1; i<=capacity; i++){
            this.slotVechileMap.put(i, null);
            parkingRule.addSlot(i);
        }

    }

    public int parkCar(Vehicle vehicle) {
        return 0;
    }

    public boolean leaveCar(int slotNo) {
        return false;
    }

    public List<String> getRegNosForAge(int age) {
        return null;
    }

    public List<String> getSlotNosForAge(int age) {
        return null;
    }

    public int getSlotNoForRegNo(int regNo) {
        return 0;
    }

    public int getAvlSlotsCount() {
        return 0;
    }

    public List<String> getStatus() {
        return null;
    }

    public void flush() {

    }
}
