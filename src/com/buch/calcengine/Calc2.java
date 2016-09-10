/**
 * Created by sergiy.buchkovskyy on 10.09.2016.
 */
class Calc2 {

    public int[][] swapMetodOne(int[][] dataArray) {

        int a,b;

        for (int i = 0; i < dataArray.length; i++){
            a = dataArray[i][0];
            b = dataArray[i][1];
            a += (b - (b = a));
            dataArray[i][0] = a;
            dataArray[i][1] = b;
        }

        return dataArray;
    }
}
