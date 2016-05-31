package sample;

/**
 * Created by jamesyburr on 5/31/16.
 */
public class ToDoItem {
    String text;
    boolean isDone;

    public ToDoItem(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "text='" + text + '\'' +
                ", isDone=" + isDone +
                '}';
    }
}
