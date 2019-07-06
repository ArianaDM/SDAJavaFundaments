package ro.sda.java4.basic;

public class BasicsEx5 {
    public static void main(String[] args) {
        //*Sum two integer variables initialized with maximal values for that type

        int maxValue1 = Integer.MAX_VALUE, maxValue2=Integer.MAX_VALUE;

        System.out.println("Max integer:" + (maxValue1));
        System.out.println("Max integer+1:" + (maxValue1+1));
        System.out.println("Sum of 2 max integer:" + (maxValue1+maxValue2));
        System.out.println("Sum of 2 max integer with casting to long:" + (long)(maxValue1+maxValue2));
        System.out.println("Sum of 2 max integer with casting to long:" + ((long)maxValue1+maxValue2));
        byte maxByte = Byte.MAX_VALUE;
    }
}