/**
 * @author AbsolutelySaurabh
 */
package input;

import service.ParkingService;

public interface Processor {
    public void setService(ParkingService parkingService);
    public void execute(String input);
}
