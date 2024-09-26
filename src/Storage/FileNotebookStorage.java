package Storage;

import Model.Note;
import Storage.NotebookStorage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileNotebookStorage implements NotebookStorage {

    private String filePath;

    public FileNotebookStorage(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void save(List<Note> notes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(notes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Note> load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<Note>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}