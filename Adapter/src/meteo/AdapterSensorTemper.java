package meteo;

import java.time.LocalDateTime;

public class AdapterSensorTemper implements MeteoSensor {
    private SensorTemperature sensorTemperature;

    public AdapterSensorTemper(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)sensorTemperature.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        int day = sensorTemperature.day() - 1;
        int year = sensorTemperature.year();
        int second = sensorTemperature.second();
        return LocalDateTime.of(year,1,1,0,0).plusDays(day).plusSeconds(second);
    }
}
