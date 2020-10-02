/**
 * @author AbsolutelySaurabh
 */
package input;

import service.ParkingService;

public class ProcessorImpl implements Processor {
    private ParkingService parkingService;
    public void setService(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    public void execute(String input) {

        //execute input

    }
}
