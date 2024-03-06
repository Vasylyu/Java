package org.live_after_java.adapter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface MeteoSensor {
    int getId();
    Float getTemperature();
    Float getHumidity();
    Float getPressure();
    LocalDateTime getDateTime();
}
