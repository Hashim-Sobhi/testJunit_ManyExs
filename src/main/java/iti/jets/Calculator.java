package iti.jets;

public class Calculator {
    public static int add(int x, int y){
        return x+y;
    }
    public static int subtract(int x, int y){
        return x - y;
    }
    public static int multiply(int x, int y){
        return x*y;
    }
    public static double divide(int x, int y){
        if(y == 0){
            throw new IllegalArgumentException("devision by 0");
        }
        return x/y;
    }
}
