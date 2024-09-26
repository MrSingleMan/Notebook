package Presenter;

import Model.Notebook;
import Model.Note;
import View.NotebookView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class NotebookPresenter {
    private Notebook notebook;
    private NotebookView view;

    public NotebookPresenter(Notebook notebook, NotebookView view) {
        this.notebook = notebook;
        this.view = view;
    }

    public void addNote() {
        LocalDateTime dateTime = view.getInputDateTime();
        String description = view.getInputDescription();
        notebook.addNote(new Note(description, dateTime));
        view.showMessage("Заметка добавлена");
    }

    public void showNotesForDay() {
        LocalDate date = view.getInputDate();
        List<Note> notes = notebook.getNotesForDay(date);
        view.showNotes(notes);
    }

    public void showAllNotes() {
        view.showNotes(notebook.getAllNotes());
    }
}
