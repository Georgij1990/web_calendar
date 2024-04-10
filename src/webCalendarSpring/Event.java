package webCalendarSpring;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class Event {
    private String message;
    @NotNull
    @NotEmpty
    @NotBlank
    private String event;
    @NotNull
    private LocalDate date;

    public Event() {
        this.message = "The event has been added!";
    }

    public Event(String event, LocalDate date) {
        this();
        this.event = event;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
                "message='" + message + '\'' +
                ", event='" + event + '\'' +
                ", date=" + date +
                '}';
    }
}
