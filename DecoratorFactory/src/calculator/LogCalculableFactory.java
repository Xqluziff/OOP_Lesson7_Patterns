package calculator;

public class LogCalculableFactory implements ICalculableFactory{
    Logger logger;

    public LogCalculableFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(float primaryArg) {
        return new LogCalculable(new Calculator(primaryArg), logger);
    }
}
