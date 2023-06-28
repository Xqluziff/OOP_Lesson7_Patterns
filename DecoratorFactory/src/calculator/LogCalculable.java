package calculator;

import java.time.LocalDateTime;

public class LogCalculable implements Calculable{
    private Calculable calculable;
    Logger logger;

    public LogCalculable(Calculable calculable, Logger logger) {
        this.calculable = calculable;
        this.logger = logger;
        logger.writeLog("============================\n" + LocalDateTime.now() + "\n" + calculable.getResult());
    }

    @Override
    public Calculable sum(float arg) {
    logger.writeLog(" + " + arg);
        return calculable.sum(arg);
    }

    @Override
    public Calculable diff(float arg) {
        logger.writeLog(" - " + arg);
        return calculable.diff(arg);
    }

    @Override
    public Calculable multi(float arg) {
        logger.writeLog(" * " + arg);
        return calculable.multi(arg);
    }

    @Override
    public float getResult() {
        float result = calculable.getResult();
        logger.writeLog(" = " + result + "\n");
        return result;
    }
}
