/**
 * @author AbsolutelySaurabh
 */
package io.squadstack.parkinglot.model.rule;

import java.util.TreeSet;

public class NearestParkingRule implements ParkingRule {
    //set to maintain natural ordering of slots
    private TreeSet<Integer> freeSlots;

    public NearestParkingRule() {
        this.freeSlots = new TreeSet<Integer>();
    }

    public void addSlot(int slotNo) {
        this.freeSlots.add(slotNo);
    }

    public int getSlot() {
        //return the first lowest slot
        return this.freeSlots.first();
    }

    public void removeSlot(int slot) {
        this.freeSlots.remove(slot);
    }
}
