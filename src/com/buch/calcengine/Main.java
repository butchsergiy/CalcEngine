import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // SWAP two digits

        int [][] dataArray =  new int[10][2];
        int [][] dataArray1 =  new int[100][2];
        int [][] dataArray2 =  new int[100][2];

        dataArray = fillArray(dataArray);
        dataArray1 = dataArray.clone();
//        dataArray1 = Arrays.copyOf(dataArray, dataArray.length);
        dataArray2 = Arrays.copyOf(dataArray, dataArray.length);

        System.out.println(dataArray + "\t" + dataArray[0].toString());
        System.out.println(dataArray1);
        System.out.println(dataArray2);



        Calc1 calc1 = new Calc1();
        Calc2 calc2 = new Calc2();

        System.out.printf("Before swapping \tdataArray[0][0]= %d, \tdataArray[0][1]= %d %n", dataArray[0][0], dataArray[0][1]);         // %n - new line   // %d - decimal integer
        dataArray1 = calc1.swapMetodOne(dataArray1);
        System.out.printf("Before swapping \tdataArray1[0][0]= %d, \tdataArray1[0][1]= %d %n", dataArray1[0][0], dataArray1[0][1]);         // %n - new line   // %d - decimal integer


        System.out.printf("\nBefore swapping \tdataArray[0][0]= %d, \tdataArray[0][1]= %d %n", dataArray[0][0], dataArray[0][1]);         // %n - new line   // %d - decimal integer
        dataArray2 = calc2.swapMetodOne(dataArray2);
        System.out.printf("Before swapping \tdataArray2[0][0]= %d, \tdataArray2[0][1]= %d %n", dataArray2[0][0], dataArray2[0][1]);         // %n - new line   // %d - decimal integer




    }

    private static int[][] fillArray(int[][] array){

        for (int i=0; i <array.length; i++){
            array[i][0] = (int)(Math.random()*100);
            array[i][1] = (int)(Math.random()*100)+100;
        }
        return array;
    }

}
