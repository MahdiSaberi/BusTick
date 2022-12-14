package ir.bustick.entity.loc;

import jakarta.persistence.Embeddable;

@Embeddable
public class TimeAPI {

    private String hour;

    private String minute;

    public TimeAPI() {
    }

    public TimeAPI(String hour, String minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }
}
