public class Main {

    public static void main(String[] args) {

        // SWAP two digits

        int a = (int)(Math.random()*100);
        int b = (int)(Math.random()*100);

        System.out.printf("Before swapping \ta= %d, \tb= %d %n", a, b);         // %n - new line   // %d - decimal integer
        a+=(b - (b=a));
        System.out.printf("After swap \t\t\ta= %d, \tb= %d", a, b);

    }
}
