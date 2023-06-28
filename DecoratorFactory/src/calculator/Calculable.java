package calculator;

public interface Calculable {
    Calculable sum(float arg);
    Calculable diff(float arg);
    Calculable multi(float arg);
    float getResult();
}
