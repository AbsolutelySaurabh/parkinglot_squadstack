import constants.Constant;
import input.Processor;
import input.ProcessorImpl;
import service.ParkingServiceImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;

/**
 * @author AbsolutelySaurabh
 */

public class Main {

    public static void main(String[] args) {
        Processor processor = new ProcessorImpl();
        processor.setService(new ParkingServiceImpl());

        //file based io
        BufferedReader bufferReader = null;
        File inputFile = new File(args[0]);
        String input = null;
        try {
            bufferReader = new BufferedReader(new FileReader(inputFile));
            while ((input = bufferReader.readLine()) != null) {
                input = input.trim();
                processor.execute(input);
            }
        } catch (Exception e) {
            System.out.println(Constant.INVALID_REQUEST);
        }
    }
}
