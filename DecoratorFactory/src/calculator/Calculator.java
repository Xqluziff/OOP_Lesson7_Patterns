package calculator;

public final class Calculator implements Calculable {

    private float primaryArg;

    public Calculator(float primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(float arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable multi(float arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public float getResult() {
        return primaryArg;
    }
}
