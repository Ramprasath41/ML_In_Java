import java.util.Arrays;

class LinearRegression{
    private double[] independentVariable;
    private double[] dependentVariable;
    private int n;
    private double sumOfX;
    private double sumOfY;
    private double[] productOfVariables;
    private double sumOfProd;
    private double sumOfXSquare;


    LinearRegression(double[] independentVariable, double[] dependentVariable){
        if (independentVariable.length != dependentVariable.length) {
            throw new IllegalArgumentException(
                    "Arrays must have the same length");
        }
        this.n = independentVariable.length;
        this.independentVariable = independentVariable;
        this.dependentVariable = dependentVariable;
        calculations();
    }

    private double calculateSlope(){
        double slope =0;
        double numerator = (n*sumOfProd) - (sumOfX*sumOfY);
        double denominator = (n*sumOfXSquare) - Math.pow(sumOfX,2);
        return numerator / denominator;
    }

    private double calculateIntercept(){
        double slope = calculateSlope();
        return (sumOfY - slope * sumOfX) / n;
    }


    private void calculations(){

        this.sumOfX = Arrays.stream(independentVariable).sum();
        this.sumOfY = Arrays.stream(dependentVariable).sum();

        this.productOfVariables = new double[n];
        for(int i = 0;i<n;i++){
            productOfVariables[i] = independentVariable[i] * dependentVariable[i];
        }

        this.sumOfProd = Arrays.stream(productOfVariables).sum();

        double sumOfXSquare = 0;
        for(double x : independentVariable) {
            sumOfXSquare += x*x;
        }

        this.sumOfXSquare = sumOfXSquare;
    }

    public double getIntercept(){
        return calculateIntercept();
    }
    public double getSlope(){
        return calculateSlope();
    }
}