/**
 * Created by sergiy.buchkovskyy on 10.09.2016.
 */
class Calc2 {

    public int[][] swapMetodOne(int[][] dataArray) {

        int a;

        for (int i = 0; i < dataArray.length; i++){
            a = dataArray[i][0];
            dataArray[i][0] = dataArray[i][1];
            dataArray[i][1] = a;
        }

        return dataArray;
    }
}
