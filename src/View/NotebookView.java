package View;

import Model.Note;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface NotebookView {
        void showNotes(List<Note> notes);
        LocalDateTime getInputDateTime();
        String getInputDescription();
        LocalDate getInputDate();
        void showMessage(String message);
}
