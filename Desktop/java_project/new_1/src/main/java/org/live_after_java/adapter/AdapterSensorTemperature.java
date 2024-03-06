package org.live_after_java.adapter;

import java.time.LocalDateTime;

public class AdapterSensorTemperature implements MeteoSensor{
    public AdapterSensorTemperature(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    SensorTemperature sensorTemperature;
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
        LocalDateTime localDateTime = LocalDateTime.of(sensorTemperature.year(),1,1,0,0);
        localDateTime = localDateTime.plusDays(sensorTemperature.day());
        localDateTime = localDateTime.plusSeconds(sensorTemperature.second());
        return localDateTime;
    }
}
