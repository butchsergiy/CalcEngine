package test1;

import org.perf4j.log4j.Log4JStopWatch;


/**
 * Created by BSV on 13.09.2016.
 */
public class SpeedTest {

    private int methodARunTimeMs = 0;
    private int methodBRunTimeMs = 0;

    public void run() {

        // SWAP two digits
        Log4JStopWatch sw1, sw2;

        DataProcessor data1 = new DataProcessor(10000000, 2);
        DataProcessor data2 = new DataProcessor(10000000, 2);
        data1.initDataArray();
        data2.initDataArray();

        data1.printArrayPair("data1.before ", 10);
        sw1 = new Log4JStopWatch("MyLogger1. Swap method A.");
        data1.swapMethodA();
        sw1.stop();
        data1.printArrayPair("data1.after ", 10);

        System.out.println();

        data2.printArrayPair("data2.before ", 0);
        sw2 = new Log4JStopWatch("MyLogger2. Swap method B.");
        data2.swapMethodB();
        sw2.stop();
        data2.printArrayPair("data2.after ", 0);

        //        sw.lap("second swap method");

        System.out.println("**" + sw1.getTag() + " Time: " + sw1.getElapsedTime());
        System.out.println("**" + sw2.getTag() + " Time: " + sw2.getElapsedTime());
        System.out.println();

        methodARunTimeMs += (int) sw1.getElapsedTime();
        methodBRunTimeMs += (int) sw2.getElapsedTime();


    }

    public int getMethodARunTimeMs() {
        return methodARunTimeMs;
    }

    public int getMethodBRunTimeMs() {
        return methodBRunTimeMs;
    }
}
