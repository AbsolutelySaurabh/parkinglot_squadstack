/**
 * @author AbsolutelySaurabh
 */
package io.squadstack.parkinglot.model.rule;

public interface ParkingRule {
    public void addSlot(int slotNo);
    public int getSlot();
    public void removeSlot(int slot);
}
