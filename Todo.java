

public class Todo {
    private int id;
    private String title;
    private TodoStatus status;

    public Todo(int id, String title) {
        this.id = id;
        this.title = title;
        this.status= TodoStatus.TODO;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public int getId() {
        return this.id;
    }

    public TodoStatus getStatus() {
        return this.status;
    }

    public void markAsCompleted() {
        this.status = TodoStatus.DONE;
    }

    public void markAsNotCompleted() {
        this.status = TodoStatus.TODO;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + status.toString();
    }
}
