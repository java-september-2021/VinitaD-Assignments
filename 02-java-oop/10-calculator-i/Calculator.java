public class Calculator {
    private double operandOne;
    private double operandTwo;
    private double results;
    private char operator;
    
    //constructor
    public Calculator () {

    }
    public Calculator (double num1, double num2 ) {
        this.operandOne = num1;
        this.operandTwo = num2;

    }
    // setter 
    public void setOperandOne(double num) {
        this.operandOne = num;
    }
    public void setOperandTwo(double num) {
        this.operandTwo = num;
    }
    public void setOperator(char num) {
        this.operator = num;
    }
    //methods
    public void performOperation() {
        if (this.operator == '+') {
            results = operandOne + operandTwo;
        }
        if (this.operator == '-') {
            results = operandOne - operandTwo;
        }
    }
    public double getResult() {
        return this.results;
    }

}
