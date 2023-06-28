package calculator;

public class LogCalculable implements Calculable{
    private Calculable calculable;
    Logger logger;

    public LogCalculable(Calculable calculable, Logger logger) {
        this.calculable = calculable;
        this.logger = logger;
        logger.writeLog("1 аргумент " + calculable.getResult());
    }

    @Override
    public Calculable sum(float arg) {
    logger.writeLog("2 аргумент суммы " + arg);
        return calculable.sum(arg);
    }

    @Override
    public Calculable multi(float arg) {
        logger.writeLog("2 аргумент умножения " + arg);
        return calculable.multi(arg);
    }

    @Override
    public float getResult() {
        float result = calculable.getResult();
        logger.writeLog("Результат: " + result);
        return result;
    }
}
