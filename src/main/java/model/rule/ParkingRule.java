/**
 * @author AbsolutelySaurabh
 */
package model.rule;

public interface ParkingRule {
    public void addSlot(int slotNo);
    public int getSlot();
    public void removeSlot(int slot);
}
