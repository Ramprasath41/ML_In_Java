# ML_In_Java

A repository for building Machine Learning algorithms from scratch using Java, aiming to enhance the language's utility in the ML space.

## Implemented Algorithms

*   **Linear Regression:** A simple implementation to find the line of best fit for a given set of data points (x, y).

## Usage

This project demonstrates how to calculate the slope and intercept for a linear regression model.

### Example

The `Test.java` file provides a straightforward example of how to use the `LinearRegression` class.

First, define your independent (`x`) and dependent (`y`) variables as arrays of doubles. Then, create an instance of the `LinearRegression` class.

```java
import ml.LinearRegression;

public class Test {
    public static void main(String[] args){
        // Sample data points
        double[] x = {1, 2, 3, 4, 5, 6, 7, 8};
        double[] y = {52, 55, 61, 66, 70, 74, 78, 83};

        // Create a LinearRegression instance
        LinearRegression lr = new LinearRegression(x, y);

        // Retrieve and print the slope and intercept
        System.out.println("Slope = " + lr.getSlope());
        System.out.println("Intercept = " + lr.getIntercept());
    }
}
```

### How to Run

1.  Make sure your directory structure matches the repository:
    ```
    .
    ├── Test.java
    └── ml/
        └── LinearRegression.java
    ```

2.  Compile the Java files from the root directory:
    ```sh
    javac ml/LinearRegression.java Test.java
    ```

3.  Run the main test class:
    ```sh
    java Test
    ```

### Expected Output
```
Slope = 4.357142857142857
Intercept = 46.5
