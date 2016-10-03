package test2;

/**
 * Created on 14.09.2016.
 */
public class CharTest {

    public void run() {

        char c1 = 064770;
//        char c2 = 'face';
        char c3 = 0xbeef;
//        char c4 = \u0022;
//        char c5 = '\iface';
        char c6 = '\uface';

        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c6);


        int idec = 10;
        int ihex = 0xa;
        int ibin = 0b1010;
        System.out.println("idec = %d, ihex(0xa) = %d, ibin(0b1010) = " );

    }
}
