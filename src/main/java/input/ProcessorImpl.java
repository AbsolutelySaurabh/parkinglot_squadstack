/**
 * @author AbsolutelySaurabh
 */
package input;

import constants.Constant;
import model.Car;
import service.ParkingService;

public class ProcessorImpl implements Processor {
    private ParkingService parkingService;
    public void setService(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    public void execute(String input) {

        //execute input
        String inputs[] = input.split(" ");
        String key = inputs[0];
        if (Constant.CREATE_PARKING_LOT.equals(key)) {
            int capacity = Integer.parseInt(inputs[1]);
            parkingService.createParkingLot(capacity);
        } else if (Constant.PARK.equals(key)) {
            parkingService.park(new Car(inputs[1], Integer.parseInt(inputs[2])));
        } else if (Constant.LEAVE.equals(key)) {
            parkingService.unPark(Integer.parseInt(inputs[1]));
        } else if (Constant.SLOT_NUMBER_FOR_CAR_WITH_NUMBER.equals(key)) {
            parkingService.getSlotNoForRegNo(inputs[1]);
        } else if (Constant.SLOT_NUMBERS_FOR_DRIVER_OF_AGE.equals(key)) {
            parkingService.getSlotNosForAge(Integer.parseInt(inputs[1]));
        } else if (Constant.VEHICLE_REGISTRATION_NO_FOR_DRIVER_OF_AGE.equals(key)) {
            parkingService.getRegNosForAge(Integer.parseInt(inputs[1]));
        }

    }
}
