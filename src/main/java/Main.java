import input.Processor;
import input.ProcessorImpl;
import service.ParkingServiceImpl;

/**
 * @author AbsolutelySaurabh
 */

public class Main {

    public static void main(String[] args) {
        Processor processor = new ProcessorImpl();
        processor.setService(new ParkingServiceImpl());
        
    }


}
