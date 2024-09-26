package Storage;

import Model.Note;
import Presenter.NotebookPresenter;
import java.util.List;

public interface NotebookStorage {
    void save(List<Note> notes);
    List<Note> load();
}
