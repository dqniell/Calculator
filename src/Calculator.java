
public class Calculator {

    private double partOne;
    private double partTwo;


    public Calculator(double partOne, double partTwo) {
        this.partOne = partOne;
        this.partTwo = partTwo;
    }

    public double multiply() {
        double product = partOne * partTwo;
        return product;

    }

    public double divide() {
        double quotient = partOne / partTwo;
        return quotient;
    }

    public double add(){
        double sum = partOne + partTwo;
        return sum;
    }

    public double subtract(){
        double difference = partOne - partTwo;
        return difference;
    }

    public double mod(){
        double mod = partOne % partTwo;
        return mod;
    }

    public double exponent() {
        double exponent = Math.pow(partOne, partTwo);
        return exponent;
    }

}

