import java.util.*;
public class Test {
    public static void main(String[] args){
        double[] x = {1, 2, 3, 4, 5, 6, 7, 8};
        double[] y = {52, 55, 61, 66, 70, 74, 78, 83};

        LinearRegression lr = new LinearRegression(x, y);

        System.out.println("Slope = " + lr.getSlope());
        System.out.println("Intercept = " + lr.getIntercept());
    }
}