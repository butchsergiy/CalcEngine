import test1.SpeedTest;
import test2.CharTest;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

/*
SpeedTest about which method of swapping of two variables is faster
 */
        SpeedTest test1 = new SpeedTest();
        for (int i = 1; i < 10; i++)
            test1.run();

        System.out.println("Common last time for method A = " + test1.getMethodARunTimeMs() + " ms.");
        System.out.println("Common last time for method B = " + test1.getMethodBRunTimeMs() + " ms.");

/*
this about char type and how it can be set
 */
        CharTest test2 = new CharTest();
//        test2.run();


    }
}
