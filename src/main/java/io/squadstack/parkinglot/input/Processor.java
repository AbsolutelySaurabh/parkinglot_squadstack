/**
 * @author AbsolutelySaurabh
 */
package io.squadstack.parkinglot.input;

import io.squadstack.parkinglot.service.ParkingService;

public interface Processor {
    public void setService(ParkingService parkingService);
    public void execute(String input);
}
