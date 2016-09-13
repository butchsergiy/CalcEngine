import org.apache.log4j.Logger;
import org.perf4j.log4j.Log4JStopWatch;

public class Main {

    public static void main(String[] args) {

        final Logger logger = Logger.getLogger("dfdfsd");

        // SWAP two digits

        DataProcessor data1 = new DataProcessor(10000000, 2);
        DataProcessor data2 = new DataProcessor(10000000, 2);
        data1.initDataArray();
        data2.initDataArray();

        System.out.printf("Before swapping \tdataArray[0][0]= %d, \tdataArray[0][1]= %d %n", data1.getElement(0,0), data1.getElement(0,1));         // %n - new line   // %d - decimal integer
        System.out.printf("Before swapping \tdataArray[100][0]= %d, \tdataArray[100][1]= %d %n", data1.getElement(100,0), data1.getElement(100,1));         // %n - new line   // %d - decimal integer
        Log4JStopWatch sw1 = new Log4JStopWatch("MyLogger1");
        data1.swapMethodA();
        data1.swapMethodA();
        sw1.stop();
        System.out.printf("After swapping \tdataArray1[0][0]= %d, \tdataArray1[0][1]= %d %n", data1.getElement(0,0), data1.getElement(0,1));         // %n - new line   // %d - decimal integer
        System.out.printf("After swapping \tdataArray[100][0]= %d, \tdataArray[100][1]= %d %n", data1.getElement(100,0), data1.getElement(100,1));         // %n - new line   // %d - decimal integer


        System.out.printf("\nBefore swapping \tdataArray[0][0]= %d, \tdataArray[0][1]= %d %n", data2.getElement(0,0), data2.getElement(0,1));         // %n - new line   // %d - decimal integer
        System.out.printf("Before swapping \tdataArray[100][0]= %d, \tdataArray[100][1]= %d %n", data2.getElement(100,0), data2.getElement(100,1));         // %n - new line   // %d - decimal integer
        Log4JStopWatch sw2 = new Log4JStopWatch("MyLogger2");
        data2.swapMethodB();
        data2.swapMethodB();
        sw2.stop();
        System.out.printf("After swapping \tdataArray2[0][0]= %d, \tdataArray2[0][1]= %d %n", data2.getElement(0,0), data2.getElement(0,1));         // %n - new line   // %d - decimal integer
        System.out.printf("After swapping \tdataArray2[100][0]= %d, \tdataArray2[100][1]= %d %n", data2.getElement(100,0), data2.getElement(100,1));         // %n - new line   // %d - decimal integer

        //        sw.lap("second swap method");


    }
}
