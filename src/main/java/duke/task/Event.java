package duke.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * Event class define rules for Event object.
 * Event is a subclass of Task class.
 *
 * @author Galvin Leow Wen Yuan
 * @author A0200204J
 * @version v1.0
 */
public class Event extends Task {

    private final LocalDateTime at;
    private final LocalDateTime end;

    /**
     * Class constructor.
     * Initialises event class with description, isDone and time.
     *
     * @param description description of the event.
     * @param at          date and start of the event.
     * @param end         data and time end of the event.
     */
    public Event(String description, LocalDateTime at, LocalDateTime end) {
        super(description);
        this.at = at;
        this.end = end;
    }

    /**
     * Returns start date and time of the event object.
     *
     * @return localDateTime of start event.
     */
    public LocalDateTime getAt() {
        return at;
    }

    /**
     * Returns end date and time of the event object.
     *
     * @return localDateTime of start event.
     */
    public LocalDateTime getEnd() {
        return end;
    }

    /**
     * Checks if two object are equal.
     * If equal true, else false.
     *
     * @param o object to be compare.
     * @return true is same, false if different
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Event event = (Event) o;
        return Objects.equals(at, event.at) && Objects.equals(end, event.end);
    }

    /**
     * Returns summary of the event object.
     *
     * @return string to the event object.
     */
    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, dd/MMM/yyyy HHmm");
        return String.format(
                "[E]%s (at: %s till %s)", super.toString(), at.format(dtf), end.format(dtf));
    }
}
