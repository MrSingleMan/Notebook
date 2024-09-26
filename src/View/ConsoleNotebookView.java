package View;

import Model.Note;
import View.NotebookView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ConsoleNotebookView implements NotebookView {

    private Scanner scanner = new Scanner(System.in);
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    @Override
    public void showNotes(List<Note> notes) {
        for (Note note : notes) {
            System.out.println(note);
        }
    }

    @Override
    public LocalDateTime getInputDateTime() {
        System.out.println("Введите дату и время (yyyy-MM-dd HH:mm):");
        String input = scanner.nextLine();
        return LocalDateTime.parse(input, dateTimeFormatter);
    }

    @Override
    public String getInputDescription() {
        System.out.println("Введите описание заметки:");
        return scanner.nextLine();
    }

    @Override
    public LocalDate getInputDate() {
        System.out.println("Введите дату (yyyy-MM-dd):");
        String input = scanner.nextLine();
        return LocalDate.parse(input);
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}