class LinearRegression{
    private double[] independentVariable;
    private double[] dependentVariable;
    private int n;
    private double sumOfX;
    private double sumOfY;


    LinearRegression(double[] independentVariable, double[] dependentVariable){
        this.n = independentVariable.length();
        this.independentVariable = independentVariable;
        this.dependentVariable = dependentVariable;
        calculations();
    }

    private double calculateSlope(){
        double slope =0;
    }

    private double calculateIntercept(){
        double[] intercept = new intercept[n];
    }

    private double calculations(){
        this.sumOfX = Arrays.stream.(independentVariable).sum();
        this.sumOfY = Arrays.stream.(dependentVariable).sum();

    }
}