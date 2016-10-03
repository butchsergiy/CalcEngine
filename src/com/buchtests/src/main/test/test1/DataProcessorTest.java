package test1;

import com.sun.org.apache.bcel.internal.ExceptionConstants;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.*;

/**
 * Created by BSV on 16.09.2016.
 */
public class DataProcessorTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void initDataArray() throws Exception {
        int a=10;
        int b=2;
        DataProcessor dp = new DataProcessor(a,b);
        dp.initDataArray();
        assertEquals("Element [][] == 0. But must be not 0. ", true,
                dp.getElement(0,0)!=0);
    }


    /* Catch exception method 1*/
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void initDataArrayWithException() throws Exception {
        int a=10;
        int b=2;
        DataProcessor dp = new DataProcessor(a,b);
        dp.getElement(a+1, b+1);
    }


    /* Catch exception method 2
    This is a bit old school, widely used in JUnit 3. Test the exception type and also the exception detail.
     fail(); //remember this line, else 'may' false positive
    */
    @Test
    public void initDataArrayWithException2() throws Exception {
        int a=10;
        int b=2;
        DataProcessor dp = new DataProcessor(a,b);
        try {
            dp.getElement(a + 1, b + 1);
            fail();
        }catch(ArrayIndexOutOfBoundsException e){
            assertThat(e.getMessage(), is("11"));
        }
    }


    /* Catch exception method 3
     This ExpectedException rule (since JUnit 4.7) let you test both the exception type and also the exception detail
    But can take too much time
    */
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void initDataArrayWithException3() throws Exception {
        int a=10;
        int b=2;
        DataProcessor dp = new DataProcessor(a,b);
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        thrown.expectMessage(containsString("11"));
        dp.getElement(a+1, b+1);
    }


    @Test
    public void getElement() throws Exception {
        DataProcessor dp = new DataProcessor(10,2);
        dp.initDataArray();
        assertEquals("Element [0][0] is equal to 0",true,(dp.getElement(0,0) != 0 ));
    }


    @Test
    public void swapMethodA() throws Exception {
        DataProcessor dp = new DataProcessor(10,2);
        dp.initDataArray();
        int a = dp.getElement(1,0);
        int b = dp.getElement(1,1);
        dp.swapMethodA();
//        assertEquals("Something wrong with swap method",false,(a== dp.getElement(1,1) && b==dp.getElement(1,0)));
        assertEquals("Something wrong with swap method",""+a+","+b,"" + dp.getElement(1,1) + "," + dp.getElement(1,0));
    }


    @Test
    public void swapMethodB() throws Exception {
        DataProcessor dp = new DataProcessor(10,2);
        dp.initDataArray();
        int a = dp.getElement(1,0);
        int b = dp.getElement(1,1);
        dp.swapMethodB();
        assertEquals("Something wrong with swap method",true,(a== dp.getElement(1,1) && b==dp.getElement(1,0)));
    }


    @Test
    public void printArrayPair() throws Exception {
        DataProcessor dp = new DataProcessor(10,2);
        dp.initDataArray();

    }
}