import Model.Notebook;
import Presenter.NotebookPresenter;
import Storage.FileNotebookStorage;
import View.ConsoleNotebookView;
import View.NotebookView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        NotebookView view = new ConsoleNotebookView();
        NotebookPresenter presenter = new NotebookPresenter(notebook, view);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Добавить заметку");
            System.out.println("2. Показать заметки на день");
            System.out.println("3. Показать все заметки");
            System.out.println("4. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    presenter.addNote();
                    break;
                case 2:
                    presenter.showNotesForDay();
                    break;
                case 3:
                    presenter.showAllNotes();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Неправильная кнопка");
            }
        }
    }
}