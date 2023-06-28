package calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(float primaryArg) {
        return new Calculator(primaryArg);
    }
}
