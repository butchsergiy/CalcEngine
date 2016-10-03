package test1;

/**
 * Created by BSV on 10.09.2016.
 */
class DataProcessor {

    private int[][] dataArray;

    private DataProcessor(){
    }

    public DataProcessor(int a, int b){
        this.dataArray = new int[a][b];
    }

    public void initDataArray(){
        for (int i=0; i <dataArray.length; i++){
            dataArray[i][0] = (int)(Math.random()*100);
            dataArray[i][1] = (int)(Math.random()*100)+100;
        }
    }

    public void swapMethodA() {
        int a;
        for (int i = 0; i < dataArray.length; i++){
            a = dataArray[i][0];
            dataArray[i][0] = dataArray[i][1];
            dataArray[i][1] = a;
        }
    }

    public void swapMethodB(){
        for (int i = 0; i < dataArray.length; i++){
//            To SWAP two vars
//            a += (b - (b = a));
            dataArray[i][0] += (dataArray[i][1] - (dataArray[i][1] = dataArray[i][0]));
        }
    }

    public void printArrayPair(String s, int a){
        System.out.printf(s + "dataArray[%d][0]= %d, \tdataArray[%d][1]= %d %n", a, dataArray[a][0], a, dataArray[a][1]);
    }

    public int getElement(int a, int b){
        return dataArray[a][b];
    }
}