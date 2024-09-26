package Model;

import java.time.LocalDateTime;

public class Note {
    private String description;
    private LocalDateTime dateTime;

    public Note(String description, LocalDateTime dateTime) {
        this.description = description;
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Note{" +
                "Заметка: '" + description + '\'' +
                ", Дата и время: " + dateTime +
                '}';
    }
}
